package javaStudy;

public class SonClass extends FatherClass {

	@Override		//재정의
	public void move(){	//메소드이름은 다르면 안된다
		System.out.println("빨리 달린다.");
	}
	
	public void re_move() {		//상속받은 메소드
		super.move();	
	}
	
}
