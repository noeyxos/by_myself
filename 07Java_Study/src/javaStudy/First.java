package javaStudy;

public class First {
	//main 메소드는 시작 메소드로써 First 클래스의 구성요소는 아니다.	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		//변수 - 메모리상의 가상공간 데이터를 담는다
		//변수명 - 식별자
		//변수는 데이터의 종류에 따라서 구조화시켜서 데이터타입을 갖는다
		//숫자형 데이터타입 
		//1. 정수		1 byte	byte타입
		//				2 byte	short타입
		//				4 byte	int 타입
		//				8 byte	long타입
		
		//2. 실수
		//				4 byte	float
		//				8 byte	double
		
		
		//숫자형 데이터 128을 담을 수 있는 자료형은?
		
		//byte a ; //변수 선언
		//a = 128;
		short b;
		b = 128;
		System.out.println("b값은? "+b);
		int c;	//변수 선언
		c = 128;	//초기화
		System.out.println("c값은? "+c);
		
		
		//숫자형 변수 aa와 숫자형 변수bb의 합을 출력하시오
		int cc = 0;
		int aa =3;
		int bb =5;
		cc = aa+bb;
		System.out.println(cc);
		
		
		//숫자형 1234567891000 숫자를 출력하시오
		long n =1234567891000L;	//Long 형을 사용할 때는 꼭 숫자 뒤에 식별자 L을 붙여주어야 한다.
		System.out.println("n값은? " + n);
		
		//실수 1.25를 출력하시오
		float e =1.25f;
		System.out.println("e값은? "+e);
		// -1.33333333333333333333333;을 출력하시오
		double g = -1.33333333333333333333333;
		System.out.println("g값은? " + g);
		
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		String str = "안녕하세요";
		System.out.println(str);
		
		//논리형
		//참과 거짓 
		boolean isMarried = true;
		isMarried = false;
		
		System.out.println("결혼 여부? " + isMarried);
		
		// 상수 - 변하지 않는 변수(대문자로 표현)
		final int MAX_NUM = 100;	//담은 값은 불변이다
		System.out.println(MAX_NUM);
		//MAX_NUM = 99; 	//값 => 리터럴 
	
		byte i = 10;
		
		int j = i;		//자동형변환
		System.out.println(j);
//		
//		
//		int k = 10;
//		float l = k;		//덜 정밀한 데이터가 더 정밀한 쪽으로 형태변환
//		
		// 명시적 형변환(강제형변환)
		int m = 10;
		byte v = (byte)m;
		System.out.println(v);
		
		// 더 정밀한 -> 덜 정밀한 
		double o = 3.14;
		int p = (int)o;
		System.out.println(p);
		
		
		//연산 중 형 변환
		double dNum1 =1.2;
		float fNum2 =0.9F;
		
		//System.out.println((int)dNum1); 의 값 1
		//System.out.println((int)fNum2); 의 값 0
		int iNum3 =(int)dNum1 + (int)fNum2;
		int iNum4 =(int)(dNum1 +fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
	}
}
  