/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : forSnumToLnum
 	Version : 1.0
 
*/

package Java0513;

import java.util.Scanner;
public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		// for문 사용해서
		// 두개의 정수(시작값, 끝나는 값)를 입력받아서
		// 총합을 구하는 프로그램 만들어 보시오.
		
		Scanner sc = new Scanner(System.in);
		
		int Snum = 0;
		int Lnum = 0;
		int Sum = 0;
		
		System.out.println("시작값 >>");
		Snum = sc.nextInt();
		System.out.println("끝나는 값 >>");
		Lnum = sc.nextInt();
		
		for(int i = Snum; i <= Lnum; i++) {
			Sum += i;  // Sum = Sum + i;
			
			if(i < Lnum) {
				System.out.print(i + "+");
			} else {
				System.out.println(i + "=" + Sum);
			}	
		}
		System.out.println("시작값부터 끝나는 값까지의 총합은 : " + Sum);
		
	}

}
