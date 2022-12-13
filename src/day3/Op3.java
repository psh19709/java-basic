package day3;

public class Op3 {

	public static void main(String[] args) {
		/*
		 * 대입연산자
		 *     = += -= *= /= %=
		 *     우항의 값을 좌항의 변수에 대입한다.
		 *     연산우선순위가 가장 낮은 연산자다.
		 *     
		 *     
		 *     int x = 10;     // 정수 10을 변수(저장소)에 대입(저장)한다.
		 *     
		 *     int y = 10;    
		 *     y +=3;          // y = y+3;과 같은 식이다. 변수y의 값(10)에 3을 더한 값을 y에 대입한다.
		 *     y = 3;          //변수 y에 3을 대입한다,
		 *     
		 *     int y = 10;
		 *     y -= 3;        // y = y -3;     y의 최종값은 7이다.
		 *     int y =10;
		 *     y *= 3;        // y = y*3;      y의 최종값은 30이다.
		 *     int y = 10;
		 *     y /= 3;       // y = y/3;       y의 최종값은 3이다.
		 *     int y =10;
		 *     y %=3;        // y = y%3;       y의 최종값은 1이다.
		 */
		
		int korScore = 100;
		int engScore = 80;
		int mathScore = 80;
		
		/*
		 * int totalScore = 0;               //             0     +100
		 * totalScore += korScore;           // totalScore = totalScore + korScore;
		 * 
		 * 아래식은 totalScore값이 초기화되지 않았기 떄문에 문법오류다.
		 *                                                    쓰레기 값   + korScore;
		 * int totalScore += korScore;       // totalScore + totalScore + korScore;
		 */
		
		int totalScore = 0;
		totalScore += korScore;
		totalScore += engScore;
		totalScore += mathScore;
		
		System.out.println("총점: " + totalScore);
	}
}
