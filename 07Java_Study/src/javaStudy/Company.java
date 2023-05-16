package javaStudy;

public class Company {

	//생성자
		int age;
		
		private Company(int a) {
			age = a;		
		}
		
		private static Company instance = new Company(10);
				
		public static Company getInstance() {				
			return instance;			
			}
		
}
