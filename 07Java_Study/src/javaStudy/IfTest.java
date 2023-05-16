package javaStudy;

//import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {	//시작메소드
		
		//if 조건문
		//형식 if(조건식){
		//		
		//	}else {
		//		
		//		
		//		
		//	}
		//		
		//	문제 1. 학생의 나이 = 9 (age = 9)
		//  나이가 8살보다 작으면 취학 전 아동이고
		// 나이가 14살보다 작으면 초등학생이고
		// 나이가 20살보다 작으면 중고등학생입니다
		// 조건문을 활용해서 작성하시오
//		
//		int age = 9;
//		if(age<8) {		// 작은 단위부터 범위를 지정해줘야 한다. 
//			System.out.println("취학 전 아동"); 
//		}else if(age<14) {
//			System.out.println("초등학생");
//		}else if(age <20) {
//			System.out.println("중고등학생");
//		}
//		
////		
//		System.out.println("숫자를 입력하세요");
//		Scanner sc = new Scanner(System.in);	//값을 입력 받기 위한 객체
//		int value = sc.nextInt();	//값을 입력받는 메소드
//		
//		if (value > 50) {
//			System.out.println("50보다 큽니다.");
//		}else {
//			System.out.println("50보다 작습니다.");
//		}
//		
		
		// 입력받은 값이 짝수이면 짝수입니다. 라고 출력하고 
		// 입력받은 값이 홀수이면 홀수입니다. 라고 출력하시오
//		System.out.println("숫자를 입력하세요");
//		Scanner num = new Scanner(System.in);
//		int value = num.nextInt();
//		
//		if (value % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
//		// 문자열 a가 남성이 담겨있고
//		// a가 남성이면 남성입니다. 나머지이면 여성입니다.라고 출력하시오
//		String a="남성";		// String의 특이한 사용법 - 객체에 변수를 담는 것이 아니라 변수의 주소값을 담는다.
//		
//		if (a.equals("남성")) {		//문자열(글자)를 비교하려면 .equals()메소드를 사용하고
//			System.out.println("남성입니다.");	//글자를 담고있는 string클래스의 객체주소값을
//		}else {												//비교하려면 == 를 사용한다.	
//			System.out.println("여성입니다.");
//		}
//		
		//if  ~ else if 문 
		//if if문
		
		//월화수목금은 근무일이고 토일은 휴일입니다. 
		// 라고 switch문을 활용해서 출력하시오
		char day = '일';
		
		switch(day) {
			case '월' : case '화' : case '수' : case '목' : case '금' : 
				System.out.println("근무일");
				break;
			case '토': case '일': 
				System.out.println("휴일");
				break;
		}		
	}

}
