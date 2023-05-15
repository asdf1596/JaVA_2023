package s0515;

public class itemMain {

	public static void main(String[] args) {
		item phone = new item("갤럭시 S22+");
		phone.price = 900000;
		phone.printiteminfo();
		
		item phone2 = new item("Iphone 15", 1500);
		phone2.printiteminfo();
		
		item ram = new item("DDR5", 200);
		ram.printiteminfo();
		

	}

}
