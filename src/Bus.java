public class Bus extends PublicTransport {

    public Bus(String id){
        setId(id);
        setCount(0);
    }

    @Override
    public void getOffTag(TransportCard card) {
        card.setInAndOut(false);
        card.setTime(System.currentTimeMillis());
    }

    @Override
    public void rideTag(TransportCard card) {
        if(card.isInAndOut()){
            switch (card.getBusOrMetro()){
                case 1:
                    checkMoney(card, 1750);
                    break;
                case 2:
                    checkMoney(card, 1650);
                    break;
            }
        }else{
            //TODO: if(현재 시간 - 카드.시간 <= 15 && 지하철) 환승, 나머지 일반 탑승
            if(System.currentTimeMillis() - card.getTime() <= 15000 && card.getBusOrMetro() == 2){
                checkMoney(card, 700);
            }else{
                checkMoney(card, 1050);
            }
        }
    }

    public void checkMoney(TransportCard card, int money) {
        if (card.getMoney() < money) {
            System.out.println("잔액이 부족합니다.");
        }else{
            card.setMoney(card.getMoney() - money);
            card.setTime(System.currentTimeMillis());
            card.setBusOrMetro(1);
            card.setInAndOut(true);
            card.setRideLocation(getId());
        }
    }
}