/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : forStar
 	Version : 1.0
 
*/

package Java0513;

public class ex06_forStar {

	public static void main(String[] args) {
		//for(int i=1; i<=5; i++) {
		//	for(int j=1; j<=5; j++) {
		//		if(i < j) {
		//			continue;
		//				}
		//		System.out.print("*");					
		//			}
		//	System.out.println();
		//		}
		
		// i = 1 에서 *(=j) 1개
		// i = 2 에서 *(=j) 2개
		// i = 3 에서 *(=j) 3개
		// i = 4 에서 *(=j) 4개
		// i = 5 에서 *(=j) 5개
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
