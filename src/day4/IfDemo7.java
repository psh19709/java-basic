package day4;

import utils.KeyboardReader;

public class IfDemo7 {

	public static void main(String[] args) {
		/*
		 *  고객의 등급, 구매금액을 입력받아서 적립포인트를 계산하기
		 *  고객의 등급은 "골드", "실버", "브론즈" 중 하나다.
		 *  고객 등급은 'G', 'S', 'B' 중에 하나다.
	     *  '골드' 등급인 경우 구매금액의 3%을 포인트로 적립
	     *  '실버' 등급인 경우 구매금액의 3%을 포인트로 적립
	     *  '브론즈' 등급인 경우 구매금액의 3%을 포인트로 적립
		 */
		
		KeyboardReader keyboard = new KeyboardReader();
		
		System.out.print("고객 등급을 입력하세요: ");
		String grade = keyboard.getString();
		System.out.print("구매 금액을 입력하세요: ");
		int amount = keyboard.getInt();
		
		int point = 0;
		if (grade.equals("골드")) {
			point = (int)(amount*0.03);
		} else if (grade.equals("실버")) {
			point = (int)(amount*0.02);
		} else if (grade.equals("브론즈")) {
			point = (int)(amount*0.01);
		}
		
		System.out.println("고객등급: " + grade);
		System.out.println("구매금액: " + amount);
		System.out.println("적립포인트: " + point);
		
		}
	}
