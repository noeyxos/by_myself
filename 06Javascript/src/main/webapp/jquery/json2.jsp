<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String memberId = request.getParameter("memberId");
%>
{"memberId":"<%=memberId%>"}
