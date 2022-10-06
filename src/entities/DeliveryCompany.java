package entities;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCompany {
    public static final double pricePerKilogram = 20.0;

    public double getPricePerKilogram() {
        return pricePerKilogram;
    }

    public double getMaxCapacityPerSquareMeter() {
        return maxCapacityPerSquareMeter;
    }

    private final double maxCapacityPerSquareMeter = 10.0;
    private String deliveryCompanyName;
    List<Customer>customers = new ArrayList<>();

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

}
