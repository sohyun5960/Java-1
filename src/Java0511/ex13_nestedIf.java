/*
Date : 2020.05.11
 	Author : 차호정
 	Description : 중첩 if문(nestedIf)
 	Version : 1.0
 
*/

package Java0511;

import java.util.Scanner;

public class ex13_nestedIf {

	public static void main(String[] args) {
		// 중첩 if문 : if문 안에 if문
		
		// 학점출력프로그램
		// 1. 100점을 초과하면
		// "입력범위를 초과했습니다." 출력
		// 2. 학점처리
		// A+ : 95~100
		// A : 90~95
		// B+ : 85~90
		// B : 80~85
		// C+ : 75~80
		// C : 70~75
		// D+ : 65~70
		// D : 60~65
		// F : 60미만
		// 3. print문은 1번만 사용
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score <= 100) {
			
			if(score >= 90) { //90~100
				if(score >=95) {
					grade = "A+";
				} else {
					grade = "A";
				}
				
			} else if(score >= 80) {
				if(score >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
				
			} else if(score >= 70) {
				if(score >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
				
			} else if(score >= 60) {
				if(score >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				} 
				
			} else {
				grade = "F";
			}
			
			System.out.println("당신의 학점은 : " + grade + "입니다!");
			
			
		} else {
			System.out.println("입력범위를 초과했습니다.");
		}
		
			
	}

}
