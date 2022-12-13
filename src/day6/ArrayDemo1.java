package day6;

import java.util.Arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		/*
		 *  배열 객체 생성하기
		 *       1. 자료형과 크기를 지정해서 배열 생성하기
		 *       
		 *       자료형 [] 참조변수수명 = new 자료형 [크기];
		 *       예시
		 *          int[]arr1 = new int[5];
		 *          double[] arr2 = new double[5];
		 *          String[] arr3 = new String[3];
		 *          * 배열객체에는 지정된 자료형의 값 혹은 주소값을 저장할 수 있는 연속된 저장소가 크기만큼 생성된다.
		 *          * 각 저장소에는 자료형의 기본값이 초기값으로 대입되어 있다.
		 *          * 기본값
		 *            정수(int):0, 실수(double):0.0, 문자(chat):'/u0000', 불린(boolean) : false, 그외는 전부 null이다.
		 *            
		 *       2. 배열 리터럴로 배열 생성하기
		 *       
		 *       자료형[] 참조변수명 = {값, 값, 값, 값};
		 *       예시
		 *         int[] arr1 = {90, 80,60, 55, 100};
		 *         double[] arr2 = {3.4, 4.1, 2.5, 4.5};
		 *         String [] arr3 = {"김수영", "예빛", "한올", "치즈", "프롬", "김사월", "서자영"};
		 *         * 값의 갯수만큼 연속된 저장소가 있는 배열객체가 생성된다.
		 *         * 각각의 저장소에는 순서대로 값들이 저장된다.
		 */
		
		int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		String[] arr3 = new String[5];
		
		arr1[0] = 34;
		arr1[1] = 50;
		arr2[3] = 3.14;
		arr2[4] = 0.256;
		arr3[0] = "홍길동";
		arr3[1] = "김유신";
		arr3[2] = "사랑";
		
		System.out.println("첫번째 배열의 값 출력하기");
		//System.out.println(arr1[0]);
		//System.out.println(arr1[1]);
		//System.out.println(arr1[2]);
		//System.out.println(arr1[3]);
		//System.out.println(arr1[4]);
		
		for (int index = 0; index < 5; index++) {
			System.out.println(arr1[index]);
		}
		
		System.out.println("두번째 배열의 값 출력하기");
		//System.out.println(arr2[0]);
		//System.out.println(arr2[1]);
		//System.out.println(arr2[2]);
		//System.out.println(arr2[3]);
		//System.out.println(arr2[4]);
		
		for (int index = 0; index < 5; index++) {
			System.out.println(arr2[index]);
		}
		
		System.out.println("세번째 배열의 값 출력하기");
		//System.out.println(arr3[0]);
		//System.out.println(arr3[1]);
		//System.out.println(arr3[2]);
		//System.out.println(arr3[3]);
		//System.out.println(arr3[4]);
		
		for (int index = 0; index < 5; index++) {
			System.out.println(arr3[index]);
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
