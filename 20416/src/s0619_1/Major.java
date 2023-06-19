package s0619_1;

public class Major extends book{
	String subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("전공 분야는 "+subject+"입니다");
	}
	
}
