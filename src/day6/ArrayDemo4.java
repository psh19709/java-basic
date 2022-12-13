package day6;

public class ArrayDemo4 {
	
	public static void main(String[] args) {
		
		int [] numbers = {20, 30, 40, 50, 60, 70, 80, 90, 94, 21, 1, 3214};
		
		// 배열의 값 중에서 가장 큰 값과 가장 작은 값을 알아내기
		int min = 2_147_483_647;     //정수(int 일때) 자료형의 최대값 혹은 배열의 첫번째 값을 저장한다.
		int max = -2_147_483_648;    //정수(int 일때) 자료형의 최소값 혹은 배열의 첫번째 값을 저장한다.
		
		for (int value : numbers) {
			if(value < min) {
				min = value;
			}
		    if(value > max) {
		    	max = value;
		    }
		}
		
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		
	}

}
