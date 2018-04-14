import java.util.*;

public class Circumstance extends TimerTask{

    private ArrayList<TransportCard> cardList;
    private ArrayList<PublicTransport> publicTransports;

    /*
    버스 객체와 지하철 객체 5개를 생성한 후 PublicTransport 배열에 넣는다.
    교통카드 배열을 생성
     */
    public Circumstance(){
        this.cardList = new ArrayList<TransportCard>();
        this.publicTransports = new ArrayList<PublicTransport>();

        Bus bus = new Bus("b01");
        this.publicTransports.add(bus);

        int id = 1;
        for(int i = 0 ; i < 5; i++){
            Metro metro = new Metro(Integer.toString(id + i));
            this.publicTransports.add(metro);
        }
    }
    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String select;


    }

    public TransportCard makdCard(String id){
        TransportCard newCard = new TransportCard(id);
        return newCard;
    }
}
