package entities;

public class Order {

    private Load load;
    private double orderFee ;
    public Order(Load load) {
        this.load = load;
        this.orderFee = load.getWeight()*DeliveryCompany.pricePerKilogram;
    }

    public double getOrderFee() {
        return orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
}
