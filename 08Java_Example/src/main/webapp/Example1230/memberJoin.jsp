<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(document).ready(function(){
		//자동실행영역
});
function check(){
	//alert("각 값이 있는지 체크하는 구문을 만들어보세요");	
	
	if ($("#memberId").val() == ""){
		alert("아이디를 입력하세요");
		$("#memberId").focus();
		return;
	}else if ($("#memberPwd").val() == ""){
		alert("비밀번호를 입력하세요");
		$("#memberPwd").focus();
		return;
	}else if ($("#memberPwd2").val() == ""){
		alert("비밀번호 확인을 입력하세요");
		$("#memberPwd2").focus();
		return;
	}else if ($("#memberPwd").val() != $("#memberPwd2").val()){
		alert("비밀번호가 일치하지 않습니다");
		$("#memberPwd2").val("");
		$("#memberPwd2").focus();
		return;
	}else if ($("#memberName").val() == ""){
		alert("이름을 입력하세요");
		$("#memberName").focus();
		return;
	}else if ($("#memberPhone").val() == ""){
		alert("전화번호를 입력하세요");
		$("#memberPhone").focus();
		return;
	}else if ($("#memberEmail").val() == ""){
		alert("이메일을 입력하세요");
		$("#memberEmail").focus();
		return;
	}else if ($("#memberBirth").val() == ""){
		alert("생년월일을 입력하세요");
		$("#memberBirth").focus();
		return;
	}else if ($.isNumeric($("#memberBirth").val())  ==false){
		alert("숫자만입력하세요");
		$("#memberBirth").val("");
		$("#memberBirth").focus();
		return;
	}else if ($("#memberIdCheck").val() != "Y"){
		alert("아이디 중복체크를 하세요");
		$("#memberId").focus();
		return;
	}	
	
	var fm = document.frm;
	//이 경로로 데이터를 감추어서 전송한다
	fm.action ="memberJoinAction.jsp";
	fm.method = "post";
	fm.submit();
	
	return;
}	

function idCheck(){
//	alert("아이디 체크창입니다.");	
	let memberId = $("#memberId").val();
	
	$.ajax({
		url: "json3.jsp",		
		method: "POST",
		data: {"memberId": memberId },
		dataType: "json",
		success : function(data){	
			if (data.idYn =="Y"){
				alert("사용가능한 아이디입니다.");
				$("#memberIdCheck").val("Y");
			}else{
				alert("사용불가한 아이디 입니다");
			}	
		},
		error : function(request,status,error){
			alert("다시 시도하시기 바랍니다.");		
		}		
	});	
	
	return;
}
</script>
</head>
<body>
회원가입 페이지
<form name="frm" id="frm">
<table style="border:1px solid #CCC;width:500px">
<tr>
<td>아이디</td>
<td>
<input type="text" name="memberId" id="memberId">
<input type="button"  id="memberIdCheck"" value="아이디 중복체크" onclick="idCheck();">
</td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="memberPwd" id="memberPwd"></td>
</tr>
<tr>
<td>비밀번호 확인</td>
<td><input type="password" name="memberPwd2" id="memberPwd2"></td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="memberName" id="memberName"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name="memberPhone" id="memberPhone"></td>
</tr>
<tr>
<td>이메일</td>
<td><input type="text" name="memberEmail" id="memberEmail"></td>
</tr>
<tr>
<td>성별</td>
<td>
<input type="radio" name="memberGender" id="memberMale"  value="남성" checked>남성
<input type="radio" name="memberGender" id="memberFeMale" value="여성">여성
</td>
</tr>
<tr>
<td>주소</td>
<td>
<select name="memberAddr" id="memberAddr">
<option value="서울">서울</option>
<option value="대전">대전</option>
<option value="전주"   selected>전주</option>
</select>
</td>
</tr>
<tr>
<td>생년월일</td>
<td>
<input type="text" name="memberBirth"  id="memberBirth">
(ex 19990101)
</td>
</tr>
<tr>
<td></td>
<td><input type="button" name="btn"  id="btn" value="확인" onclick="check();"></td>
</tr>
</table>
</form>
</body>
</html>