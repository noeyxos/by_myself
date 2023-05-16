<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="example1230.domain.BoardVo" %>
  
  <%  BoardVo bv =(BoardVo)request.getAttribute("bv"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
내용보기
<table  border=1 style="width:500px;">
<tr>
<td style="width:50px;">제목</td>
<td><%=bv.getSubject() %></td>
<td>  조회수(<%=bv.getViewcnt() %>)</td>
</tr>
<tr>
<td>파일다운로드</td>
<td></td>
</tr>
<tr>
<td>이미지</td>
<td></td>
</tr>
<tr>
<td style="height:200px;">내용</td>
<td><%=bv.getContent() %></td>
<td></td>
</tr>
<tr>
<td>작성자</td>
<td><%=bv.getWriter() %></td>
<td></td>
</tr>
<tr>
<td colspan=2 style="text-align:right;">

<button onclick = "location.href='<%=request.getContextPath()%>/board/boardModify.do?bidx=<%=bv.getBidx() %>'">수정</button>
<button onclick = "location.href='<%=request.getContextPath()%>/board/boardDelete.do?bidx=<%=bv.getBidx() %>'">삭제</button>
<button>답변</button>
<button>목록</button>
</td>
</tr>
</table>
</body>
</html>