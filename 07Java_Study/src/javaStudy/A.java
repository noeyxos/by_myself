package javaStudy;

public class A extends Object{	//상위 클래스인 Object의 모든 기능을 상속받겠다
	
	//기본 생성자(생략가능) --> 객체 생성할 때 관여하는 메소드
	A(){
		super();	//상위 클래스의 생성자 메소드를 호출	
	}
	
	
	//변수
	private String day = "월";	//private 내부적으로만 사용
	
	//메소드
	public void say() {		//void타입은 리턴값이 없다는 뜻
		System.out.println(day + "요일입니다.");
	}
	
	//상수
	private final String year = "2023년";
}
	