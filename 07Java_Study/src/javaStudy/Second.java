package javaStudy;

public class Second {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;//먼저 gameScore 값이 1 증가한 후(151)  lastScore1 변수에 대입
		System.out.println("게임스코어는 ? "+ gameScore);
		int lastScore2 = gameScore++;	//lastScore2 변수에 기존 gameScore값을 대입한 후 gameScore값 1 증가(152)
		System.out.println("게임스코어는 ? "+ gameScore);
		int lastScore3 = ++gameScore;	//먼저 gamScore 값이 1 증가 한 후 (153) lastScore3 변수에 대입
		System.out.println("게임스코어는 ? "+ gameScore);
		
		//각 값이 나오는 이유를 주석을 달아보세요
		System.out.println(lastScore1); 	// 151 
		System.out.println(lastScore2);	//151
		System.out.println(lastScore3); //153

		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1= num1 +10)<10)&&((i = i  + 2)< 10);
		System.out.println(value);	// false
		System.out.println(num1);	//20
		System.out.println(i);			//4 가 아니고 2
		
		
		value =((num1 = num1 + 10 )> 10) || ((i = i + 2)< 10);
		System.out.println(value);	//TRUE
		System.out.println(num1);	//30
		System.out.println(i);			//4가 아니고 2
		
		
		
	}

}
