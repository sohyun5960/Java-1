/*
	Date : 2020.5.14
	Author : 차호정
	Description : While문 예제2
	Version : 1.0
 
 */

package Java0514;

import java.util.Scanner;

public class Ex01_WhileEx2 {

	public static void main(String[] args) {
		// int account;
		// int balance;
		// boolean run = true;
		// int menu;
		//System.out.println("------------------------------");
		//System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		//System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int account = 0; // 입출금시의 돈 액수
		int balance = 0; // 통장 만들기 0원
		int menu;
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------------");
			
			System.out.println("선택 >>");
			menu = sc.nextInt();  //menu선언, 입력(초기화)
			
			
			switch(menu) {
			case 1:
				System.out.println("예금액 >>");
				account = sc.nextInt();
				balance += account;
				break; // Switch문 탈출
						
			case 2:
				System.out.println("출금액 >>");
				account = sc.nextInt();
				balance -= account;	
				break; // Switch문 탈출
				
			case 3:
				System.out.println("잔고는 " + balance + "원 입니다.\n" );	
				break; // Switch문 탈출
				
			case 4:
				run = false; // while문 종료
				break; 
				
			default:
				System.out.println("없는 항목입니다.\n다시 입력해주세요.\n");	
				break; // Switch문 탈출
			
			}//Switch문
			
		}//While문
		
		System.out.println("\n프로그램을 종료합니다.");
	
		
		
	}

}
