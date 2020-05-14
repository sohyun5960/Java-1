/*
	Date : 2020.05.12
 	Author : 차호정
 	Description : 조건문switchCase
 	Version : 1.0
 
*/

package Java0512;

import java.util.Scanner;

public class ex04_swtichCase {
	public static void main(String[] args) {

		/*
		 * switch(조건변수) { case 변수값1: 해당 조건이 맞을 때 실행 break; case 변수값2: 해당 조건이 맞을 때 실행
		 * break; ~~~~~~~ case 변수값n: 해당 조건이 맞을 때 실행 break; default: case에서 어떤 조건도 맞지 않을
		 * 때 실행 break; }
		 */

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("숫자 입력 >> ");
		num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println("0을 입력했습니다.");
			break;

		case 1:
			System.out.println("1을 입력했습니다.");
			break;

		case 2:
			System.out.println("2을 입력했습니다.");
			break;
		default:
			System.out.println("그 외에 숫자를 입력했습니다.");
			break;
		}

		// break문은 다음 case문을 실행하지 않고
		// switch문을 빠져나가기 위해 사용한다.
		// break가 없으면 case가 연속으로 실행
			
	}
}
