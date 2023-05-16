package example1230.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import example1230.domain.BoardVo;
import example1230.service.BoardDao;


@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String str;
    public BoardController(String path) {
    	this.str = path;
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		
		if(str.equals("/board/boardList.do")) {
			System.out.println("boardList.do 들어옴");
			
			BoardDao bd =  new BoardDao();
			ArrayList<BoardVo> blist = bd.boardSelectAll();
			
			
			request.setAttribute("blist", blist);
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/boardList.jsp");
			rd.forward(request, response);		//forward 방식 : 같은 영역안에 있는 다른 공간에 정보를 넘겨줌 
		
		}
		//과제 ! 
		if(str.equals("/board/boardWrite.do")) {
			System.out.println("boardWrite.do 들어옴");
			
			BoardDao bd =  new BoardDao();
			ArrayList<BoardVo> blist = bd.boardSelectAll();
			
			
			request.setAttribute("blist", blist);
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/boardWrite.jsp");
			rd.forward(request, response);		//forward 방식 : 같은 영역안에 있는 다른 공간에 정보를 넘겨줌 
		}
		
		else if(str.equals("/board/boardWriteAction.do")) { 
			 String subject = request.getParameter("subject");
			 String contents = request.getParameter("contents");  
			 String writer = request.getParameter("writer");  
			 String pwd = request.getParameter("pwd");  
			 String ip = InetAddress.getLocalHost().getHostAddress();
			 
			 
			 
			 HttpSession  session = request.getSession();
			 int midx =0;
			 if (session.getAttribute("midx")==null) {
				 midx = (int)session.getAttribute("midx");

			 }
			 
			 
			 //처리하는 부분
			 BoardVo bv= new BoardVo();
			 bv.setSubject(subject);
			 bv.setContent(contents);
			 bv.setWriter(writer);
			 bv.setIp(ip);
			 bv.setMidx(midx);
			 bv.setPwd(pwd);
			 
			 
			 BoardDao bd = new BoardDao();
			 int value = bd.boardInsert(bv);
			 
			 
			 //이동하는 부분
			 if (value == 1) {
				 response.sendRedirect(request.getContextPath()+"/board/boardList.do");
			 }else{
				 response.sendRedirect(request.getContextPath()+"/board/boardWrite.do");
			 }

		}else if (str.equals("/board/boardContents.do")) {
			
			String bidx = request.getParameter("bidx");
			System.out.println("bidx:" + bidx );
			int bidxInt = Integer.parseInt(bidx); 
			
			BoardDao bd = new BoardDao();
			int value = bd.boardViewCnt(bidxInt);
			BoardVo bv = bd.boardSelectOne(bidxInt);
			
			
			request.setAttribute("bv", bv);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/boardContents.jsp");
			rd.forward(request, response);		
			
			
		}else if (str.equals("/board/boardModify.do")) {
			System.out.println("boardmodify들어왔음");
			
			String bidx = request.getParameter("bidx");
			System.out.println("bidx:" + bidx );
			int bidxInt = Integer.parseInt(bidx); 
			
			BoardDao bd = new BoardDao();
			BoardVo bv = bd.boardSelectOne(bidxInt);
			
			request.setAttribute("bv", bv);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/boardModify.jsp");
			rd.forward(request, response);	
			
			
			
		}else if(str.equals("/board/boardModifyAction.do")) {
			String bidx= request.getParameter("bidx");			
			int bidxInt =Integer.parseInt(bidx);
			String subject =request.getParameter("subject");
			String contents =request.getParameter("contents");
			String writer =request.getParameter("writer");
			String pwd =request.getParameter("pwd");
			
			//update 메소드 사용
			BoardVo bv = new BoardVo();
			bv.setBidx(bidxInt);
			bv.setSubject(subject);
			bv.setContent(contents);
			bv.setWriter(writer);
			bv.setPwd(pwd);
			
			
			BoardDao bd = new BoardDao();
			int value = bd.boardModify(bv);
			
				if(value==1) {
					response.sendRedirect(request.getContextPath()+"/board/boardContents.do?bidx="+bidx);
				}else {
					response.sendRedirect(request.getContextPath()+"/board/boardModify.do?bidx="+bidx);
				}
				
		}else if(str.equals("/board/boardDelete.do")) {
			String bidx = request.getParameter("bidx");
			int bidxInt =Integer.parseInt(bidx);
			
			BoardDao bd = new BoardDao();
			BoardVo bv = bd.boardSelectOne(bidxInt);
			
			request.setAttribute("bv", bv);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/boardDelete.jsp");
			rd.forward(request, response);	
			
			
		}else if (str.equals("/board/boardDeleteAction.do")) {
			String bidx = request.getParameter("bidx");
			int bidxInt =Integer.parseInt(bidx);
			String pwd = request.getParameter("pwd");
			
			BoardVo bv =new BoardVo();
			bv.setBidx(bidxInt);
			bv.setPwd(pwd);
			
			BoardDao bd= new BoardDao();
			int value = bd.boardDelete(bv);
			

			if (value == 1) {
				response.sendRedirect(request.getContextPath()+"/board/boardList.do");
			}else {
				response.sendRedirect(request.getContextPath()+"/board/boardDelete.do?bidx="+bidx);
			}
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
