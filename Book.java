package books;

public class Book {
	// 필드
	private String bookName;
	private String author;
	// 책이름(bookName), 작가(author)
	
	//생성자
	public Book() {}
	public Book(String bookname, String author) {
		this.bookName = bookname;
		this.author = author;
	}
	
	//getter setter 생성
	public String getBookname() {
		return bookName;
	}
	public void setBookname(String bookname) {
		this.bookName = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// showBookInfo 메서드를 생성
	public void showBookInfo() {
		System.out.println(bookName + ", "+ author);
	}
	
	
	
	
}
