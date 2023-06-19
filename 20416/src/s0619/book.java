package s0619;

public class book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private static final String Library = "로봇도서관";
	private static int bookCnt = 0;
	book(){
		bookCnt++;
	}
	book(int no, String name){
		this();
		this.no = no;
		this.name = name;
	}
	public book(int no, String name, int count, int borrow) {
		this(no,name);
		this.count = count;
		this.borrow = borrow;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBorrow() {
		return borrow;
	}
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	public static int getBookCnt() {
		return bookCnt;
	}
	public static void setBookCnt(int bookCnt) {
		book.bookCnt = bookCnt;
	}
	public static String getLibrary() {
		return Library;
	}
	void printInfo(){
		System.out.print("번호:"+getNo());
		System.out.print(" 도서명:"+getName());
		System.out.print(" 도서개수:"+getCount());
		System.out.println(" 대여개수:"+borrow);
	}
	void borrowBook(int cnt) {
		if (count >= cnt) {
			System.out.println(no+"번 도서 " + cnt+ "권 대출 성공");
			borrow+=cnt;
			count-=cnt;
		}else {
			System.out.println(no+"번 도서 " + cnt+ "권 대출 실패");
		}
	}
	void returnBook(int cnt) {
		if(borrow < cnt) {
			System.out.println(no + "번 도서 " + cnt + "권 반납 실패");
		}else {
			System.out.println(no + "번 도서 " + cnt + "권 반납 성공");
			count +=cnt;
			borrow-=cnt;
		}
	}
}
