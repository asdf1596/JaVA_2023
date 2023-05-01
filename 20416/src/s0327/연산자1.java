package s0327;

import java.util.Scanner;

public class 연산자1 {
	public static void main(String[] args) {
		int a;
		String c;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		a = sc.nextInt();
		c = (a%2==0) ? ("는(은) 짝수입니다.") : ("는(은) 홀수입니다.");
		System.out.println(a+c);
	}

}