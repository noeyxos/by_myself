package javaStudy;

public class Student1 {
	
	public String studentName;
	public int grade;
	public int money;
	
	//매개변수 있는 생성자
	public Student1(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}	

	//버스를 타는 기능
	public void takeBus(Bus bus){
		bus.take(1000);
		this.money -=1000;
	}
	
	//지하철을 타는 기능
	public void takeSubway(Subway subway){
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은"+ money +"입니다.");		
	}
	
}
