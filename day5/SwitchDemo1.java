package day5;

import java.util.GregorianCalendar;

public class SwitchDemo1 {
	
	public static void main(String[] args) {
		/*
		 * switch문
		 *       형식
		 *        switch(비교값) {
		 *          case값1:
		 *              수행문1;
		 *              수행문2;
		 *              break;
		 *          case 값2:
		 *              수행문3;
		 *              수행문4;
		 *              break;
		 *         default:
		 *              수행문5;
		 *              수행문6;
		 *              
		 *       }
		 *       * 비교값의 타입은 문자, 정수, 문자열만 가능하다.
		 *       * 각각의 case마다 수행문의 맨 마지막 break문이 필요하다.
		 *       * 비교값이 값1과 일치하면 수행문1, 수행문2가 실행되고, break문을 만나서 switch문을 빠져나간다.
		 *       * default는 비교값이 값1, 값2와 전부 일치하지 않을 때 실행할 수행문을 정의한다.
		 *       * break문은 switch문과 반복문 안에서만 사용가능하다.
		 */
		
		String grade = "브론즈";
		int orderPrice = 300000;
		
		int point = 0;
		switch (grade) {
		case"골드":
		System.out.println("골드등급 고객의 포인트를 계산 중.");
		point = (int)(orderPrice*0.03);
		case"실버":
			System.out.println("실버등급 고객의 포인트를 계산 중.");
			point = (int)(orderPrice*0.02);
		case"브론즈":
			System.out.println("브론즈등급 고객의 포인트를 계산 중.");
			point = (int)(orderPrice*0.01);
		default:
			System.out.println("등급이 없는 고객의 포인트를 계산 중.");
			point = (int)(orderPrice*0.005);
		break;
		}
		
		System.out.println("=============================");
		System.out.println("고객등급: " + grade);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("고객등급: " + point);
		System.out.println("=============================");
	}

}
