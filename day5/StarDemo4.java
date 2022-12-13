package day5;

public class StarDemo4 {
	public static void main(String[] args) {
		/*                    i  j             j
		 *     #(공백4 + #1)   1  1-4 <-(5-i)   1
		 *    ##(공백3 + #2)   2  1-3 <-(5-i)   2
		 *   ###(공백2 + #3)   3  1-2 <-(5-i)   3
		 *  ####(공백1 + #4)   4  1-1 <-(5-i)   4
		 * #####(공백0 + #5)   5  1-0 <-(5-i)   5
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
