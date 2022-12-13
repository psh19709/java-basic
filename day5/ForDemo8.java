package day5;

import utils.KeyboardReader;

public class ForDemo8 {
	
	public static void main(String[] args) {
		
		KeyboardReader keyboard = new KeyboardReader();
		
		// 상수 선언하기 (한 번 정해진 값을 변경할 수 없는 저장소)
		//목표 펀드 자금
		final int MAX_FUND_AMOUNT = 1_000_000_000;
		// 현재 적립된 펀드자금을 저장하는 변수
		int currentFundAmount = 0;
		for(;;) {  // 반복횟수를 미리 예상할 수 없으므로 무한반복하도록 지정
			// 현재 적립금 펀드자금이 목표 펀드자금 이상 모금되면 기부 작업을 중단시킨다.
			if (currentFundAmount >= MAX_FUND_AMOUNT) {
				break;
			}
			System.out.print("기부액을 적으세요: ");
			int amount = keyboard.getInt();
			
			currentFundAmount += amount;
		}
		System.out.println("최종 펀드 자금: " + currentFundAmount);
	}

}
