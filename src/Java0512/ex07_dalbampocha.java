/*
 	Date : 2020.05.12
 	Author : 이소현, 차호정, 김도연, 권택훈 (4조)
 	Description : dalbampocha
 	Version : 1.0
 */

package Java0512;

import java.util.Scanner;

public class ex07_dalbampocha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int price1 = 0;
		int price2 = 0;
		int tot;
		String menu1 = "";
		String menu2 = "";
		
		System.out.println("달밤포차에 오신 것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다.\n");
		
		System.out.println("1. 바지락술찜 \t\t 2. 곱창전골");
		System.out.println("3. 무뼈닭발 \t\t 4. 돼지껍데기\n");
		
		System.out.println("메인메뉴를 선택해 주세요 >> ");
		num1 = sc.nextInt();
		
		System.out.println("\n5. 참이슬 후레쉬 \t\t 6. 진로 이즈백");
		System.out.println("7. 테라 \t\t\t 8. 클라우드");
		System.out.println("9. 주문안함");
		
		System.out.println("주류를 선택해 주세요 >> ");
		num2 = sc.nextInt();
		
		switch(num1) {
		case 1:
			menu1 = "바지락술찜";
			price1 = 12000;
			break;
		case 2:
			menu1 = "곱창전골";
			price1 = 18000;
			break;
		case 3:
			menu1 = "무뼈닭발";
			price1 = 13000;
			break;
		case 4:
			menu1 = "돼지껍데기";
			price1 = 12000;
			break;
	    default:
	    	System.out.println("해당 메뉴는 없습니다!");
	    	break;
		}
		switch(num2) {
		case 5:
			menu2 = "참이슬 후레쉬";
			price2 = 4500;
			break;
		case 6:
			menu2 = "진로 이즈백";
			price2 = 4500;
			break;
		case 7:
			menu2 = "테라";
			price2 = 5000;
			break;
		case 8:
			menu2 = "클라우드";
			price2 = 5500;
			break;
		case 9:
			menu2 = "주문안함";
			price2 = 0;
	    default:
	    	System.out.println("해당 메뉴는 없습니다!");
	    	break;
		}
		
		
		if(num1 >= 1 && num1 <= 4) {
			System.out.println("\n주문하신 메인메뉴는 " + menu1);
		}
		if(num2 >= 5 && num2 <= 9) {
			System.out.println("주문하신 주류는 " + menu2);
		}
		
		tot = price1 + price2;
		System.out.println("\n메인메뉴는 " + price1 + "원 입니다.");
		System.out.println("주류는 " + price2 + "원 입니다.");
		System.out.println("총 가격은 " + tot + "원 입니다.");
		System.out.println("이용해주셔서 감사합니다.");
		
		
	}
}
