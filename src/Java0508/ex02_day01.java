/*
	Date : 2020.05.08
	Author : hoon
	Description : Java 기본설정
	Version : 1.0

*/



package Java0508;

public class ex02_day01 {

	public static void main(String[] args) {
		
		String name;
		name = "차훈";
		String birth;
		birth = "3월 28일";
		int age;
		age = 23;
		String adr;
		adr = "인천광역시 부평구 청천동";                       // 주소: ~동
		String phone;
		phone = "010-2910-2837";
		String email;
		email = "lightnsalt91@gmail.com";
		String hobby;
		hobby = "음악감상, 스포츠 경기 감상";
		String speciality;
		speciality = "걷기";
		char blood;
		blood = 'O';
				
				
		String member1;
		member1 = "이소현";
		String member2;
		member2 = "김도연";
		String member3;
		member3 = "권택훈";
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.println("제 생일은 " + birth + " 이고, 나이는 " + age + ", 사는 곳은 " 
		+ adr + ",  휴대전화 번호는 " + phone + " 이고, 이메일 주소는 " + email + " 이고, 취미는" + hobby + ", 특기는 "
		+ speciality + ", 혈액형은" + blood + "입니다.");
		

	}

}
