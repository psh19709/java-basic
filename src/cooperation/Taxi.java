package cooperation;

public class Taxi {
	
	String texiNumber;		// 택시 넘버
	int passengerCount;		// 승객 수
	int money;				// 수입액
	
	public Taxi(String taxiNumber) {
		this.texiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(texiNumber + "의 승객은 " + passengerCount + "명이고, 수입은" + money + "입니다." );
	}

}
