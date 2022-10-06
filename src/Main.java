import Service.DeliveryCompanyService;
import entities.Customer;
import entities.DeliveryCompany;
import entities.Load;
import entities.Order;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        Load load = new Load(10.0,5.0,7);
        Load load1 = new Load(6.0,7.0,20);
        Load load2 = new Load(9.0,4.0,10);

        Order order = new Order(load);
        Order order1 = new Order(load1);

        System.out.println(order.getOrderFee());
        System.out.println(order1.getOrderFee());

        Customer customer = new Customer("c1",order);
        Customer customer1 = new Customer("c2",order1);
        customer.addOrder(order1);
        List<Customer>customers = new ArrayList<>();
        customers.add(customer);
        customer.addOrder(order1);

        DeliveryCompany deliveryCompany = new DeliveryCompany("company111");
        deliveryCompany.setCustomers(customers);

        List<DeliveryCompany>deliveryCompanies=new ArrayList<>();
        deliveryCompanies.add(deliveryCompany);
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanies);

        System.out.println(deliveryCompanyService.getTotalFee("c1"));
        deliveryCompanyService.acceptOrder(order,0,0);
        System.out.println(deliveryCompanyService.getCompanyProfit("company111"));

    }

}