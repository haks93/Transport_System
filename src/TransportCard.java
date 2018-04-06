import java.util.*;

public class TransportCard {

	private String name;
	private int money;
	private int rideLocation;
	private boolean inAndOut;
	private long time;
	private int busOrMetro; //0: 최초 1: 버스  2: 지하철

	public TransportCard(String name){
		this.name = name;
		this.money = 0;
		this.inAndOut = false;
		this.rideLocation = 0;
		this.busOrMetro = 0;
		this.time = 0;
	}
	public void setMoney(int money){
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}


	public long getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getBusOrMetro() {
		return busOrMetro;
	}

	public void setBusOrMetro(int busOrMetro) {
		this.busOrMetro = busOrMetro;
	}

	public void setInAndOut(boolean inAndOut) {
		this.inAndOut = inAndOut;
	}

	public boolean isInAndOut() {
		return inAndOut;
	}

	public void setRideLocation(PublicTransport pt) {
		this.rideLocation = Integer.parseInt(pt.getId());
	}

	public int getRideLocation() {
		return rideLocation;
	}

	public void reCharge(int money) {
		this.money += money;
	}
	
	public void checkMoney() {
		System.out.println(money);
	}
}
