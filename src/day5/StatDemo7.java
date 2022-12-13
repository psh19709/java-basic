package day5;

public class StatDemo7 {
	
	public static void main(String[] args) {
		
		/*         i     j           v
		 * 1       1     1-1 <-(i)   1<-(i)
		 * 22      1     1-2 <-(i)   2<-(i)
		 * 33      1     1-3 <-(i)   3<-(i)
		 * 4444    1     1-4 <-(i)   4<-(i)
		 * 55555   1     1-5 <-(i)   5<-(i)
		 *
		 */
		
		for (int i =1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);   //v에 해당하는 부분
			}
			System.out.println();
		}
	}

}
