/*
	Date : 2020.05.13
 	Author : 차호정
 	Description : reverseStar
 	Version : 1.0
 
*/


package Java0513;

public class ex07_reverseStar {
	public static void main(String[] args) {
		
		//*****	i = 1 	j = 5
		//*****	i = 2 	j = 4
		//*****	i = 3 	j = 3
		//*****	i = 4 	j = 2
		//*****	i = 5 	j = 1
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
