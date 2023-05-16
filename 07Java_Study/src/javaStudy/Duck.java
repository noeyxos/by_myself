package javaStudy;

public class Duck extends Animal3{
	//		오리는 다리가 2개이고 날개가 2개이며 하루 1끼 먹고 낮에 자고 밤에 논다.
	//객체생성 상속 다형성 if문 for문 연산자 추상클래스 등을 활용해서 작성해보세요
	
	public Duck() {
		super();
		System.out.println("오리는");
	}

	public void leg(int a) {
		System.out.println("다리가 "+a+"개이고");
	}
	
	public void hand(int b) {
		System.out.println("손이 "+b+"개며");
	}
	
	public void wing(int c) {
		System.out.println("날개가 "+c+"개 이며");
	}
	
	@Override
	public void eat() {
		System.out.println("하루 1끼를 먹고");
	}
	@Override
	public void sleep() {
		System.out.println("낮에 자고");
	}
	@Override
	public void play() {
		System.out.println("밤에 논다");
	}

}
