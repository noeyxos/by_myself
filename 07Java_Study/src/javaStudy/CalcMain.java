package javaStudy;

public class CalcMain {

	public static void main(String[] args) {
		

		CalcTest calcTest = new CalcTest();
		int value = calcTest.add(10, 20);
		System.out.println("합은"+ value);
				
		int hap = calcTest.hap();
		System.out.println("총합은"+ hap);
		
		Calc calc = new CalcTest(); 	//업캐스팅이 가능하다
		int hap2 = calc.hap();
		System.out.println("총합2는?"+hap2);
	
	}
		
}
