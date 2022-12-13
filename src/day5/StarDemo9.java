package day5;

public class StarDemo9 {

	public static void main(String[] args) {
		/*          i        j       v
		 * A        1        1-1     65
		 * BC       2        1-2      6667
		 * DEF      3        1-3     686970
		 * GHIJ   
		 * KLMNO
		 */
		int value = 65;
		for (int i= 1; i <= 5; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print((char) value++);
			}
			System.out.println();
		}
	}
}
