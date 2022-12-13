package day4;

import utils.KeyboardReader;

public class IfDemo5 {
	
	public static void main(String[] args) {
		/*
		 * 빠른 종료 사용하기
		 * 
		 * - 나쁜 조건을 먼저 찾아서 그 조건에 해당하는 경우(그 조건이 true로 판정되는 경우) 메소드의 실행을 종료시키는 것
		 * - 수행문이 실행될 수록 나쁜 조건을 모두 피해간 좋은 조건에 만족하는 경우만 자연스럽게 남게된다.
		 * - if문의 구조가 단순해지고, 로직을 이해하기 더 쉬워지고, 새로운 조건을 추가하는 것도 쉬워진다.
		 * - 코드의 가독성이 향상되고, 유지보수하기 쉬워진다.
		 * 
		 * 메소드 빠르게 종료시키기
		 *    return 키워드로 종료시키기
		 *        return문을 만나면 실행중인 메소드는 즉시 종료된다.
		 *          throw문을 만나면 실행중인 메소드는 즉시 종료된다.
		 *        throw 키워드로 예외(오류) 던지기
		 *          throw문을 만나면 실행중인 메소드가 즉시 종료되고, 그 메소드를 호출한 측에 예외객체가 전달된다.
		 */
		
		/*
		 * 국어, 영어, 수학점수를 입력받아서 합격여부, 장학금 지급여부를 출력하는 프로그램
		 * 평균점수가 60점이상이면 합격이고, 평균점수가 97점 이상이면 장학금 지급대상이다.
		 * 단, 한 과목이라도 40점 미만이면 과목낙제 불합격이다.
		 * 
		 * 위의 조건의 나쁜 내용을 찾아내는 조건으로 전환시킨다.
		 * 한 과목이라도 40점 미만이면 과목낙제로 불합격이다.
		 * 평균이 60점 미만이면 불합격이다.
		 * 평균이 97점 이상이면 장학금지급대상이다.
		 */
		
		KeyboardReader keyboard = new KeyboardReader();
		
		//sysout 입력하고 ctrl+space 국어점수 입력을 추가하고, ctrl+alt+아랫방향 화살표로 행 복사
		//int kor = keyboard.getInt(); 입력하고, ctrl+alt+아랫방향 화살표로 행 복사 2번
		//복사된 행에 커서 위치시키고, alt+아랫방향화살표 눌러서 행을 원하는 위치에 옮기기
		System.out.print("국어점수 입력: ");
		int kor = keyboard.getInt();
		System.out.print("영어점수 입력: ");
		int eng = keyboard.getInt();
		System.out.print("수학점수 입력: ");
		int math = keyboard.getInt();
		
		// 과목낙제가 있는 경우 메세지를 출력하고 main 메소드의 실행을 즉시 종료시킨다.
		if(kor < 40 || eng < 40 || math < 40) {
			System.out.println("과목 낙제로 불합격입니다.");
			return;
		}
		// 평균 계산
		int average = (kor + eng + math)/3;
		
		//평균 점수가 미달되는 경우 메세지를 출력하고 main메소드의 실행을 즉시 종료시킨다.
		if (average < 60) { 
			System.out.println("평균점수 미달로 불합격입니다.");
			return;
		}
		
		System.out.println("합격입니다");
		if (average >= 97) { 
			System.out.println("장학금 지급 대상입니다.");
		}
		
	}

}
