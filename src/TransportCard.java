import java.util.*;

public class TransportCard {

	String name;
	int money;
	int rideLocation;
	boolean inandout;

	public TransportCard(String name){
		this.name = name;
		this.money = 0;
		this.inandout = false;
		this.rideLocation = 0;
	}

	public int getMoney() {
		return money;
	}

	public boolean isInandout() {
		return inandout;
	}

	public void reCharge() {

		int money = 0;

		try{
			Scanner sc = new Scanner(System.in);
			money = sc.nextInt();
		}catch (Exception e){
			e.getStackTrace();
		}

		this.money += money;
	}
	
	public int ride() {
		money = money - 1050;
		
		return money;
	}
	
	public int takeOff(int money, int startlocation, int endlocation) {
		int distence = startlocation - endlocation;
		
		if(distence<0) {
			distence = -distence;
		}
		
		if(distence>1) {
			money = money - 100*distence;
		}
		
		return money;
	}
	
	public void checkMoney() {
		System.out.println(money);
	}
	
	/////////////// 새 객체를 만들면 거긴 값이 없어서 의미가 없음, 값이 있는 객체를 아규먼트로 받아와야함
	public int checkLocation(PublicTransport pt) {

		rideLocation = Integer.parseInt(pt.getId());
		
		return rideLocation;
	}
	
}
