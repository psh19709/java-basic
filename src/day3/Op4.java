package day3;

public class Op4 {
	
	public static void main(String[] args) {
		/*
		 * 증감 연산자
		 *       ++  --
		 *       증감연산자는 단항연산자
		 *       증감연산자는변수랑만 사용할 수 있다.
		 *       증감연산자는 변수의 앞 혹은 뒤에 붙여서 사용한다.
		 *       사용 예
		 *         int x = 10;
		 *         x++;
		 *         ++x;
		 *       증감연산자의 변수의 값을 1증가시키거나 1감소시킨다.
		 *       증감연산자를 다른 연산자와 같이 사용할 때는 증감연산자의 위치에 따라서 연산결과가 달라질수 있다.
		 *       int x = 10;
		 *       int y = 10;
		 *       int j = ++x;        // x의 값이 1증가되고, x의 값이 j에 대입된다.    //j의 값은 11, x의 값은 11이다.
		 *       int k = y++;        // y의 값이 k에 대입되고, y의 값이 1증가된다.    // k의 값은 10, y의 값은 11이다.
		 *       
		 *       // 증감연산과 덧셈연산을 분리하지 않으면 증감 연산자의 위치에 따라서 다른 연산결과가 나온다.
		 *       int x = 10;
		 *       int y = 100;
		 *       int z = x++ + y;   // z의 값은 110
		 *       int z = ++x +y;    // z이 값은 111
		 *       
		 *       // 증감연산과 덧셈연산을 분리시켜라. 증감 연산자의 위치에 상관없이 같은 연산결과가 나온다.
		 *       int x = 10;
		 *       int y = 10;
		 *       int z = 100;
		 *       
		 *       x++;
		 *       ++y;
		 *       
		 *       int j = x + z;   // j의 값은 111
		 *       int k = y + z;   // k의 값은 111
		 *       
		 *         	
    	 */
		
		int a = 10;
		int b = 10;
		
		a++;
		b--;
		
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		
		
		++a;
		--b;
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		
		int x =10;
		int y = 10;
		int z = 100;
		
		int j =++x + z;      // x의 값이 1 증가됨 -> 11+100
		int k = y++ + z;     // 10+100 -> y의 값이 1증가됨
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		System.out.println("j의 값: " + j);
		System.out.println("k의 값: " + k);
		
		
	}

}
