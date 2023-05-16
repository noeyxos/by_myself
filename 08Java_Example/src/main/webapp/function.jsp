<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import ="java.sql.*" %>
 <%!
 
 public int memberInsert(Connection conn, String memberId, String memberPwd, String memberName , String memberPhone , String memberEmail , String memberGender , String memberAddr , String memberBirth){
	 int value = 0;
	 PreparedStatement pstmt= null;	 
	 String sql ="INSERT INTO member1230(midx,memberId,memberPwd,memberName,memberPhone,memberEmail,memberGender,memberAddr,memberBirth,ip)"+
		       "VALUES(midx_seq.nextval,?,?,?,?,?,?,?,?,null)";
// 구문 쿼리클래스
		try{
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1,memberId);	
			 pstmt.setString(2,memberPwd);
			 pstmt.setString(3,memberName);
			 pstmt.setString(4,memberPhone);
			 pstmt.setString(5,memberEmail);
			 pstmt.setString(6,memberGender);
			 pstmt.setString(7,memberAddr);
			 pstmt.setString(8,memberBirth);
			 pstmt.executeUpdate();
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			try{
				pstmt.close();
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return value;
 }
%>