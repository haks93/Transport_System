public abstract class PublicTransport {
    private String id;
    private int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void rideTag(TransportCard card){
        int money = card.getMoney() - 1050;
        card.setMoney(money);
    }

    public abstract void getOffTag(PublicTransport card);

    public void printCalculate(){

    }
}
