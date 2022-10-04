package entities;

import java.util.List;

public class Customer {
    private String customerName;
    private List<Order> orders;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Customer(String customerName, Order order) {
        this.customerName = customerName;
        this.orders = orders;
    }
    public Customer(){

    }
}
