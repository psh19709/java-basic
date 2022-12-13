package day4;

import utils.KeyboardReader;

public class IfDemo3 {
	
	public static void main(String[] args) {
		
	
	/*
	 * if ~ else if ~ else if ~ else 문
	 *          형식
	 *            if (조건식) {
	 *                수행문1;
	 *              } else if (조건식2) {
	 *              수행문2;
	 *              } else if (조건식3) {
	 *              수행문3;
	 *              } else {
	 *              수행문4;
	 *              }
	 *              * 검사할 조건이 여러 개일 때 사용하는 제어문이다.
	 *              * 조건식1이 true로 판정되면 수행문1을 실행하고, 나머지 부분은 전부 skip한다.
	 *              * 조건식1이 false로 판정되면 첫번째 else if 조건식2로 넘어가고, 
	 *                조건식2가 true로 판정되면 수행문2을 실행하고, 나머지 부분은 전부 skip한다.
	 *              * else블록은 필요없으면 생략할 수도 있다.
	 *              * else 블록은 수행문은 제시된 모든 조건식이 false로 판정되면 실행된다.
	 *              * 위에서 제시된 수행문은 절대로 동시에 실행될 수 없다.
	 */
	
	/*
	 *  고객의 등급에 따라서 구매금액에 대한 적립포인트를 계산하기
	 *  고객 등급은 'G', 'S', 'B' 중에 하나다.
	 *  'G' 등급인 경우 구매금액의 3%을 포인트로 적립
	 *  'S' 등급인 경우 구매금액의 3%을 포인트로 적립
	 *  'B' 등급인 경우 구매금액의 3%을 포인트로 적립
	 *  
	 *  고객명, 고객등급, 구매금액을 입력받아서, 고객명, 고객등급, 구매금액, 적립포인트를 출력하기
	 */
	
	KeyboardReader keyboard = new KeyboardReader();
	
    System.out.print("고객명을 입력하세요: ");
    String name = keyboard.getString();
    System.out.print("고객등급을 입력하세요: ");
    char grade = keyboard.getChar();
    System.out.print("구매금액을 입력하세요: ");
    int orderPrice = keyboard.getInt();
    
    System.out.println("=============================");
    System.out.println("고객명: " + name);
    System.out.println("고객등급: " + grade);
    System.out.println("구매금액: " + orderPrice);
    
    if(grade == 'G') {
    	int point = (int) (orderPrice*0.03);
    	System.out.println("적립포인트: " + point);
    	
    } else if (grade == 'S') {
    		int point = (int) (orderPrice*0.02);
    		System.out.println("적립포인트: " + point);
    		
    } else if(grade == 'B') {
    			int point = (int) (orderPrice*0.01);
    			System.out.println("적립포인트: " + point);
    }
    System.out.println("=============================");
    
	}
}
