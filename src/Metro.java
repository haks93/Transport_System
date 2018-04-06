public class Metro extends PublicTransport{

    public Metro(String id){
        setId(id);
        setCount(0);
    }

    @Override
    public void rideTag(TransportCard card) {
        String stringtonum = getId();
        card.setRideLocation(stringtonum);

        if(card.isInAndOut()){ // 하차태그 안한 상태
            switch (card.getBusOrMetro()){
                case 1: // 직전에 탄 매체가 버스
                    CheckandPayMoney(card, 1750, 1750);
                    break;
                case 2: // 직전에 탄 매체가 지하철
                    CheckandPayMoney(card, 1250, 1250);
                    break;
            }
        }else{ // 하차태그 한 상태
            if(System.currentTimeMillis() - card.getTime() <= 15000 && card.getBusOrMetro() == 1){
                CheckandPayMoney(card, 700, 0);
            }else{
                CheckandPayMoney(card, 1050, 1050);
            }
        }
    }

    @Override
    public void getOffTag(TransportCard card) {
        String stringtonum = getId();
        int distence = card.getRideLocation() - Integer.parseInt(stringtonum);

        if(distence<0) {
            distence = -distence;
        }

        if(distence==3) {
            distence=2;
        }
        else if(distence==4) {
            distence=1;
        }

        int pay = (distence-1)*200;

        card.setMoney(card.getMoney() - pay);
        card.setInAndOut(false);
        card.setTime(System.currentTimeMillis());
    }

    public void CheckandPayMoney(TransportCard card, int limit, int pay) {
        if (card.getMoney() < limit) {
            System.out.println("exceed limit.");
        }else{
            card.setMoney(card.getMoney() - pay);
            card.setTime(System.currentTimeMillis());
            card.setBusOrMetro(2);
            card.setInAndOut(true);
            card.setRideLocation(getId());
        }
    }

}