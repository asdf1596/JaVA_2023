package s0327;

import java.util.Scanner;

public class 연산자2 {
	public static void main(String[] args) {
		int a, b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자a 입력:");
		a = sc.nextInt();
		System.out.print("숫자b 입력:");
		b = sc.nextInt();
		System.out.print("입력:");
		op = sc.next().charAt(0);
		
		if (op == '+') 
			System.out.println(a + " + " + b + " = " +(a+b));
		else if (op == '-') 
			System.out.println(a + " - " + b + " = " +(a-b));
		else if (op == '*') 
			System.out.println(a + " * " + b + " = " +(a*b));
		else if (op == '/') 
			System.out.println(a + " / " + b + " = " +(a/b));
		else
			System.out.println("사칙연산자가 아닙니다.");
	}

}
