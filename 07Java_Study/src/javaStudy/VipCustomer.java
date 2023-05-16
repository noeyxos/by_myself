package javaStudy;

public class VipCustomer extends Customer{	// 자바에서는 다중 상속 불가능
	int bonus;
	
	VipCustomer(int a){
		super();		//상위 기본생성자 호출 - 생성자의 첫 줄에만 쓰인다
		bonus = a;
 	}
	
	@Override
	public void run() {
		System.out.println("빨리 달린다.");
	}
	
	public void dance() {
		System.out.println("춤을 추다");
	}
	
	
	
}
