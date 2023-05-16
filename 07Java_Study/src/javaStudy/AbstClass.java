package javaStudy;

public abstract class AbstClass {
	
	int z ;
	
	// 생성자가 있는데 사용할 수 없어요
	public AbstClass(int s){
		this.z = s;
	}
	
	public int getZ() {
		return z;
	}

	//추상클래스	- 불완전한 메소드 
	//초기 클래스 설계시 구현이 명확하지 않은 기능을 선언할 때
	
	int a = 1;
	public void move() {
		}
	public abstract void fly();
}
