<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       
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
<table border=0 style="text-align:left;width:800px;">
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
<td>조회수</td>
</tr>
<tr>
<td>1</td>
<td>제목</td>
<td>작성자</td>
<td>날짜</td>
<td>조회수</td>
</tr>
<td>2</td>
<td>제목</td>
<td>작성자</td>
<td>날짜</td>
<td>조회수</td>
</tr>
</table>
<table border=0 style="width:300px;width:800px;">
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