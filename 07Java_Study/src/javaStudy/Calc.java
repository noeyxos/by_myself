package javaStudy;

public interface Calc {

	//객체가 될 수 없기 때문에 생성자는 사용할 수가 없다.
//	public Calc() {}
	
	//클래스가 아니라 문서
	//모두 불완전한 메소드들만 가지고 있다.
	
	//상수정의
	double PI = 3.14;
	//모든 변수는 상수로 인식이 된다(static final이 생략)
	int a = 1;
	
	//모든 메소드는 불완전하기 때문에 abstract가 앞에 생략되어있는 것과 같다. 
	abstract int add(int num, int num2);
	
	//1에서 100까지의 합을 구하는 메소드를 정의.	인터페이스를 구현시키세요
	public int hap();
	
	
	
}
