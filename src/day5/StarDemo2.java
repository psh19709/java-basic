package day5;

public class StarDemo2 {

	public static void main(String[] args) {
		/*            i       j
		 * #          1      1-1
		 * ##         2      1-2
		 * ###        3      1-3
		 * ####       4      1-4
		 * #####      5      1-5
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
