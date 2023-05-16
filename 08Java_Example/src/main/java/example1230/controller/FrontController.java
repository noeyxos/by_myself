package example1230.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
	//	System.out.println("전체 주소는? "+uri);
		String projectName = request.getContextPath();		
		int projectLength = projectName.length();		
		String str = uri.substring(projectLength);	//실제 가상경로이름 추출
	//	System.out.println("가상경로는? "+str);
	//		 예를 들면 
	// 		/member/memberList.do
	//		/board/boardList.do
		String[] strArray = str.split("/");
		String gubun = strArray[1];

		if (gubun.equals("member")) {
			MemberController mc = new MemberController(str);
			mc.doGet(request, response);
			
		}else if(gubun.equals("board")) {
			BoardController bc =new BoardController(str);
			bc.doGet(request, response);
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
