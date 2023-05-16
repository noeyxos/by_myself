package example1230.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import example1230.dbconn.Dbconn;
import example1230.domain.MemberVo;

public class MemberDao{

	//멤버변수 전역
	private Connection conn;
	
	public MemberDao(){		//MemberDao 생성할 때 Dbconn 객체도 생성시킴 => conn객체 생성
		Dbconn dbconn = new Dbconn();
		this.conn = dbconn.getConnection();
	}
	
	
	 public int memberInsert(String memberId, String memberPwd, String memberName , String memberPhone , String memberEmail , String memberGender , String memberAddr , String memberBirth){
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
	
	 @SuppressWarnings("finally")
	public ArrayList<MemberVo> memberSelectAll() {
		 ArrayList<MemberVo> alist = new ArrayList<MemberVo>();
		 String sql = "select midx, memberid, membername, delyn, writeday from member1230 order by midx desc";
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 try {
			 pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
		
			 
			 while(rs.next()) {	//커서의 다음 값이 존재하면 참
			 MemberVo mv = new MemberVo();		//MemberVo 객체 생성해서
			 mv.setMidx(rs.getInt("midx"));	//rs 값들을 옮겨담는다
			 mv.setMemberid(rs.getString("memberid"));
			 mv.setMembername(rs.getString("membername"));
			 mv.setDelyn(rs.getString("delyn"));
			 mv.setWriteday(rs.getString("writeday"));
			 alist.add(mv);		//alist  클래스 안에 MemberVo 객체를 하나씩 추가한다
			 
			 }
		 
		 } catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		
		 
		 return alist;
		}
	 }
		public int memberIdCheck(String memberId){
			int value = 0;
			String sql ="select count(*) as cnt from member1230 where memberid = ?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, memberId);
					rs = pstmt.executeQuery();
					
					if(rs.next()) {	//커서가 이동을 해서 다음 값이 존재하면 참 -> 진행할 수 있다.
						value = rs.getInt("cnt");					
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
						pstmt.close();
						conn.close();
					} catch (Exception e) {					
						e.printStackTrace();
					}
				}
				return value;
		}
		 
		 public MemberVo memberLogin(String memberId, String memberPwd) {
			 System.out.println("memberid: "+memberId);
			 System.out.println("memberpwd: "+memberPwd);
			 
			 
			 MemberVo mv = null;
			 String sql = "select * from member1230 where delyn ='n' and memberid=? and memberpwd=?";
			 PreparedStatement pstmt=null;
			 ResultSet rs= null;
			 try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,memberId);
				pstmt.setString(2,memberPwd);
				rs = pstmt.executeQuery();	//컬럼 값을 담기 위한 메소드
				
				if(rs.next()) {
					mv = new MemberVo();
					mv.setMidx(rs.getInt("midx"));
					mv.setMembername(rs.getString("memberName"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (Exception e) {					
					e.printStackTrace();
				}
			}
			 return mv;
		 }
		
}
