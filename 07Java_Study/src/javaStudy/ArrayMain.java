package javaStudy;

public class ArrayMain {
	   public static void main(String[] args) {
		   
		      /*
		      // 숫자형 배열
		      int[] a;  // 배열 선언
		      a = new int[10];  // 배열 생성
		      // System.out.println(a);
		      // for(int i = 0; i<10; i++) {
		         // a[i] = i+1;
		         
		         a[0] = 1;
		         a[1] = 2;
		         a[2] = 3;
		         a[3] = 4;
		         a[4] = 5;
		         a[5] = 6;
		         a[6] = 7;
		         a[7] = 8;
		         a[8] = 9;
		         a[9] = 10;
		         
		         
		         int[] aa = new int[] {1,2,3,4,5,6,7,8,9,10}; // 초기화
		         
		         int[] aaa= {1,2,3,4,5,6,7,8,9,10};
		         
		         int sum = 0;
		         for(int i = 0; i<10; i++) {  // = for(int i =0; i<aaa.length; i++)
		            sum = sum + aaa[i];
		            // System.out.println(aaa[i]);
		         }
		         System.out.println("배열의 합은? "+ sum);
		         */
		      
		         Book[] library = new Book[3];
		         library[0] = new Book("태백산맥","조정래");
		         library[1] = new Book("데미안","헤르만헤세");
		         library[2] = new Book("토지","박경리");
		         
		         // 첫 번째 Book객체의 책 이름을 알려주세요.
		         String bn = library[0].getBookName();
		         System.out.println("책 이름은? "+ bn);
		      
		   
		         // 배열에 담겨있는 모든 책의 저자를 출력해주세요. (반복문)
		         for(int i = 0; i<library.length; i++) {
		            String name = library[i].getAutor();
		            System.out.println((i+1) + "번째 저자는" + name);
		         }
		         
		         // 객체배열 반복문을 사용할 때 향상된 for문
		         for(Book bk : library) {
		            System.out.println(bk.getAutor());
		         }
	   }     
}
