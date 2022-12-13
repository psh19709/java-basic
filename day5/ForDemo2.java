package day5;

public class ForDemo2 {
	
	public static void main(String[] args) {
		
		/*
		 *  for문의 초기식에서 생성한 변수는 조건식, 증감식, for문 코드블록 안에서만 사용가능하다.
		 *  for문의 닫는 괄호를 만나는 순간 전부 삭제된다.
		 */
		for(int x = 1; x<= 10; x++) {
			System.out.println(x);
		}
		
		// System.out.println(x); // 컴파일 오류. for문의 바깥에는 for문의 초기식에서 생성된 변수를 사용할 수 없다.
		
		/*
		 * for문의 초기식, 조건식, 증감식은 모두 생략가능한 문법요소다.
		 */
		int index =0;
		for(; index < 10; index++) {
			System.out.println("인덱스값: " + index);
		}
		System.out.println("인덱스값을 외부에서 사용하기:  " + index);  //큰 의미는 없다.
		
		// 초기식, 조건식, 증감식을 모두 생략하면 무한루프에 빠진다.
		//for(;;) {
			//System.out.println("수행문");
		}
	}

