package javaStudy;

public class ForTest {

	public static void main(String[] args) {
		
		//1에서 100까지의 합을  for 문을 활용해서 합을 출력하시오
		//형식 for(초기식; 조건식; 증감식){}
		
//		int i;
//		int sum;
//		for(i = 1, sum = 0; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println("총합은? "+ sum);
//		

		//반복문 2. while문
		//형식
		//초기식
		//while(조건식){
		//증감식
//		//}
//		
//		int i = 1;
//		int sum = 0;
//		while(i <= 100) {
//			sum = sum + i ;
//			i ++;
//		}
		
		//3.반복문 do while()
		//초기식
		//do{
		//증감식
//		//}while(조건식);
//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum + i;
//			i ++;
//		}while(i<=100);	//초기식이 조건식에 부합하지 않아도 초기식만은 실행된다. 
//		
//		System.out.println("총합은? "+sum);
//		
		//조건문과 반복문을 활용해서
		//1에서 100까지의 숫자중에 홀수들의 합을 출력하시오
//		
//		int sum= 0;
//		for (int i = 1; i <=100; i ++) {
//			if (i%2==1) {
//				sum += i;
//			}
//		} 
//		System.out.println("홀수들의 총합은? " +sum);
//		
//		
		
		// 구구단 프로그램 중 2단 4단 6단 8단만 출력하시오	
//		for(int i = 1; i<10; i++ ) {
//			if (i% 2==0) {
//				for (int j =1; j <10; j++) {
//					System.out.println(i +"*"+j+"="+i*j);
//				}
//			}
//		}
//		
//		// 또다른 풀이
//		for(int i = 1; i<10; i++ ) {
//			if (i% 2==1) {
//				continue; 
//			}
//				for (int j =1; j <10; j++) {
//					System.out.println(i +"*"+j+"="+i*j);
//				}
//		}
//		
		//별찍기
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 

	}

}
