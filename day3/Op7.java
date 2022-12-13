package day3;

import utils.KeyboardReader;

public class Op7 {
	public static void main(String[] args) {
			
		/*
		 * 설계도 (클래스)로 객체 생성하고, 참조하기
		 * 
		 *  KeyboardReader reader = new KeyboardReader();
		 *  
		 *  
		 *          - KeyboardReader reader는 reader 변수를 생성한다.
		 *          - reader는 KeyboardReader 타입의 변수다.
		 *              (reader 변수는 KeyboadReader 설계도로 생성된 객체의 주소값을 담는 변수다.)
		 *          - new 예약어
		 *              지정된 설계도로 객체를 생성한다.
		 *              생성된 객체의 주소값을 변수에 대입한다,
		 *         - new KeyboardReader() 는 KeyboardReader 설계도로 객체를 생성한다.
		 *         -reader = new KeyboardReader()은 생성된 객체의 주소값을 reader변수에 대입한다.
		 *         
		 *         - reader변수는 생성된 KeyboardReader 객체를 참조한다.
		 *         - reader변수를 이용해서 생성된 KeyboardReader 객체의 공개된 속성과 기능을 사용할 수 있다.
		 *         
		 *         reader.getInt();
		 *         reader변수가 참조하는 KeyboardReader객체의 getInt() 기능을 실행한다.
		 *         reader.getDouble();
		 *         reader변수가 참조하는 KeyboardReader객체의 getDouble() 기능을 실행한다.  /. <- 객체 접근 주소 그 객체 안에 있는 기능을 수행
		 *         
		 * 
		 */
		
		KeyboardReader reader = new KeyboardReader();
		
		System.out.print("이름을 입력하세요: ");
		String name = reader.getString();
		
		System.out.print("학년을 입력하세요: ");
		int grade = reader.getInt();
		
		System.out.print("국어점수를 입력하세요: ");
		int korScore = reader.getInt();
		
		
		System.out.print("영어점수를 입력하세요: ");
		int engScore = reader.getInt();
		
		System.out.print("수학점수를 입력하세요: ");
		int mathScore = reader.getInt();
		
		int totalScore = korScore + engScore + mathScore;
		int average = totalScore/3;
		
		System.out.println();
		System.out.println("이름  " + name);
		System.out.println("학년  " + grade);
		System.out.println("국어점수  " + korScore);
		System.out.println("영어점수  " + engScore);
		System.out.println("수학점수  " + mathScore);
		System.out.println("총점:    " + totalScore);
		System.out.println("평균:    " + average);
		
				
		
		
	}

}
