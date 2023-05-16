package javaStudy;

public class FatherClass extends Object{
	
	public void move() {
		System.out.println("달린다");
	}
	
	public void check(int a) {
		if (a %2== 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
}
