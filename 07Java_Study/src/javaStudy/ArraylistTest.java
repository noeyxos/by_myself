package javaStudy;

import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {
		
		// 무한배열클래스 선언
		ArrayList <Book> alist ;
		// 무한배열클래스를 생성해서 대입 
		alist = new ArrayList <Book>();	//배열의 특성을 가지고 있어서 빠르다
		
		Book book = new Book("태백산맥","조정래");
		Book book2 = new Book("토리","박경래");
		Book book3 = new Book("어린왕자","생텍쥐페리");
		Book book4 = new Book("데미안","헤르만헤세");
		
		alist.add(book);
		alist.add(book2);
		alist.add(book3);
		alist.add(book4);
		
//		System.out.println(alist.get(0).getBookName());		//ArrayList 객체 안에 첫번째 Book객체 안의 이름

		for(Book bk: alist) {
			System.out.println(bk.getBookName());
		}
		
	}

}
