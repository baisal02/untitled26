package entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Order> orders = new ArrayList<>();

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
        orders.add(order);
    }
    public Customer(){

    }
}
