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
        if(card.isInAndOut()){
            switch (card.getBusOrMetro()){
                case 1:
                    card.setMoney(card.getMoney() - 1750);
                    break;
                case 2:
                    card.setMoney(card.getMoney() - 1650);
                    break;
            }
        }else{
            //TODO: if(현재 시간 - 카드.시간 <= 15 && 지하철) 환승, 나머지 일반 탑승
            
        }
    }
}
