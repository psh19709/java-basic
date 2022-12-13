package day5;

public class ForDemo3 {
	
	public static void main(String[] args) {
		// total은 1~10까지 숫자의 합을 저장하는 변수다.
		int total = 0;
		total = total + 1;
		total = total + 2;
		total = total + 3;
		total = total + 4;
		total = total + 5;
		total = total + 6;
		total = total + 7;
		total = total + 8;
		total = total + 9;
		total = total + 10;
		System.out.println(total);
		
		int numTotal = 0;
		for (int num = 1; num <= 100000; num++) {
			numTotal += num;  // numTotal = numTotal + num;에 대한 축약형이다.
		}
		System.out.println(numTotal);
	}

}
