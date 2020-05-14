import java.util.Scanner;

/*
 
 	Date : 2020.05.11
 	Author : 차호정
 	Description : 계산기(calculator)
 	Version : 1.0
 
 
 */



public class ex09_계산기 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아서
		// 결과를 출력해보자!
		
		
		// int도 가능하고 double(소수점 자리까지)도 가능함
		double num1;
		double num2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		
		// +, -, x, /, %
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);
		result = num1 / num2;
		System.out.println("나눗셈결과 : " + result);
		result = num1 % num2;
		System.out.println("나머지결과 : " + result);
		
		
		
		
	}

}
