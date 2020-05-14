/*
	Date : 2020.5.14
	Author : 차호정
	Description : do-while문 예제(Up&Down게임)
	Version : 1.0
 
 */


package Java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!
		
		int answer = (int)(Math.random() * 45) + 1; // 숫자 1~45 중에 하나를 랜덤으로 고르기
		int input = 0; // 맞추기 위해 입력할 수 선언 및 초기화
		int count = 0; // 맞추기 위해 실행한 횟수 선언 및 초기화
		
		boolean run = true; // do-while을 계속 실행시키기 위해서 
		                    //boolean 객체 선언 및 true로 초기화
		
		Scanner sc = new Scanner(System.in); //입력을 넣기 위한 Scanner객체 선언
		System.out.println("Up & Down Game 시작!"); 
		
		do {
			System.out.println("1부터 45까지 숫자를 말하세요!");
			input = sc.nextInt(); // 맞추기 위해 입력할 공간 생성
			count++; // 숫자를 한번씩 입력할 때마다 카운트 1씩 증가
			
		
			if(answer > input) {
				System.out.println("Up! 더 큰수를 말하세요!");
			} else if(answer < input ) {
				System.out.println("Down! 더 작은수를 말하세요!");
			} else {
				System.out.println("정답은 " + answer + " 입니다.");
				System.out.println("시도한 횟수는 " + count + " 번 입니다.");
				
				if(count<=3) {
					System.out.println("\n통과!");
				} else {
					System.out.println("\n벌칙!");
				} // 3번 안에 맞출 때 통과, 3번 넘으면 벌칙이 나오도록 if문 설정
				
				run = false; // do-while문 종료
			}
			
			
		}while(run); // 조건식 = run 동안 do-while문 반복
		
		
		
		
		
		
		
		
		
		
		
	}

}
