/*
	Date : 2020.05.08
	Author : hoon
	Description : Java 기본설정
	Version : 1.0

*/


package Java0508;

public class ex02_char {

	public static void main(String[] args) {
		
		//변수타입                         1byte	2byte	4byte	8byte
				// 1. 정수형			 byte			int		long
				// 2. 실수형							float	double
				// 3. 문자형
				// 4. 논리형
		
		
		
		//문자형 변수타입 char(2type)
		char ch1;
		ch1 = 'A';
		
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		
		char ch2  = 'B';
		System.out.println((int)ch2);
		
		char ch3  = 'a';
		char ch4  = 'b';
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;
		System.out.println((char)num1);
		// 숫자를 문자형으로 바꿀 때 변수명 앞에 (char)
		
		// 문제!
		// 본인이름을 숫자로 표시해보세요.
		char ch5 = '차';
		char ch6 = '호';
		char ch7 = '정';
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)ch7);
		
		int num2 = 52264;
		System.out.println((char)num2);
		int num3 = 54840;
		System.out.println((char)num3);
		int num4 = 51221;
		System.out.println((char)num4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
