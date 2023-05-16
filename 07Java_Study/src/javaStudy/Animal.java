package javaStudy;

public class Animal extends AbstClass{

	public Animal(int s) {
		super(s);
	}
	
	@Override
	public void fly() {
		System.out.println("하늘을 날다");
	}

//	public void test() {
//		super.getZ();
//	}
	
}
