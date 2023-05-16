package javaStudy;

public class Example {

	public int age =10;
	public String name ="홍길동";
	
	public static void main(String[] args) {
		
		// 홍길동의 나이는 10살이고
		// 이순신의 나이는 20살입니다.라고 객체생성을 통해서 출력하시오
		
		Example ex = new Example();
		int a = ex.age;
		String b = ex.name;
		System.out.println(b+"의 나이는"+a);

		
		ex.age =20;
		ex.name = "이순신";
		int c = ex.age;
		String d = ex.name;
		System.out.println(d+"의 나이는" + c);
			
	}

}
