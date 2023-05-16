<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function check(){	

	var fm = document.frm;	
	if (fm.password.value == "" ){
		alert("비밀번호를 입력하세요");
		fm.password.focus();
		return;
	}
	
	fm.action = "<%=request.getContextPath()%>/board/boardDeleteAction.do";
	fm.method="post";
	fm.submit();
	return;
}


</script>


</head>
<body>
삭제페이지입니다
<table border=1 style="width:500px;">
<tr>
<td>비밀번호</td>
<td><input type="password" name="password"></td>
</tr>
<tr><td colspan=2>
<input type="button" name="btn"  value="확인" onclick="check();">
</td></tr>
</table>
</body>
</html>