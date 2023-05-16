package javaStudy;

public abstract class Car {

//	private int wheel;
//	public Car(int a) {
//		this.wheel = a;		
//	}	
//	public int getWheel() {
//		return wheel;
//	}
//	public void move() {
//		System.out.println(wheel+"개의 바퀴를 가진 자동차가 달린다");
//	}
	
	final public void run(){
		start( );
		drive( );
		stop( );
		turnoff( );		
	}
	
	public void start( ) {
		System.out.println("시동을 켭니다.");
	}
	public void drive( ) {
		System.out.println("달립니다.");
	}
	public void stop( ) {
		System.out.println("멈춥니다.");
	}
	public void turnoff( ) {
		System.out.println("시동을 끕니다.");
	}

	public void washCar( ) {
		System.out.println("세차를 합니다");
	}

}
