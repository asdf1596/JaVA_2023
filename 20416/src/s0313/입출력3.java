package s0313;

import java.util.Scanner;

public class 입출력3 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int sum;
		double avg;
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		num1 = s.nextInt();
		System.out.print("두번째 수 입력 : ");
		num2 = s.nextInt();
		System.out.print("세번째 수 입력 : ");
		num3 = s.nextInt();
		sum = num1 + num2 + num3;
		avg = sum/3.0;
		System.out.printf("합계 : %d 평균 : %.1f", sum, avg);
		s.close();
	}

}