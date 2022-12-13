package day1;

//클래스명이 Hello인 설계도를 정의한다.
//public : 공개된 설계도임을 나타내는 예약어
//class : 설계도를 정의할 떄 사용되는 예약어
//Hello : 설계도의 이름이다. 식별자
public class Hello {
	
	//메소드명이 main인 메소드를 정의한다.
	//public : 이 메소드는 공개된 메소드다. (예약어)
	//static : 이 메소드는 정적 메소드다. (예약어)
	//viod : 이 메소드는 반환값이 없는 메소드다. (예약어)
	//main : 메소드의 이름이다. (식별자)
	// String[] arge : 매개타입과 매개변수명
	public static void main(String[] args) {
		// 수행문
		// System.out : 시스템의 표준출력장치 - 모니터(혹은 콘솔화면)
		//System.in : 시스템의 표준입력장치 - 키보드
		//println() : 내용을 출력한다.
		// "Hello, java!" 문자열을 시스템의 표준 출력장치에 출력해라.
		System.out.println("Hello 김다은");
		System.out.println("지금 뛰쳐나가?");
		System.out.println("찬성");
		System.out.println('찬');
		System.out.println('성');
		System.out.println("찬성으로 2행시 하겠습니다;;");
	}
}

// 예약어 : 사용위치와 사용목적이 이미 결정된 키워드, 식별자로 사용할 수 없다.
//        public class static{ } 오류다.
// 식별자 : 다른 것(클래스, 메소드)과 구분되는 이름이다.
//        식별자는 개발자가 임의로 정하는 것이다.
