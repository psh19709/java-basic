package day3;

public class Op2 {
	
	public static void main(String[] args) {
		// 홍길동은 로또 1등에 당첨되어서 상금 15억을 수령하게 되었다.
		// 로또 상금에 대한 세금은 상금은 25%(0.25)이다.
		// 홍길동이 실제로 수령하게 되는 로또 상금과 세금으로 납부하는 금액은 각각 얼마인지 출력하시오.
		// 수령액과 세금은 소숫점부분은 고려하지 않는다.
		
		//상금
		int reward = 1_500_000_000;
		//세율
		double tariff = 0.25;
		
		
		//세금납부액
		int tax = (int) (reward*tariff);        //(int) (1500000000*0.25) -> (int) (1500000000.0*0.25) -> (int) 1125000000 -> 1125000000 -> 정수
		
		//형변환 연산자의 잘못된 사용예
		//int tax = (int) reward*tariff;       //(int)1500000000*0.25 -> 1500000000.0*0.25 -> 1500000000.0*0.25 -> 실수
		// int tax = reward*(int)tariff;         //1500000000*(int)0.25 -> 1500000000.0*0 ->정수
		//실수령액
		int realAmount = reward - tax;
		
		System.out.println("실수령액: " + realAmount);
		System.out.println("세금: " + tax);
		
	}

}
