package day4;

public class IfDemo4 {
	
	public static void main(String[] args) {
		
		/*
		 * 내포된 if 문
		 *    형식
		 *       if(조건식) {
		 *       수행문1;
		 *       
		 *       // 내포된 if문
		 *       if (조건식2) {
		 *       수행문2;
		 *       }
		 *      } else {
		 *      수행문3;
		 *      }
		 *      * 내포된 if문은 if블록, else블록 내부에 정의된 if문이다.
		 *      * 내포된 if문은 조건식1이 true로 판정될 때만 조건식2을 검사해서 수행문2의 실행의 제어하는 if문이다.
		 */
		
		/*
		 * 평균 정수가 60점 이상이면 합격이고, 그 외는 불합격이다.
		 * 평균 점수가 97점 이상이면 장학금 지급대상이다.
		 */
		
		int average = 100;
		if (average >= 60) {
			System.out.println("합격입니다");
			
			// 내포된 if문이다. 장학금 지급대상인지 여부는 합격자에 한해서만 검사하자.
			if(average >= 97) {
				System.out.println("장학금 지급 대상입니다");
			}
		} else { 
			System.out.println("불합격입니다");
		}
		
	}
}
