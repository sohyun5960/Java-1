/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : 반복문 while
 	Version : 1.0
 
*/

package Java0513;

public class ex09_while {

	public static void main(String[] args) {
		
		// while
		/*
			while(반복조건){
				
				실행내용
				
			}
		 */
		
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\nsum : " + sum);
		
		// for(초기화식; 조건식; 증감식)
		
		// 초기화식
		// while(조건식){
		// 		증감식
		//}

	}

}
