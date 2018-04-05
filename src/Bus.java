public class Bus extends PublicTransport {

    public Bus(String id){
        setId(id);
        setCount(0);
    }

    @Override
    public void getOffTag(PublicTransport card) {

    }

    @Override
    public void rideTag(TransportCard card) {
        if(card.getMoney() < 1050 + 600){
            System.out.println("reject riding");
        }else{
            super.rideTag(card);
        }
    }
}
