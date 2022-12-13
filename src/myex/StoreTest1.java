package myex;

public class StoreTest1 {
	public static void main(String[] args) {
		Store store1 = new Store();
		store1.no = "201803120001";
		store1.id = "abc123";
		store1.date = "2018년 3월 12일";
		store1.name = "홍길순";
		store1.orderNum = "PD0345-12";
		store1.addess = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: " + store1.getNo());
		System.out.println("주문자 아이디: " + store1.getId());
		System.out.println("주문 날짜: " + store1.date);
		System.out.println("주문자 이름: " + store1.name);
		System.out.println("주문 상품번호: " + store1.orderNum);
		System.out.println("배송 주소: " + store1.addess);
	}

}
