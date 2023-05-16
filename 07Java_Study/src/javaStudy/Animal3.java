package javaStudy;

public abstract class Animal3 {
	
	
	int leg ;
	int hand;
	int wing;
	
	public void Leg(int a){
		this.leg = a;
	}

	public void Hand(int b){
		this.hand = b;
	}

	public void Wing(int c){
		this.wing = c;
	}
	
	public int getLeg() {
		return leg;
	}
	public int getHand() {
		return hand;
	}
	public int getWing() {
		return wing;
	}
	
	//추상메소드
	public abstract void play();	
	public abstract void eat();
	public abstract void sleep();

	
}
