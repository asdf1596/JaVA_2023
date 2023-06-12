package s0612;

public class cafemain {

	public static void main(String[] args) {
		cafe c1 = new cafe();
		c1.maketea(3);
		c1.maketea(3, 5);
		c1.maketea(2, 5, 10);
		c1.printcount();

		cafe c2 = new cafe();
		c2.maketea(1);
		c2.maketea(1, 2);
		c2.maketea(3, 4, 2);
		c2.printcount();
	}
}