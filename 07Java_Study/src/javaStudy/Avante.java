package javaStudy;

public class Avante extends Car{
//
//	public Avante(int a) {
//		super(a);	//상위생성자를 호출(매개변수가 있어요)
//	}
//	
//	@Override	//재정의
//	public void move() {
//		System.out.println(super.getWheel()+"개의 바퀴를 가진 자동차가 달린다!!!");
//	}
	@Override
	public void start() {
			System.out.println("Avante 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	
	}

	
}
