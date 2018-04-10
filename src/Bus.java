public class Bus extends PublicTransport {

    public Bus(String id){
        setId(id);
        setCount(0);
    }

    @Override
    public void getOffTag(TransportCard card) {
        long time = System.currentTimeMillis();
        time = (time - card.getTime())/30000;
        int pay = (int)time * 100;
        if(pay > 700)
            pay = 700;
        card.setMoney(card.getMoney() - pay);
        card.setInAndOut(false);
        card.setTime(System.currentTimeMillis());
    }

    @Override
    public void rideTag(TransportCard card) {
        if(card.isInAndOut()){
            switch (card.getBusOrMetro()){
                case 1:
                    checkMoney(card, 1750, 1750);
                    break;
                case 2:
                    checkMoney(card, 1650, 1650);
                    break;
            }
        }else{
            if(System.currentTimeMillis() - card.getTime() <= 15000 && card.getBusOrMetro() == 2){
                checkMoney(card, 700, 0);
            }else{
                checkMoney(card, 1750, 1050);
            }
        }
    }

    public void checkMoney(TransportCard card, int limit, int pay) {
        if (card.getMoney() < limit) {
            System.out.println("exceed limit");
        }else{
            card.setMoney(card.getMoney() - pay);
            card.setTime(System.currentTimeMillis());
            card.setBusOrMetro(1);
            card.setInAndOut(true);
            card.setRideLocation(getId());
        }
    }
}