package day5;

public class StarDemo10 {
	public static void main(String[] args) {
/*                                   i      j(공백)       j(#)
 *     #       (공백:4, #1,공백:4)      1      1-4 <-(5-i)  1-1 <- (9 - (5-i))*2
 *    ###      (공백:3, #3,공백:3)      2      1-3 <-(5-i)  1-3 <- (9 - (5-i))*2
 *   #####     (공백:2, #5,공백:2)      3      1-2 <-(5-i)  1-5 <- (9 - (5-i))*2
 *  #######    (공백:1, #7,공백:1)      4      1-1 <-(5-i)  1-7 <- (9 - (5-i))*2
 * #########   (공백:0, #9,공백:0)      5      1-0 <-(5-i)  1-9 <- (9 - (5-i))*2
 */
		int value = 65;
		for(int i = 1; i<= 5; i++) {
			for(int j = 1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			//영어 대문자 출력
			for(int j =1; j <= 9 - (5-i)*2; j++) {
				System.out.print((char) value++);
			}
			System.out.println();
		}
		
	}

}
