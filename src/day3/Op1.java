package day3;

public class Op1 {
	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 *          + - * %
		 *          연산에 참여한 데이터의 자료형과 연산결과의 자료형이 항상 동일하다.
		 *          연산에 참여한 데이터의 자료형이 다르면 형변환을 통해서 같이 자료형으로 변환한 다음 연산이 수행된다.
		 *          산술 연산자의 연산대상은 숫자다. ( 단, 덧셈연산자는 문자열도 가능)
		 *          나머지 연산자의 연산결과는 항상 "0 <= 값 < 나누는 숫자" 사이의 값이다.
		 *          
		 *          산술연산자를 사용하는 관례
		 *              값 + 값
		 *              값 - 값
		 *              값 * 값
		 *              값 / 값
		 *              값 % 값
		 *              
		 *          + 연산자는 두 가지 동작을 가진다.
		 *            숫자 + 숫자 =숫자
		 *            문자열 + 문자열 = 문자열
		 *            문자열 + 숫자 = 문자열
		 *            숫자 + 문자열 = 문자열
		 *            
		 *            1  +  3   => 4
		 *            "안녕" + 3 => '"안녕3"
		 *            3 + "안녕" => "3안녕"
		 *            "홍" + "길동" => "홍길동"
		 *            1+ 3 + "안녕" + 5 + 7 => "4안녕57"
		 *            * 덧셈연산자의 좌항이나 우항에 문자열이 있으면 두 항의 값이 연결된 새로운 문자열이 생성된다.
		 */
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		String str1 = "홍길동";
	    System.out.println(num1 + num2 + str1);   // 10 + 3 + "홍길동" => "13홍길동"
	    System.out.println(num1 + str1 + num2);   // 10 + "홍길동" + 3 => "10홍길동3"
	    System.out.println(str1 + num1 + num2);   // "홍길동" + 10 + 3 => "홍길동103"
	    
	    int korScore = 80;
	    int engScore = 70;
	    int mathScore = 80;
	    int totalScore = korScore + engScore + mathScore;
	    double averageScore = totalScore/3.0;    //230/3.0 -> 230.0/3.0 -> 76.66666
	    
	    System.out.println(korScore + engScore + mathScore);
	    System.out.println((korScore + engScore + mathScore)/3);
	    System.out.println(totalScore);        //54열과 같은 값이지만 소스가 더 깔끔해짐
	    System.out.println(totalScore/3);      //55열과 같은 값이지만 소스가 더 깔끔해짐
	    System.out.println(averageScore);
	    
	    
	    
		}

}
