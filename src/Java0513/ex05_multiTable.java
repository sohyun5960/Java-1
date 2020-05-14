/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : 구구단(multiTable)
 	Version : 1.0
 
*/

package Java0513;

public class ex05_multiTable {
	public static void main(String[] args) {
		// 중첩for문을 이용하여
		// 구구단을 작성해라
		// 2단부터 9단까지
		// 응용문제(홀수의 단만 출력)
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j%2 ==0) {
					continue;
				}
				System.out.print(j + "x" + i + "=" + j*i); 
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
