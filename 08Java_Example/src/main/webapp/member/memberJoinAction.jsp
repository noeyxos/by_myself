<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import ="java.sql.*" %>
<%@include file="dbconn.jsp" %>
<%@include file="function.jsp" %>
<%
 request.setCharacterEncoding("UTF-8");
 
 
 String memberId = request.getParameter("memberId");
 String memberPwd = request.getParameter("memberPwd");  
 String memberName = request.getParameter("memberName");  
 String memberPhone = request.getParameter("memberPhone");
 String memberEmail = request.getParameter("memberEmail");  
 String memberGender = request.getParameter("memberGender");  
 String memberAddr = request.getParameter("memberAddr");  
 String memberBirth = request.getParameter("memberBirth");

 
 memberInsert(conn,memberId,memberPwd,memberName,memberPhone,memberEmail,memberGender,memberAddr,memberBirth);
 
 %>      