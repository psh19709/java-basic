package day5;


import utils.KeyboardReader;

public class ForDemo5 {
	
	public static void main(String[] args) {
		/*
		 * for문과 if문 사용하기
		 */
		
		//정수 2개를 입력받아서 첫번째 정수부터 두번째 정수까지의 합계를 계산하기
		//단, 첫번째 숫자가 두번째 숫자보다 작을 때만 합계를 구한다.
		
		KeyboardReader keyboard = new KeyboardReader();
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int firstNum = keyboard.getInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int seconNum = keyboard.getInt();
//		
//		if(firstNum < seconNum) {
//			int total = 0;
//			for (int num = firstNum; num <= seconNum; num++) {
//				total += num;
//			}
//			System.out.println("["+firstNum+"] ~ ["+seconNum+"] 합계: " + total);
//		} else {
//			System.out.println("숫자 범위가 올바르지 않습니다.");
//		}
		
		
		// 빠른 종료를 사용한 경우
		if(firstNum >= seconNum) {
			System.out.println("숫자 범위가 올바르지 않습니다.");
			return;
		}
		int total = 0;
		for (int num = firstNum; num <= seconNum; num++) {
			total += num;
		}
		System.out.println("["+firstNum+"] ~ ["+seconNum+"] 합계: " + total);
	}
}
