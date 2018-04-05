import java.util.*;

public class TransportCard {

	private String name;
	private int money;
	private int rideLocation;
	private boolean inAndOut;

	public TransportCard(String name){
		this.name = name;
		this.money = 0;
		this.inAndOut = false;
		this.rideLocation = 0;
	}
	public void setMoney(int money){
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setRideLocation(PublicTransport pt) {
		this.rideLocation = Integer.parseInt(pt.getId());
	}

	public boolean isInandout() {
		return inAndOut;
	}

	public void reCharge(int money) {
		this.money += money;
	}
	
	public void checkMoney() {
		System.out.println(money);
	}
}
