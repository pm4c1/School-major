package s21207_java04;

import java.util.*;

public class S21207_00_Atm {
	static int bankAcount;
	int acount;
	
	public static void main(String[] args) {
		S21207_00_Atm a = new S21207_00_Atm();
		S21207_00_Atm b = new S21207_00_Atm();
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\r메뉴 선택 : 1.입금 2.출금 9.종료");
			int selectMenu= sc.nextInt();
			
			if(selectMenu == 9) {
				System.out.println("\r이용해 주셔서 고맙습니다^^");
				break;
			}
			if(selectMenu < 1 || selectMenu > 2) {
				System.out.println("\r올바른 값을 입력해주세요.");
				continue;
			}
			System.out.println("\r계좌 선택 : 전메뉴 = 0  A = 1  B = 2  종료 = 9");
			int selectAcount = sc.nextInt();
			
			if(selectMenu == 9) {
				System.out.println("\r이용해 주셔서 고맙습니다^^");
				break;
			}
			if(selectAcount < 1 || selectAcount > 2) {
				System.out.println("\r올바른 값을 입력해주세요.");
				continue;
			}
			
			System.out.println("\r금액 입력 : ");
			int money = sc.nextInt();
			
			if(selectMenu == 1) {
				if(selectAcount == 1) {
					a.acount += money;
					a.bankAcount += money;
				}
				if(selectAcount == 2) {
					b.acount += money;
					b.bankAcount += money;
				}
			}
			if(selectMenu == 2) {
				if(selectMenu == 1) {
					a.acount -= money;
					a.bankAcount -= money;
				}
				if(selectMenu == 2) {
					b.acount -= money;
					b.bankAcount -= money;
				}
			}
			System.out.println("A잔액: " + a.acount + " 총금액: " + a.bankAcount);
			System.out.println("B잔액: " + b.acount + " 총금액: " + b.bankAcount);
			System.out.println("총금액: " + S21207_00_Atm.bankAcount);
		}while(true);
		System.out.println("이용해 주셔서 고맙습니다^^7");
	}
}
