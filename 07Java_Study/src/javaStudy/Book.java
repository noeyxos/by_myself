package javaStudy;

public class Book {

	private String bookName;
	   private String author;
	   
	   public Book() {}
	   
	   public Book(String bookName, String author) {
	      this.bookName = bookName;
	      this.author = author;
	   }
	   
	   public String getBookName() {
	      return bookName;
	   }

	   public String getAutor() {
	      return author;
	   }
	   
	   public void setAuthor(String author) {
	      this.author = author;
	   }

	   public void showBookInfo() {
	      System.out.println(bookName + "," + author);
	   }
}
