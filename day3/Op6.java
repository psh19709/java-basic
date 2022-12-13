package day3;

public class Op6 {
	
	public static void main(String[] args) {
		/*
		 *  조건 연산자( 3항 연산자 )
		 *       조건식 ? 값1 : 값2
		 *       조건식 ? 연산식1 : 연산식2
		 * 
		 *       * 조건식은 true/false값이 최종연산결과로 나오는 식이다.(비교연산자, 논리연산자를 사용하는 식)
		 *       * 값1과 값2는 같은 타입의 값이어야 한다.
		 *       * 연산식 1과 연산식2는 같은 타입의 결과값이 나오는 연산식이어야 한다.
		 *       * 조건식이 true로 판정되면 값1 혹은 연산식1의 결과가 조건 연산자의 최종 결과가 된다.
		 *       * 조건식이 false로 판정되면 값2 혹은 연산식2의 결과가 조건 연산자의 최종 결과가 된다.
		 */
		
		// 평균점수가 60점 이상이면 합격, 그 외는 불합격이라고 출력한다.
		int average = 65;
		String message = average >= 60 ? "합격" : "불합격";
		System.out.println(message);
		
		//구매금액이 100만원 이상이면 구매금액의 1%만큼 포인트가 적립되고, 그 외는 0.3%만큼 적립된다.
		int orderPrice = 600000;
		int point = orderPrice >= 1000000 ? (int)(orderPrice*0.01) : (int)(orderPrice*0.003);  //이 부분이 왜 식이 이렇게 세워졌는지 이해가 필요할 것 같다.
		System.out.println("적립포인트: " + point);
		
		
		// 소득이 1200만원 이하인 경우 소득의 6%를 과세하고
		//그 외는 1200만원 초과분에 대해서 72만원 + (1,200만원 초과금갱의 15%)로 과세한다.
		// 소득이 1400만원, 2000만원, 2500만원, 3000만원, 3500만원, 4000만원, 4500만원에 대해서
		//세금과 실수령액 출력하기
		
		int income1 = 10000000;
		int income2 = 15000000;
		int income3 = 20000000;
		int income4 = 25000000;
		int income5 = 30000000;
		int income6 = 35000000;
		int income7 = 40000000;
		int income8 = 45000000;
		
		//int 세금 = 소득 <12000000 ? (int) (소득*0.06) : 720000 + (int) ((소득 - 12000000)*0.15)
 		int tax1 = income1 < 12000000 ? (int)(income1*0.06) : 720000 + (int)((income1-12000000)*0.15);
		int tax2 = income2 < 12000000 ? (int)(income2*0.06) : 720000 + (int)((income2-12000000)*0.15);
		int tax3 = income3 < 12000000 ? (int)(income3*0.06) : 720000 + (int)((income3-12000000)*0.15);
		int tax4 = income4 < 12000000 ? (int)(income4*0.06) : 720000 + (int)((income4-12000000)*0.15);
		int tax5 = income5 < 12000000 ? (int)(income5*0.06) : 720000 + (int)((income5-12000000)*0.15);
		int tax6 = income6 < 12000000 ? (int)(income6*0.06) : 720000 + (int)((income6-12000000)*0.15);
		int tax7 = income7 < 12000000 ? (int)(income7*0.06) : 720000 + (int)((income7-12000000)*0.15);
		int tax8 = income8 < 12000000 ? (int)(income8*0.06) : 720000 + (int)((income8-12000000)*0.15);
	
	   System.out.println("소득 1000만원 : 세금-" + tax1 + "실수령액" + (income1 - tax1)/12);
	   System.out.println("소득 1500만원 : 세금-" + tax2 + "실수령액" + (income2 - tax2)/12);
	   System.out.println("소득 2000만원 : 세금-" + tax3 + "실수령액" + (income3 - tax3)/12);
	   System.out.println("소득 2500만원 : 세금-" + tax4 + "실수령액" + (income4 - tax4)/12);
	   System.out.println("소득 3000만원 : 세금-" + tax5 + "실수령액" + (income5 - tax5)/12);
	   System.out.println("소득 3500만원 : 세금-" + tax6 + "실수령액" + (income6 - tax6)/12);
	   System.out.println("소득 4000만원 : 세금-" + tax7 + "실수령액" + (income7 - tax7)/12);
	   System.out.println("소득 4500만원 : 세금-" + tax8 + "실수령액" + (income8 - tax8)/12);
	   
	   
	
	}

}
