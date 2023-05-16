<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
 <%@page import = "example1230.domain.*" %>
 <%@page import = "java.util.*" %>
 <%
ArrayList <MemberVo> alist = (ArrayList<MemberVo>)request.getAttribute("alist");

 %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원목록
<table border=1>
<tr>
<td>회원번호</td>
<td>회원아이디</td>
<td>회원이름</td>
<td>탈퇴여부</td>
<td>가입일</td>
</tr>

<% for (MemberVo mv : alist) {%>
<tr>
<td><%=mv.getMidx() %></td>
<td><%=mv.getMemberid() %></td>
<td><%=mv.getMembername() %></td>
<td><%=mv.getDelyn() %></td>
<td><%=mv.getWriteday() %></td>
</tr>

<%} %>
</table>
</body>
</html>