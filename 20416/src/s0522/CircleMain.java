package s0522;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(5);
		c1.print();
		Circle c2 = new Circle();
		c2.setRadius(8);
		c2.print();
		
		double r;
		System.out.print("반지름:");
		Scanner s = new Scanner(System.in);
		r = s.nextDouble();
		
		Circle c3 = new Circle();
		c3.setRadius(r);
		c3.print();
	}

}
