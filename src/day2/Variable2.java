package day2;

public class Variable2 {
	
	public static void main(String[] args) {
		// 각 자료형별 변수 생성과 초기화
		// 정수형
		byte b1 = 100;
		byte b2 = -100;
		                    //byte 자료형의 범위를 초과한다.
		short s1 = 10000;
		int i1 = 100_000;
		int i2 = 1_000_000;
		// int i3 = 1000_000_000_000;     // int 자료형의 범위를 초과한다.
		long l1 = 100_000_000_000L;      // 정수리터럴의 기본타입의 int 타입이기 때문에 int의 범위를 벗어나는 정수값을 적을 때는 숫자 끝에 L, l을 적는다.
		
		// 실수형
		float f1 = 10.0f;    //실수리터럴의 기본타입은 double타입이다. float 타입은 8byte 자료형이기 때문에 float는 8byte값을 저장할 수 없다.
		float f2 = -0.5f;    // 실수값을 float에 저장할 때는 F나 f를 적는다.
		double d1 = 10.0;
		double d2 = -0.5;
		
		// 문자형
		char c1 = 'A';   // 문자 'A'를 대입한다.
		char c2 = 65;    // 아스키코드표에서 65번째 글자가 대입된다. 아스키코드표에서 65번째 글자는 'A'이다.
		char c3 = '\u0041';  //유니코드표에서 0041코드에 해당하는 글자가 대입된다. 유니코드표에서 0041 코드에 해당하는 글자는 'A'다.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		/*
		 * Escape 문자
		 *    줄바꿈문자 \n
		 *    탭문자 \t
		 *    백스페이스문자 \ㅠ
		 *    역슬래시 \\ 
		 *    홀따옴표 \'   <--- 문자리터럴을 표현하는 '이 아닌 단순한 문자 '를 나타낸다.
		 *    쌍따옴표 \"   <--- 문자열 리터럴의 시작과 끝을 나타내는 "이 아닌 순수한 문자 "를 나타낸다.
		 */
		char c4 = '\'';
		char c5 = '\\';
		System.out.println(c4);
		System.out.println(c5);
			
		// 논리형
		boolean bool1 = true;
		boolean bool2 = false;
		//boolean bool3 = "true";    // 문자열  "true"
		// "true" 는 논리형 타입의 변수에 저장할 수 없다.
		//boolean bool4 = "false";   // 문자열 "false"는 논리형 타입의 변수에 저장할 수 없다.
		//boolean bool5 = 1;         // 1이 true를 나타내지 못한다
		//boolean bool6 = 0;         // 0이 false를 나타내지 못한다.
	}

}
