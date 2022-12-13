package day4;

import utils.KeyboardReader;

public class Op9 {
	
	public static void main(String[] args) {
		/*
		 * 직원명, 출근일수, 시간외 근무시간을 입력받아서 급여를 계산하고, 계산 결과를 출력하는 프로그램
		 * 시급은 3만원이다.(하루 근무시간은 8시간이다.)
		 * 시간외 근무시간에 대해서는 시급의 1.5배를 적용한다.
		 * 
		 * 직원명, 출근일수, 시간외 근무시간, 근무수당, 시간외 근무수당, 총급여를 출력하기
		 * 
		 * 1. 키보드 입력을 읽어오는 KeyboardReader객체를 생성해서 Keyboard 변수에 대입한다.
		 * 2. 직원명, 출근일수, 시간외 근무시간을 입력 받아서 적절한 변수에 대입한다.
		 * 3. 근무수당, 시간외 근무수당, 총 급여를 계산해서 적절한 변수에 대입한다.
		 * 4. 변수에 저장된 값을 모두 출력한다.
		 */
		
		
		//무조건 복습하기
		
		//KeyboardReader keyboard = new KeyboardReader();
		
		//System.out.print("직원명: " );
		//String name = keyboard.getString();
		//System.out.print("출근일수: " );
		//int day = keyboard.getInt();
		//System.out.print("시간외 근무시간: " );
		//int excepttime = keyboard.getInt();
		
		//int totalPrice = (int)((8 * day) * 30000) + (int)(excepttime * 30000 * 1.5); 
		
		//System.out.println("====================================");
		//System.out.println("직원명: "  + name);
		//System.out.println("출근일수: "  + day);
		//System.out.println("시간외 근무시간: "  + excepttime);
		//System.out.println("근무수당: "  + time);
		//System.out.println("총급여: "  + totalPrice);
		//System.out.println("====================================");
		
		KeyboardReader keyboard = new KeyboardReader();
		
		System.out.print("직원명을 입력하세요: ");
		String name = keyboard.getString();
		System.out.print("출근일수를 입력하세요: ");
		int workingDay = keyboard.getInt();
		System.out.print("시간외 근무시간 입력하세요: ");
		int overtime = keyboard.getInt();
		
		int workAllwance = workingDay*8*30000;
		int overtimePay = (int) (overtime*30000*1.5);
		int totalIncome = workAllwance + overtimePay;
		
		System.out.println("====================================");
		System.out.println("직원명: "  + name);
		System.out.println("출근일수: "  + workingDay);
		System.out.println("근무수당: "  + workAllwance);
		System.out.println("시간외 근무수당: "  + overtimePay);
		System.out.println("총급여: "  + totalIncome);
		System.out.println("====================================");
		
		
	}

}
