package day4;

import utils.KeyboardReader;

public class IfDemo2 {
	
	public static void main(String[] args) {
		/*
		 * if ~ else문
		 *      형식
		 *         if(조건식) { 
		 *         수행문1;
		 *         수행문2;
		 *         } else { 
		 *         수행문3;
		 *         수행문4;
		 *         }
		 *         * 수행문1, 수행문2는 조건식이 true로 판정될 때 실행된다.
		 *         * 수행문3, 수행문4는 조건식이 false로 판정될 때 실행된다.
		 *         * else 블록은 if 블록 없이 단독으로 사용할 수 없다.
		 */
		
		/*
		 * 고객명, 상품명, 가격, 구매수량을 입력받는다.
		 * 구매금액이 10만원 이상이면 "1만원권" 상품권을 지급한다.
		 * 그 외는 "무료커피쿠폰"을 지급한다.
		 * 
		 * 조건 : 구매금액이 10만원 이상일 때 true로 판정하는 조건식
		 * 수행문
		 *    조건식이 true로 판정될 때 - 1만원 상품권 지급
		 *    조건식이 false로 판정될 때 - 무료 커피쿠폰 지급
		 */
		
		KeyboardReader keyboaed = new KeyboardReader();
		
		System.out.print("고객명을 입력하세요: ");
		String name = keyboaed.getString();
		System.out.print("상품명을 입력하세요: ");
		String prodectName = keyboaed.getString();
		System.out.print("가격을 입력하세요: ");
		int price = keyboaed.getInt();
		System.out.print("구매수량을 입력하세요: ");
		int amount = keyboaed.getInt();
		
		int totalPrice = price*amount;
		
		System.out.println("=================================");
		System.out.println("고객명: " + name);
		System.out.println("상품명: " + prodectName);
		System.out.println("가격: " + price);
		System.out.println("구매수량: " + amount);
		System.out.println("구매가격: " + totalPrice);
		
		if (totalPrice >= 100000) {
			System.out.println("사은품: 1만원 상품권");
			
		} else {
			System.out.println("사은품: 무료 커피쿠폰");
			
		}
		System.out.println("=================================");
	}

}
