package javaStudy;

public class CalcTest implements Calc {
	
	@Override
	public int add(int num, int num2) {
		int num3 = num + num2;
		return num3;
	}	
	@Override
	public int hap(){
		int sum =0;
		for (int i = 1; i <= 100; i ++) { 
		sum += i;}
		return sum;
			
	}
	
	
}
