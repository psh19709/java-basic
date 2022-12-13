package day3;

import utils.KeyboardReader;

public class Op8 {
	
	public static void main(String[] args) {
		/*
		 * 고객이름, 상품명, 가격, 구매수량을 입력받아서 구매정보를 출력하기
		 * 구매정보는 고객이름, 상품명, 가격, 구매수량, 총구매가격, 적립포인트를 말한다.
		 * 적립포인트는 구매가격의 1%로 한다.
		 * 
		 * 1. 키보드 입력을 읽어오는 KeyboardReader 객체를 생성해서 reader 변수에 대입한다.
		 * 2. 고객이름, 상품명, 가격, 구매수량을 입력하라는 메세지를 출력하고, 각각의 값을 입력받아서 변수에 저장한다.
		 * 3. 입력된 정보를 이용해서 총구매가격고 적립포인트를 계산해서 변수에 저장한다.
		 * 4. 변수에 저장된 값을 화면에 출력한다.
		 */
		
		//1. 키보드 입력을 읽어오는 기능이 포함된 객체 생성
		KeyboardReader keyboard = new KeyboardReader();
		
		//2. 사용자에게 입력할 정보를 안내하고, 입력된 정보를 읽어서 변수에 저장
		System.out.print("고객명 입력: ");
		String name = keyboard.getString();
		System.out.print("상품명 입력: ");
		String productName = keyboard.getString(); //getString() 문자열을 적어야 하는 곳에서 쓴다
		System.out.print("상품가격명 입력: ");
		int price = keyboard.getInt();            // getInt() 숫자를 적어야 하는 곳에 쓴다.
		System.out.print("구매수량 입력: ");
		int amount = keyboard.getInt();
		
		// 3. 구매가격과 적립포인트를 계산
		int totalPrice = price*amount;
		int point = (int)(totalPrice*0.02);
		
		// 4. 구매정보를 출력
		System.out.println("====================================");
		System.out.println("고객명: "  + name);
		System.out.println("상품명: "  + productName);
		System.out.println("상품가격: "  + price );
		System.out.println("구매수량: "  + amount);
		System.out.println("구매가격: "  + totalPrice);
		System.out.println("구매포인트: "  + point);
		System.out.println("====================================");
	}

}
