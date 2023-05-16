package javaStudy;

public class Plus {

	// 1에서 100까지의 합을 구하는 class 프로그램을 작성하시오.
	// 그리고 그 결과값을 출력하시오.
	
	//변수 상수 메소드 생성자메소드 => member 구성요소
	public int result(int a, int b) {
		int sum = 0;	//멤버 변수
		for(int i=a; i <=b; i++) {
			sum +=i;
		}
		return sum;
	}
		
	
	
	
	
}
