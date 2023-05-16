package javaStudy;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadFirst tf = new ThreadFirst();	//멀티스레드 기능을 가진 객체
		tf.start();
		
		
		for(int i = 0; i < 10; i++ ) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("1초마다 도는 스레드");
		}
		

	}

}
