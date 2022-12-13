package day5;

public class StarDemo1 {
	
	public static void main(String[] args) {
		/*            i    j
		 * #####      1    1-5
		 * #####      2    1-5
		 * #####      3    1-5
		 * #####      4    1-5
		 * #####      5    1-5
		 */
		for (int i = 1; i <=5; i++) {
			for ( int j = 1; j <= 5; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
	
		/*
		 * #
		 * ##
		 * ###
		 * ####
		 * #####
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		/*
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (6-i); j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 *     #(공백4 + #1)
		 *    ##(공백3 + #2)
		 *   ###(공백2 + #3)
		 *  ####(공백1 + #4)
		 * #####(공백0 + #5)
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
