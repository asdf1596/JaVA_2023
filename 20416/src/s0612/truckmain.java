package s0612;

public class truckmain {

	public static void main(String[] args) {
		truck mytruck = new truck();
		mytruck.carname = "프론티어";
		mytruck.ton = 5;
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname + "는 " + mytruck.ton + "톤을 실을 수 있다.");
	}

}
