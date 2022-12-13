package day2;

public class Variable4 {
	
	public static void main(String[] args) {
		/*
		 * 기본 자료형의 형변환
		 *            - 형변환의 값의 타입이 변하는 것이다.(절대로, 변수의 타입은 변하지 않는다.)
		 *            - 형변환의 예시
		 *                정수 <----> 실수
		 *                정수 <----> 문자
		 *                
		 *            - 형변환의 종류
		 *                자동 형변환
		 *                   * 컴파일러가 자동으로 값의 타입을 변환 시키는 것
		 *                     예시
		 *                          * 연산에 참여하는 값의 타입이 서로 다를 때 자동으로 형변환 시키는 것
		 *                          * 조건) 테이터가 손실되지 않는 방향으로의 형변환만 가능하다.
		 *                               double x = 3;    // 3 -> 3.0으로 변환(데이터 손실 없음), 자동형변환이 된다.
		 *                               int = 3,14;      // 3.14 -> 3으로 변환 (데이터 손실 있음), 문법오류 발생
		 *                               
		 *                강제 형변환
		 *                    * 개발자가 명사적으로 값을 형변환을 정의하는 것
		 *                    *형변환 연산자를 사용해여 명시적으로 형변환을 지정한다.
		 *                        예시
		 *                            int x = (int) 3.14;
		 *                            
		 *                            int subjectCount = 3;
		 *                            int subjectTotalScore = 230;
		 *                            double subjectAverage = ((double) subjectTotalScore)/subjectCount;
		 *                          
		 */
		
		// 대입 연산에서 변수의 타입은 double, 값의 타입은 int이다.
		// 변수의 타입은 변할 수 없으므로, 값의 타입을 변수의 타입과 같은 double로 변환한다.
		// 값이 3에서 3.0으로 변환되었다. 데이터의 손실이 발생하지 않았다.
		// 자동형변환이 완료되고, 3.0이 num1에 대입된다.
		double num1 = 3;
		System.out.println(num1);
		
		
		// 대입 연산에서 변수의 타입은 int, 값의 타입은 double이다.
		// 변수의 타입은 별할 수 없으므로, 값의 타입을 변수의 타입과 같은 int로 변환한다.
		// 값이 3.14에서 3으로 변환되면 데이터손실이 발생한다.
		// 데이터 손실이 발생하는 형변환이기 때문에 문법오류가 발생한다.
		// int num2 = 3.14;   //문법 오류다.
		
		
		// 대입 연산에서 변수의 타입은 char, 값의 타입은 정수다.
		// 변수의 타입은 별할 수 없으므로, 값의 타입을 변수의 타입과 같은 char로 변환한다.
		// 자바는 유니코드 문자표에서 65번째 글자 찾는다. 65를 'A'로 변환한다.
		// 자동형변환이 완료되고, 'A'가 ch1에 대입된다.
		char ch1 = 65;
		int ch2 = 'A';
	    System.out.println(ch1);
	    System.out.println(ch2);
	    
	    
	    // 개발자가 실수값을 정수타입으로 변환하라고 명시적으로 선언하고 있다.
	    // 컴파일러는 데이터의 손실이 발생하더라고 3.14를 3으로 변환한다.
	    // number3 변수에 3이 대입된다.
	    int number3 = (int) 3.14;
	    System.out.println(number3);
	    
	    
	    //변수명에 형변환 연산자를 사용하면 변수의 타입을 변경하는 것이 아니라
	    // 그 변수에서 조회한 값을 형변환 연산자에 해당하는 타입의 값으로 바꾸는 것이다.
	    // 해당 변수에는 여전히 원래값이 저장되어 있다.
	    int subjectCount = 3;
	    int korScore = 100;
	    int engScore = 60;
	    int mathScore = 70;
	    int totalScore = korScore + engScore + mathScore;
	    double average = totalScore/(double) subjectCount;
	    System.out.println(average);
	    System.out.println(subjectCount);
	    
	}

}
