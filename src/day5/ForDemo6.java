package day5;

public class ForDemo6 {
	
	public static void main(String[] args) {
		/*
		 * 다중 for문
		 *     for문 내부에 for문을 포함하고 있는 구문
		 *     
		 *     형식
		 *        for (int i = 0; i <= 3; i++) {     // 3회 반복
		 *            수행문1;
		 *            for (int j=1; j <= 5; j++) {   // 5회 반복
		 *                수행문2;
		 *                }
		 *            }
		 *            * 수행문1은 3번 실행된다.
		 *            * 수행문2는 15번 실행된다.
		 *            * 안쪽 for문이 3번 실행될 때 마다 j는 1로 초기화된다.
		 */
		
		for ( int i = 1; i <= 3; i++) {
			System.out.println("수행문: " + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("수행문2 :  ("+i+", "+j+")");
			}
		}
	}

}
