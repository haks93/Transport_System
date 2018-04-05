package PTS2;
import java.util.*;

public class TransportCard {

	String name; // 사용자 이름
	int money = 0; // 교통카드의 잔액
	int rideLocation; // 승차 위치
	boolean inandout; // 현재 승하차 상태 ~ 타있는 상태인가 아닌가
	
	public int reCharge() {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		
		money = money + M;
		
		return money;
	}
	
	public int ride(int money) {
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
	
	public boolean rideOrNot() {
		return inandout;
	}
	
	public int checkLocation() {
		PublicTransport pt = new PublicTransport();
		
		String a = pt.getId();
		rideLocation = Integer.parseInt(a);
		
		return rideLocation;
	}
	
}
