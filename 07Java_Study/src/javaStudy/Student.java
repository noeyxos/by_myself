package javaStudy;

public class Student {

	//멤버변수 객체변수 인스턴스변수 전역변수
	String name = "홍길순";
	int Age = 15;
	int height = 175;
	String  addr = "전주";
	private char gender = '여';	//private: 내부에서만 		/public: 공공으로 	/protected: 같은 폴더(패키지)
	
	public char getGender(){	//public 메소드를 지정해준다.
		return	gender; 	
	}
	
	
	//멤버 메소드
	//메소드 만들기 설계
	//더하기 메소드
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	//245 *345의 곱을 구하는 메소드를 작성해보세요
	//그리고 그 결과값을 출력하세요
	public int times(int x,int y) {
		int z =x*y;
		return z;
	}
	
	
	
	
	
}
