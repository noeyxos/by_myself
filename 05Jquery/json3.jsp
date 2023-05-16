<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String memberId = request.getParameter("memberId");
String idYn ="";
if(memberId==""){
	idYn ="N";		//사용불가
}else{
	idYn = "Y";		//사용가능
}


%>
{"idYn":"<%=idYn%>"}	