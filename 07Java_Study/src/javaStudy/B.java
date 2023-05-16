package javaStudy;

public class B {

	//B 클래스 객체 안의 변수 i 가 100이고 이름변수 name이 홍길동인
			//클래스를 객체생성하시오(생성자 활용해서 초기화)
	public int i;
	public String name;
	
	B(int a, String b){
		this.i = a;
		this.name = b;
	}
	
	private int age =10;
	
	public int getAge() {
		return age;
	}
	public void setAge(int a){
		age = a;
	}
	
	private int weight = 20;

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
