package day2;

public class Variable1 {

	public static void main(String[] args) {
		// 변수의 생성과 초기화
		/* 
		 * 변수의 생성
		 *      자료형 변수명;
		 *      예시
		 *          int age;             //정수값을 담는 저장소를 생성하고, 그 저장소의 이름을 age로 지정함
		 *          double weight;       //실수값을 담는 저장소를 생성하고, 그 저장소의 이름을 weight로 지정함
		 *          boolean is Success;  // 논리값(true/false)을 담는 저장소를 생성하고, 그 저장소의 이름을 isSuccess로 지정함
		 *          char grade;          // 문자 하나를 담는 저장소를 생성하고, 그 저장소의 이름을 grade로 지정함
		 * 변수의 초기화
		 *      변수 생성싯점에 변수를 초기화하기
		 *          자료형 변수명 = 초기값;
		 *          예시
		 *              int age = 19;     //정수값을 담는 저장소 생성, 저장소명을 age를 지정하고, 19를 저장소에 저장함
		 *              double weight = 69.5;
		 *              boolean isSuccess = false;   // 논리값을 담는 저장소 생성, 저장소명을 isSuccess로 지정, 예약어 false가 나타내는 값이 저장소에 지정됨
		 *              char grade = 'B';
		 *              
		 *      변수 생성 후에 변수를 초기화하기
		 *          자료형 = 변수명;  // 변수 생성
		 *          변수명 = 값;     // 변수 초기화
		 *          예시 
		 *               int age;
		 *               age = 10;
		 */
		
		// 변수의 생성과 초기화 실습
		// 국어점수, 영어점수, 수학점수를 저장하고 출력하기
		
		int korScore = 100;
		int mathScore = 80;
		int engScore = 90;
		
		// 저장소명이 korScore인 저장소에 저장된 값을 출력하라.
		System.out.println(korScore);
		System.out.println(mathScore);
		System.out.println(engScore);
		// 저장소명이 korScore인 저장소에 저장된 값, engScore인 저장소에 저장된 값, mathScore인 저장소에 저장된 값을 더하고 연산결과를 출력하라.
		System.out.println(korScore + mathScore + engScore);
		System.out.println((korScore + mathScore + engScore)/3);
		
		
		System.out.println("박수현"); // 문자열 "박수현"을 출력하라
		int 박수현 = 100;
		System.out.println(박수현);   // 저장소명이 박수현인 저장소에 저장된 값을 출력하라.
		// 따옴표 안에 있는 것은 문자로 인식하여 그대로 출력하지만 그렇지 않은 것들은 저장소에 저장된 값을 출력한다.(개인적으로 적은 것)
	}

}
