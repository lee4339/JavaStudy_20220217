package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복 횟수를 입력: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		

	}

}
}
