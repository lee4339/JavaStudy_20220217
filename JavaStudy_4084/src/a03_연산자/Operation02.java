package a03_연산자;

public class Operation02 {

	public static void main(String[] args) {
		System.out.println(); // Sysout 입력 후  Ctrl+space 자동완성기능
		
		int num1 = 10;
		int num2 = 30;
		// num2++;
		System.out.println(num1 + (num2++));
		System.out.println(num2);
		
		
		System.out.println();
		/*
		 * 정수형 변수 dan = 2
		 * 정수형 변수 num = 1
		 * 정수형 변수 result = dan * num
		 * 
		 * 2 X 1 = 2
		 * 
		 */
		int dan = 2;
		int num = 1;
		int result = dan * num;
		System.out.println(dan + " X " + num + " = " + result);
		
		System.out.println();
		
		int year = 2022;
		int month = 2;
		int day = 21;
		//2023년 3월 22일
		//year++; 
		//month++; 
		//day++;       하거나
		System.out.println((++year) + "년 " + (++month) + "월 " + (++day) + "일");
		
	}

}
