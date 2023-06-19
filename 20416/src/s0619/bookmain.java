package s0619;

public class bookmain {

	public static void main(String[] args) {
		System.out.println(book.getLibrary() + "의 현재 도서는 " + book.getBookCnt() + "권입니다.");
		System.out.println("*****************************************");
		book b1 = new book();
		b1.setNo(101);
		b1.setName("구름빵");
		b1.setCount(10);
		b1.setBorrow(0);
		b1.printInfo();
		book b2 = new book(102, "수박수영장");
		b2.setCount(5);
		b2.setBorrow(0);
		b2.printInfo();
		book b3 = new book();
		b3.setNo(103);
		b3.setName("강아지똥");
		b3.setCount(15);
		b3.setBorrow(0);
		b3.printInfo();
		System.out.println("*****************************************");
		System.out.println(book.getLibrary() + "의 현재 도서는 " + book.getBookCnt() + "권입니다.");
		System.out.println("*****************************************");
		b1.borrowBook(15);
		b2.returnBook(2);
		b1.borrowBook(5);
		b3.borrowBook(10);
		b3.returnBook(5);
		System.out.println("*****************************************");
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
	}

}
