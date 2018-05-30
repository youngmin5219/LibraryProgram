
public class Book {
	boolean borrowable;	//�뿩 ���� ����
	String title;		//����
	String author;		//����
	String publisher;	//���ǻ�
	String location; 	//û����ȣ
	String lender;		//�뿩��
	
	public Book() {
	}
	public Book(String title, String author, String publisher, String location) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.location = location;
	}
	public void setBorrowable(boolean borrowable) {
		this.borrowable = borrowable;
	}
	public boolean getBorrowalbe() {
		return borrowable;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public String getLender() {
		return lender;
	}
}
