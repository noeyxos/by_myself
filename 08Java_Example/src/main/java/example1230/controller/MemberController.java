package example1230.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import example1230.domain.MemberVo;
import example1230.service.MemberDao;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	String str;
	public MemberController(String path){
		 this.str = path;
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
//		String uri = request.getRequestURI();
//		System.out.println("전체 주소는? "+uri);
//		String projectName = request.getContextPath();		
//		int projectLength = projectName.length();		
//		String str = uri.substring(projectLength);	//실제 가상경로이름 추출
//		System.out.println("가상경로는? "+str);
		
		if(str.equals("/member/memberList.do")) {	//추출한 가상경로가 이 문자열과 같나요?
			System.out.println("가상경로로 들어옴");

			MemberDao md = new MemberDao();
			 ArrayList <MemberVo> alist = md.memberSelectAll();
			 
			request.setAttribute("alist", alist);	//내부이동은 자원을 공유할 수 있다
			
			// 내부 이동
			RequestDispatcher rd = request.getRequestDispatcher("/member/memberList.jsp");
			rd.forward(request, response);
			
			
		}else if(str.equals("/member/memberJoin.do")) {
			System.out.println("memberJoin.do");
			RequestDispatcher rd = request.getRequestDispatcher("/member/memberJoin.jsp");
			rd.forward(request, response);
			
		}else if(str.equals("/member/memberJoinAction.do")) { 
			 String memberId = request.getParameter("memberId");
			 String memberPwd = request.getParameter("memberPwd");  
			 String memberName = request.getParameter("memberName");  
			 String memberPhone = request.getParameter("memberPhone");
			 String memberEmail = request.getParameter("memberEmail");  
			 String memberGender = request.getParameter("memberGender");  
			 String memberAddr = request.getParameter("memberAddr");  
			 String memberBirth = request.getParameter("memberBirth");

			 MemberDao md= new MemberDao();
			 md.memberInsert(memberId,memberPwd,memberName,memberPhone,memberEmail,memberGender,memberAddr,memberBirth);
			 
			 String path = request.getContextPath()+"/member/memberList.do";
			 response.sendRedirect(path);		//sendRedirect 로 보낸 방식 알아두기 ! 
			 
		}else if(str.equals("/member/memberIdCheck.do")) {
			String memberId = request.getParameter("memberId");
			
			//넘어온 memberId와 같은 아이디가 있는지 체크
			MemberDao md = new MemberDao();
			int value = md.memberIdCheck(memberId);
			System.out.println("value:"+value);
			
			PrintWriter out = response.getWriter();
			out.println("{\"value\":\""+value+"\"}");
			
		}else if (str.equals("/member/memberLogin.do")) {
			System.out.println("memberLogin.do");
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/member/memberLogin.jsp");
			rd.forward(request, response);
			
		}else if(str.equals("/member/memberLoginAction.do")) {
			String memberId =request.getParameter("memberId");
			String memberPwd = request.getParameter("memberPwd");
			
			//처리하는 메소드
			MemberDao md= new MemberDao();
			MemberVo mv = md.memberLogin(memberId, memberPwd);
			if (mv == null) {
				response.sendRedirect(request.getContextPath() + "/member/memberLogin.do");
			}else {
				int midx = mv.getMidx();
				String memberName = mv.getMembername();

				HttpSession session = request.getSession();
				session.setAttribute("midx", midx);
				session.setAttribute("memberName", memberName);
				
				response.sendRedirect(request.getContextPath() + "/");
			}
		}else if(str.equals("/member/memberLogOut.do")) {
		
			HttpSession session = request.getSession();
			session.removeAttribute("midx");
			session.removeAttribute("memberName");
			session.invalidate();
			
			
			response.sendRedirect(request.getContextPath() + "/");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
