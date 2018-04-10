import java.util.*;

public class Program {

    public static void main(String[] args){

        Bus bus = new Bus("0001");
        TransportCard card = new TransportCard("1");
        card.reCharge(5000);
        Scanner scan = new Scanner(System.in);
        ArrayList<Metro> metroList = new ArrayList<Metro>();

        for(int i = 0; i < 5; i++){
            metroList.add(new Metro(Integer.toString(i)));
        }

        String a;
        int b;
        while(true){
            a = scan.nextLine();
            switch(a){
                case "ride":
                    bus.rideTag(card);
                    System.out.println(card.getMoney());
                    break;
                case "getoff":
                    bus.getOffTag(card);
                    System.out.println(card.getMoney());
                    break;
                case "re":
                    b = scan.nextInt();
                    scan.nextLine();
                    card.reCharge(b);
                    System.out.println(card.getMoney());
                    break;
                case "metro":
                    card.setBusOrMetro(2);
                    break;
                    default:
                        System.out.println("error");
                        break;
            }
        }
    }
}

