/*
 
	Date : 2020.05.08
	Author : 본인이름
	Description : ex02_String
	Version : 1.0
 
 
 
 
 */


package Java0508;

public class ex02_String {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "재미있어";
		String str3 = "너무 어려워";
		
		String result;                //변수 선언
		result = str1 + str2;         //변수 초기화
		System.out.println(result);
		
		result = str1 + str3;         //변수 초기화
		System.out.println(result);
		
		result = str1 + 8.0;
		System.out.println(result);
		
		System.out.println(str1 + str2);
		System.out.println(str1 + " 너무 " + str2);
		
		
	}

}
