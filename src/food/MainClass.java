package food;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 뭐먹지 프로그램
		// 디저트도 같이 추천해보자
		
		System.out.println("뭐먹지 프로그램 시작");
		// 메뉴를 추가(프로그램 자체에서 메뉴 설정)
		// 메뉴를 추가(이 프로그램 사용자가 직접 입력)
		// 메뉴들을 담을수 있는 공간을 만들기
		ArrayList<String> menuList = new ArrayList<String>();
		// 메인메뉴 리스트
		ArrayList<String> dessertList = new ArrayList<String>();
		// 디저트 리스트
		Scanner sc = new Scanner(System.in);

//		문자일 경우 
//		System.out.print("문자를 입력하시오: ");
//		String a = sc.nextLine(); // 문자를 입력 받기
//		System.out.println("당신이 입력한 문자는?" + a);
//		
//		숫자일 경우 
//		System.out.println("숫자를 입력하시오");
//		int b = sc.nextInt(); // 숫자를 입력 받기
//		System.out.println("당신이 입력한 숫자는? " + b);

		// 여기서 부터 반복
		while (true) {
			System.out.println("메뉴와 음료를 입력하시오(0을 입력하면 입력 종료)");
//		sc.nextLine();   // 숫자입력 받고 난뒤 엔터키값(개행문자) 처리하기 위해
			System.out.print("메인 메뉴입력: ");
			String menu = sc.nextLine(); // 메인 메뉴를 입력 받기
			System.out.print("디저트 메뉴입력: ");
			String dessert = sc.nextLine(); // 디저트 메뉴를 입력 받기
			System.out.println("등록된 메인 메뉴: " + menu);
			System.out.println("등록된 디저트 메뉴: " + dessert);
			// 만약에 입력값이 0 이면 반복문을 나가자
			if (menu.equals("0") && dessert.equals("0")) { // 문자열을 비교 할 때 equals 메소드를 사용
				break;
			}
			// 메뉴 리스트에 담기
			menuList.add(menu);
			dessertList.add(dessert);
		}
		// 여기까지 반복

//		System.out.println("당신이 입력한 메뉴의 갯수는? " + menuList.size());
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(0));
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(1));
//		System.out.println("당신이 입력한 메뉴는? " + menuList.get(2));
//		
		// 사용자가 여러개 입력을 한 메뉴를 한번에 출력하기 위해
//		for (int i=0; i<menuList.size(); i++) {
//			System.out.println("당신이 입력한 메뉴는? " + menuList.get(i));	
//		}
		for (String m : menuList) {
			System.out.println("당신이 입력한 메인 메뉴는? " + m);
		}
		for (String d : dessertList) {
			System.out.println("당신이 입력한 디저트 메뉴는? " + d);
		}

		// 메뉴들을 입력하고 저장된
		// 메뉴들 중에 하나를 알아서 추천
		// 추천 결과를 출력
		Random rnd = new Random();
		Random rnd2 = new Random();
		int rnum = rnd.nextInt(menuList.size());
		int r2num = rnd2.nextInt(dessertList.size());
		System.out.println("이 메뉴들 중에서 엄청난 알고리즘으로 ");
		System.out.println("선택된 메뉴 조합은~~ 두구두구두구두구 ");
		System.out.println(menuList.get(rnum) + " 그리고 " + dessertList.get(r2num) + " 입니다.");
		System.out.println("맛있게 드세요. 감사합니다.");

	}

}
