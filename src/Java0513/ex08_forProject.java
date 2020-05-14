package Java0513;

public class ex08_forProject {

	public static void main(String[] args) {
		
		//	   *
		//	  ***
		//	 *****
		//	*******
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			
			for(int j=1; j<=4-i; j++) {	
				System.out.print(" ");	
			}
			System.out.println();
		}
		
		// 줄 i
		// 공백 j
		// 별 k
		
		// 설정된 문자 사이의 관계를 파악
		// j = 4-i
		// k = 2i-1
		
		// 대 for문은 줄, 소1 for문은 공백,
		// 소2 for문은 별(*), 소3 for문은 공백
		
		
	}

}
