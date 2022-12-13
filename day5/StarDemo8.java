package day5;

public class StarDemo8 {
	public static void main(String[] args) {
		/*       i      j     v
		 * 0     1      1-1   0
		 * 12    2      1-2   12
		 * 345   3      1-3   345
		 * 6789  4      1-4   6789
		 */
		
		
		int num = 0;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(num++);
			}
			System.out.println();
		}
	}

}
