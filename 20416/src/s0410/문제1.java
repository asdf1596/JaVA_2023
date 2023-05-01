package s0410;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [5];
		int max = 0, i=0;
		System.out.println("정수 5개를 입력하세요");
		while(i<5) {
			System.out.print("입력:");
			num[i] = sc.nextInt();
			if(max < num[i]) {
			max = num[i];
					}
			i++;
			}
		System.out.println("최대값은 "+ max + "입니다.");
		}
}