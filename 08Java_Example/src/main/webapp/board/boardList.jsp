<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>      
 <%@ page import ="java.util.*" %>
 <%@ page import ="example1230.domain.BoardVo" %>
 <%
 ArrayList<BoardVo>  blist = (ArrayList<BoardVo>) request.getAttribute("blist");
 %>    
       
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a:link{
text-decoration:none;
}

</style>
</head>
<body>
게시판 목록
<form name="frm" action="<%=request.getContextPath() %>/board/boardList.do" method="post">
<table  style="text-align:left;width:800px;border:0;">
<tr>
<td style="width:600px;"></td>
<td>
<select name="searchType">
<option value="subject">제목</option>
<option value="writer">작성자</option>
</select>
</td>
<td><input type="text" name="keyword" size="10"></td>
<td><input type="submit" name="submit" value="검색"></td>
</tr>
</table>
</form>
<table border=1 style="text-align:left;width:800px;">
<tr>
<td>게시물번호</td>
<td>제목</td>
<td>작성자</td>
<td>날짜</td>
</tr>

<!-- 향상된 for 문  -->
<%for(BoardVo bv: blist){ %>
<tr>
<td><%=bv.getBidx() %></td>
<td><a href="<%=request.getContextPath()%>/board/boardContents.do?bidx=<%=bv.getBidx() %>"><%=bv.getSubject() %></a></td>
<td><%=bv.getWriter() %></td>
<td><%=bv.getWriteday().substring(0,10)  %></td>
</tr>
<%} %>



</table>
<table style="border:0, width:300px;width:800px;">
<tr>
<td style="text-align:right;">
◀
</td>
<td style="text-align:center;width:300px;">
1 2 3 4 5 6 7 8 9 10
</td>
<td style="width:200px;text-align:left;">
▶
</td>
</tr>
</table>

<a href="<%=request.getContextPath()%>/board/boardWrite.do">글쓰기</a>
</body>
</html>