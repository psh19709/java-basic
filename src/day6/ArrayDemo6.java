package day6;

public class ArrayDemo6 {
	
	public static void main(String[] args) {
		/*
		 * 1차원배열과 다차원 배열
		 *        1차원배열
		 *           자료형[] 변수명 = new 자료형[크기];
		 *           자료형[] 변수명 = {값, 값, 값, 값};
		 *        
		 *        2차원 배열
		 *           자료형[][] 변수명 = new자료형[크기][크기];
		 *           자료형[][] 변수명 = {{값, 값, 값}, {값, 값, 값}, {값, 값, 값}};
		 */
		
		// 2차원 배열 생성하기
		int[][] score = new int[2][3];
		
		// 2차원 배열에 값 저장하기
		score[0][0] = 40;
		score[0][1] = 60;
		score[0][2] = 30;
		score[0][0] = 80;
		score[0][1] = 90;
		score[0][2] = 70;
		
		// 2차원 배열에 저장된 값 출력하기
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j <3; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// 향상된 for문으로 2차원 배열에 저장된 값 출력하기
		for(int[] row : score) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
				
	}

}
