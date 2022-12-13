package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int [] num = new int[] {1,2,3,4,5,6,7,8,9,10};		//int[0] = 1이다 배열은 0번부터 시작이다.
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
