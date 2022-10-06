package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeliveryCompanyService {
    private List<DeliveryCompany> deliveryCompanies = new ArrayList<>();

    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public void acceptOrder(Order order, int company, int customer) {
        deliveryCompanies.get(company).getCustomers().get(customer).addOrder(order);
    }

    public void createDeliveryCompany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the company name: ");
        deliveryCompanies.add(new DeliveryCompany(scanner.nextLine()));
    }

    public double getTotalFee(String name) {
        double f = 0;
        for (DeliveryCompany d : deliveryCompanies) {
            for (Customer customer : d.getCustomers()) {
                if (name.equals(customer.getCustomerName())) {
                    f = customer.getOrders().stream().map(Order::getOrderFee).reduce(0.0, Double::sum);
                }
            }
        }
        return f;
    }


    public double getCompanyProfit(String company) {
        double d = 0.0;
        for (DeliveryCompany deliveryCompany : deliveryCompanies) {
            if (company.equals(deliveryCompany.getDeliveryCompanyName())) {
                for (Customer customer : deliveryCompany.getCustomers()) {
                    d += customer.getOrders().stream().map(c -> c.getOrderFee()).reduce(0.0, Double::sum);
                }
            }
        }
        return d;
    }

}
