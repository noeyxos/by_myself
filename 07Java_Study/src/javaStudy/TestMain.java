package javaStudy;

public class TestMain {

	public static void main(String[] args) {
		
//		TestClass1 tc = new TestClass1();	//객체생성
//		System.out.println("객체의 메모리 주소값은"+tc);
//		System.out.println("객체 안에 들어있는 변수 a값은? "+ tc.a);
//		
		//홍길순 학생을 객체생성 시키고 그 정보를 출력하시오
		//객체생성
		//형식
//		//데이터 타입 (참조)변수 = new 연산자  생성자메소드();
//		Student s = new Student();
//		String stName = s.name;
//		System.out.println("객체의 메모리 주소 값은"+s);
//		System.out.println("객체 안에 들어있는 변수 a값은?" + stName);
//		System.out.println(s.Age);
//		System.out.println(s.height);
//		System.out.println(s.getGender());	//private 한 변수의 값을 메소드를 통해 알아 낼 수 있다.
//		
		
//		
//		int value = s.add(1004, 1005);
//		System.out.println("합은? "+ value );
////		
//		int value= s.times(245, 348);
//		System.out.println("245 곱하기 348은? " + value);
//	
		
		
		
		// 1에서 100까지의 합을 구하는 class 프로그램을 작성하시오.
//		// 그리고 그 결과값을 출력하시오.
//		Plus p = new Plus();
//		int value= p.result(1,100);
//		System.out.println(" 합은?" + value);
//		
//		//객체 생성
//		A a = new A();
//		// a 객체 참조 변수 
//		A b = new A();

		//B 클래스 객체 안의 변수 i 가 100이고 이름변수 name이 홍길동인
		//클래스를 객체생성하시오(생성자 활용해서 초기화)
			
		B b = new B(100, "홍길동");
		System.out.println(b.i);	
		System.out.println(b.name);
		System.out.println(b.getAge());
		b.setAge(1000);
		System.out.println(b.getAge());
		
	}

}
