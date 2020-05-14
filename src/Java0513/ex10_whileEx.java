/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : while문 예제
 	Version : 1.0
 
*/

package Java0513;

public class ex10_whileEx {
	public static void main(String[] args) {
		// While문을 이용해서
		// 주사위를 던졌을 때
		// 5가 나오면 종료되는 프로그램을 만드시오.
		
		int cnt = 0;
		boolean run = true;
		//while(true) 일 때 반복문 실행
		//while(false) 일 때 반복문 종료.
		
		while(run) {
			
			int dice =(int)(Math.random() * 6) + 1;
			cnt++;
			System.out.println("주사위 값이 "+ dice + "이 나왔습니다.");
			
			if(dice == 5) {
				run = false;
			}	
		}
			System.out.println("\n던진 횟수 : " + cnt);
			System.out.println("프로그램을 종료합니다.");
	}
}
