package s0410;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("입력:");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++) {
			if (i%2==0)
				System.out.print("+");
			else
				System.out.print("-");
			System.out.print(i+1);
		}
		if (num%2==0)
			sum = num/2*-1;
		else
			sum = (num+1)/2;
		System.out.println("=" + sum);

	}

}
