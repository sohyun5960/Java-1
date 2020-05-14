package Java0508;

public class ex02_변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고, 이름을 부여한 것
		
		// var num = 0;
		// [변수타입][변수명] = [변수값];
		
		int age = 35;
		
		int age1;   // 변수 선언
		age1 = 35;  // 변수 초기화
		
		int age2=11, age3=12, age4=13;
		age1 = 10;
		// 10을 age1에 대입한다.
		System.out.println("age1" + age1);
		
		//변수타입                         	 1byte	2byte	4byte	8byte
		// 1. 정수형			  	 byte	short	int		long
		// 2. 실수형								float	double
		// 3. 문자형 char
		// 4. 논리형 boolean
		
		
		
		//byte
		//1byte = 8bit
		//1byte = -2^7 ~ (2^7)-1
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		// 4byte = 32bit
		// 4byte = -2^31 ~ (2^31)-1
		// int : -2,147,483,648 ~ 2,147,483,647
		
		int bNum3 = -129;
		int bNum4 = 128;
		
		
		// 8byte = 64bit
		// 8byte = -2^63 ~ (2^63)-1
		// long : 매우 크다

		int iNum1= -2147483648;
		int iNum2= 2147483647;
		
		long iNum3 = -124446767344534L;
		// 변수 값에는 L을 썼지만 출력은 되지 않는다.
		long iNum4 = 4200298384029293L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		//실수형
		//float(4byte), double(8byte)
		
		float pi1 = 3.14f;
		double pi2 = 3.14;
		
		 
		// long은 L 추가
		// float는 f 추가
		
		
		
		
	}

}
