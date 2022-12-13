package day5;

public class ForDemo7 {
	
	public static void main(String[] args) {
		/*
		 * 반복문에서 break와 continue의 사용
		 *     break문
		 *          반복문을 탈출한다.
		 *          반복작업을 수행하는 중에 원하는 목적을 이뤘을 때 반복 작업을 지속하는 거은 의미가 없으므로 break로 탈출한다.
		 *     continue문
		 *          수행문이 남아 있어도 반복문의 증감식으로 프로그램 실행흐름을 이동시킨다.
		 *          반복작업을 수행하는 중에 조건에 해당하지 않은 반복작업을 실행하지 않고, 다음 번 반복을 수행하러 가기 위해서 continue를 사용한다.
		 *          
		 *    * break나 continue는 반드시 제어문(if문)과 함께 사용해서 특정 조건이 만족될 때 동작하도록 구현해야 한다.
		 *    * 반복문 안에서 break나 continue를 사용하면 코드의 가독성이 나빠진다.
		 */
		
		// break의 사용
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println("i값: " + i);
		}
		
		// continue의 사용
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println("i값: " + i);
		}
	}
}
		


