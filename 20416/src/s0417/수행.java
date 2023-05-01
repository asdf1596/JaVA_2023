package s0417;

import java.util.Scanner;

public class 수행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0, i = 0;
		for (i=0;i<5;i++) {
			System.out.print((i+1) + "번째 정수 : ");
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("입력한 값들 중 최대값은 "+max+" 입니다.");

	}

}
