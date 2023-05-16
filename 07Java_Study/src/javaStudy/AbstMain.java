package javaStudy;

public class AbstMain {

	public static void main(String[] args) {
		
//		
//		Animal ani = new Animal();
//		ani.fly();
//		//업캐스팅이 가능할까 가능하다
//		AbstClass ab = new Animal(2);
//		ab.fly();
//		System.out.println(ab.getZ());
//	}
//		AbstClass ab =new AbstClass();
	
		//동물 클래스를 상속받아서 Human 클래스 Duck 클래스를 각각 구현하시오
		// ex) 사람은 다리가 2개고 손이 2개며 하루 3끼를 먹고 밤에 자고 낮에 논다
		//		오리는 다리가 2개이고 날개가 2개이며 하루 1끼 먹고 낮에 자고 밤에 잔다.
	
		//객체생성 상속 다형성 if문 for문 연산자 추상클래스 등을 활용해서 작성해보세요
		
		
		//업캐스팅해서 고치면...
		 Animal3 animalh= new Human();
		 animalh.Leg(2); 
		 animalh.Hand(2);
		 animalh.eat();
		 animalh.sleep();
		 animalh.play();
	
		 Animal3 animald = new Duck();
		 animald.Leg(2);
		 animald.Wing(2);
		 animald.eat();
		 animald.sleep();
		 animald.play();
	
	}
}
