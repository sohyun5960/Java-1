/*
Date : 2020.05.11
 	Author : 차호정
 	Description : 조건문연습문제1(ifExample1)
 	Version : 1.0
 
*/

package Java0511;

// 두번째
import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// 문제, 성적출력 예제
		// 점수를 입력받아서
		// 90점 이상이면 "A학점 입니다" 출력
		// A : 90~100
		// B : 80~90
		// C : 70~80
		// D : 60~70
		// F : 60미만
		
		
		// 첫번째
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하세요 : ");
		// 세번째
		int score = sc.nextInt();
		System.out.println("제 점수는요");
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		} else if(score >= 80) {
			System.out.println("B학점입니다");
		} else if(score >= 70) {
			System.out.println("C학점입니다");
		} else if(score >= 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		
		
	}

}
