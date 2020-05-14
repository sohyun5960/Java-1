/*
	Date : 2020.05.12
 	Author : 차호정
 	Description : maxNumber
 	Version : 1.0
 
*/

package Java0512;

import java.util.Scanner;

public class ex03_maxNumber {
	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수를 출력하기
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2, max;
//		
//		System.out.println("첫번째 숫자 >> ");
//		num1 = sc.nextInt();
//		System.out.println("두번째 숫자 >> ");
//		num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		System.out.println("최댓값 : " + max);
//		

		// 숫자 3개를 입력받아서 최댓값 구하기
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		
		System.out.println("첫번째 숫자 >> ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 >> ");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자 >> ");
		num3 = sc.nextInt();

// 첫번째 방법		
		if(num1 > num2) {
			if(num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else if(num2 > num3) {
			max = num2;
			} else {
				max = num3;
			} 

// 두번째 방법		
//		if(num1 > num2 && num1 > num3) {
//			max = num1;
//		} else if(num2 > num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
		
		System.out.println("최댓값 : " + max);
		}
}
