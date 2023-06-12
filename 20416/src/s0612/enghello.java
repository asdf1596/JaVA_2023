package s0612;

public class enghello extends greeting{
	public String name = "Mr.Hong";
	public void sayhello() {
		System.out.println(name + "Nice to meet you");
	}
	public void test() {
		System.out.print(super.name);
		super.sayhello();
	}
	public static void main(String[] args) {
		enghello eng = new enghello();
		eng.sayhello();
		eng.test();
	}
	
	
	
	
}
