<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
//자바코드 영역입니다.
String memberId = request.getParameter("memberId");	
//자바request객체로 파라미터 메소드 호출해서 memberId 객체의 담긴 값을 받는다.
out.println("아이디는?"+memberId+"<br/>");

String memberPwd = request.getParameter("memberPwd");
String memberName = request.getParameter("memberName");
String memberGender = request.getParameter("memberGender");
String memberAddr = request.getParameter("memberAddr");
String memberBirth = request.getParameter("memberBirth");

out.println("비밀번호는?"+memberPwd+"<br/>");
out.println("이름은?"+memberName+"<br/>");
out.println("성별은?"+memberGender+"<br/>");
out.println("주소는?"+memberAddr+"<br/>");
out.println("생년월일은?"+memberBirth+"<br/>");
%> 	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
이곳으로 데이터가 넘어옵니다......
</body>
</html>