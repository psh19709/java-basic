package day5;

public class ForDemo4 {
	
	public static void main(String[] args) {
		/*
		 * for문과 if문 사용하기
		 */
		
		// 1~10까지의 정수 중에서 짝수의 합계를 계산하기
		/*
		 * evenNumTotal  num <= 10  evenNumTotal = evenNumTotal + num num++
		 * 0              1                                              2
		 * 0              2         evenNumTotal = 0            + 2      3
		 * 2              3                                              4
		 * 2              4         evenNumTotal = 2            + 4      5
		 * 6              5                                              6
		 * 
		 */
		int evenNumTotal = 0;
		int oddNumTotal = 0;
		for (int num = 1; num <= 10; num++) {
			if(num%2 == 0 ) {
				evenNumTotal += num;
			}
			else {
				oddNumTotal += num;
			}
		}
		System.out.println("짝수의 합계: " + evenNumTotal);
		System.out.println("홀수의 합계: " + oddNumTotal);
	}

}
