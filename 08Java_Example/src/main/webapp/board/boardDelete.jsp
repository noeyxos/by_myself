<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="example1230.domain.BoardVo" %>
<%
BoardVo bv =(BoardVo)request.getAttribute("bv");
%>
    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function check(){	

	var fm = document.frm;	
	if (fm.pwd.value == "" ){
		alert("비밀번호를 입력하세요");
		fm.pwd.focus();
		return;
	}
	var flag = confirm("삭제하시겠습니까?");	//flag 논리형변수값을 담는 객체
	
	if(flag ==false){
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
<form name= "frm">
<input type="hidden" name="bidx" value="<%=bv.getBidx() %>">
<table border=1 style="width:800px;">

<tr>
<td>제목</td>
<td><%=bv.getSubject() %></td>
</tr>

<tr>
<td>비밀번호</td>
<td><input type="password" name="pwd" style="width:90%;"></td>
</tr>
<tr><td colspan=2>
<input type="button" name="btn"  value="확인" onclick="check();">
</td></tr>
</table>
</form>
</body>
</html>