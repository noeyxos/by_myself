package javaStudy;

public class ExTestMain {

	public static void main(String[] args) {
		
		int[] a = new int[5];

		//예외처리구문
//		try {
//			for(int i = 0; i <5; i ++) {
//				a[i] = i;
//				System.out.println("각 배열 방 안의 값은 ?"  + a[i]);
//			}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열오류발생");
//			//e.printStackTrace();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			System.out.println("반드시 실행되어야하는 영역");
//		}

		try {
			send();
			receive();
		}catch(Exception e) {
			System.out.println("온라인 송금 중 오류 발생");
		}
		
	}

	public static void send() throws Exception{		//발생된 예외를 지금 처리하지 않고 상위로 던지기 <- 메소드가 서로 연관 되어 있을 때-
//		try {			
			System.out.println("돈을 보내다");
			 throw new Exception();	//예외객체를 강제로 발생시키다
//		}catch(Exception e) { 
//			System.out.println("오류");
//		}
	}
	
	public static void receive() {
		System.out.println("돈을 받다");
	}
	
}
