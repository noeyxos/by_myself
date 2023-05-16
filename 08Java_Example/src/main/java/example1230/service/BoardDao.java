package example1230.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import example1230.dbconn.Dbconn;
import example1230.domain.BoardVo;

public class BoardDao {
	
	private Connection conn;
	
	public BoardDao() {
		Dbconn dbconn = new Dbconn();
		this.conn = dbconn.getConnection();
	}
	
	public ArrayList<BoardVo> boardSelectAll(){
		ArrayList<BoardVo> blist = new ArrayList<BoardVo>();
		
		String sql ="select * from board1230 where delyn = 'n' order by bidx DESC";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				BoardVo bv = new BoardVo();
				bv.setBidx(rs.getInt("bidx"));
				bv.setSubject(rs.getString("subject"));
				bv.setContent(rs.getString("content"));
				bv.setWriter(rs.getString("writer"));
				bv.setWriteday(rs.getString("writeday"));
				blist.add(bv);
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
		}
		
		return blist;
	}
	
	public int boardInsert(BoardVo bv) {
		int value =0;
		String sql = "INSERT INTO board1230(bidx,subject,content,writer,ip,midx,pwd)"
				+ "VALUES(bidx_seq.NEXTVAL,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bv.getSubject());
			pstmt.setString(2, bv.getContent());
			pstmt.setString(3, bv.getWriter());
			pstmt.setString(4, bv.getIp());
			pstmt.setInt(5, bv.getMidx());
			pstmt.setString(6, bv.getPwd());
			value = pstmt.executeUpdate();			
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		
		return value;
	
	}
	
	public BoardVo boardSelectOne(int bidx) {
		BoardVo bv = null;
		String sql = "select * from board1230 where bidx = ?"; 
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, bidx);
			rs =pstmt.executeQuery();
			
			if(rs.next()) {
				bv = new BoardVo();
				bv.setBidx(rs.getInt("bidx"));
				bv.setSubject(rs.getString("subject"));
				bv.setContent(rs.getString("content"));
				bv.setWriter(rs.getString("writer"));
				bv.setViewcnt(rs.getString("viewcnt"));
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			rs.close();
			pstmt.close();
			conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
		return bv;
	}
	
	public int  boardViewCnt(int bidx) {
		System.out.println("bidx" + bidx);
		int value =0;
		
		String sql="UPDATE BOARD1230 SET viewcnt=NVL(viewcnt,0)+1 where bidx=? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bidx);
			value = pstmt.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
//				conn.close();	 conn 연결을 끊으면 다음 메소드가 동작을 안한다. 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return value;
	}
	
	public int boardModify(BoardVo bv) {
		System.out.println("비밀번호는?"+bv);
		
		int value =0;
		String sql = "UPDATE board1230 SET subject=?,content=?, writer=? WHERE bidx=? and pwd=? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bv.getSubject());
			pstmt.setString(2, bv.getContent());
			pstmt.setString(3, bv.getWriter());
			pstmt.setInt(4, bv.getBidx());
			pstmt.setString(5, bv.getPwd());
			value = pstmt.executeUpdate();			
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		return value;
	
	}
	
	public int boardDelete(BoardVo bv) {
		int value = 0;
		String sql = "UPDATE board1230 SET delyn ='Y' WHERE bidx=? and pwd =?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bv.getBidx());
			pstmt.setString(2, bv.getPwd());
			value = pstmt.executeUpdate();			
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		return value;
	}
	
}
