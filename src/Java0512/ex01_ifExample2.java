/*
	Date : 2020.05.12
 	Author : 차호정
 	Description : ifExample2
 	Version : 1.0
 
*/


package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어, 영어, 수학점수를
		// 입력받아서 총점, 평균을 구하시오.
		// 평균 점수를 이용하여
		// A+, A, B+, B, C+, C, D+, D, F
		// 프로그램을 만들어보시오!

		Scanner sc = new Scanner(System.in);

		int kor, eng, mat;
		double tot, avg;
		String grade;

		System.out.println("국어 점수는 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수는 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수는 : ");
		mat = sc.nextInt();

		tot = kor + eng + mat;
		avg = tot / 3;

		if (avg <= 100) {
			if (avg > 90) {
				if (avg >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (avg > 80) {
				if (avg >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (avg > 70) {
				if (avg > 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (avg > 60) {
				if (avg > 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}

			System.out.println(" 총점은 " + tot + " 평균은 " 
			+ avg + " 당신의 학점은 " + grade + " 입니다. ");

		} else {
			System.out.println("입력 범위를 초과했습니다.");
		}

	} //main

} //class
