package javaStudy;

import java.util.ArrayList;

public class GenMainClass {

	public static void main(String[] args) {
		//무한배열클래스
		ArrayList<MemberVo> alist = new ArrayList<MemberVo>();
		
		MemberVo mv = new MemberVo();
		mv.setMidx(1);   					//set메소드는 값을 담는 메소드
		mv.setMemberid("test");       //멤버변수에 값이 담긴다
		mv.setMembername("홍길동");
		alist.add(mv);
		
		MemberVo mv2 = new MemberVo();
		mv.setMidx(2);   					//set메소드는 값을 담는 메소드
		mv.setMemberid("test2");       //멤버변수에 값이 담긴다
		mv.setMembername("이순신");
		alist.add(mv2);
	}

}
