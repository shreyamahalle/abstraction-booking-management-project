package com.using.abstraction;
import com.using.abstraction.controller.*;
import com.using.abstraction.impl.CustomerImpl;
import com.using.abstraction.impl.OrderNumberImpl;
import com.using.abstraction.model.Customer;
import com.using.abstraction.model.DeliveryAgent;
import com.using.abstraction.model.Order;
import com.using.abstraction.model.Restaurant;
import com.using.abstraction.service.*;

import java.util.Scanner;
public class BookingOrderManagement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("-----------Booking Management-----------");
            System.out.println("Please choose the option");
            System.out.println("1. Create customer");
            System.out.println("2. Create delivery agent");
            System.out.println("3. Create restaurant ");
            System.out.println("4. Create order");
            System.out.println("5. Display Order Number");
            System.out.println("6. Combo Pack Offer");
            System.out.println("0. Exit project");
            System.out.println("Select the option..");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    CustomerController customerController = new CustomerController();
                    CustomerService customerService = new CustomerService();
                    Customer customer = new Customer();
                    customerController.data();
                    customerService.createCustomer();
                    customerService.displayCustomers();
                    System.out.println("Customer created : " + customer);
                    break;
            }
            switch (option) {
                case 2:
                    DeliveryAgentController deliveryAgentController = new DeliveryAgentController();
                    DeliveryAgentService deliveryAgentService = new DeliveryAgentService();
                    deliveryAgentService.createDeliveryAgent();
                    deliveryAgentController.deliveryInfo();
                    DeliveryAgent deliveryAgent = new DeliveryAgent();
                    deliveryAgentService.displayDeliveryAgent();
                    deliveryAgentService.createDeliveryAgent();
                    System.out.println("DeliveryAgent created : " + deliveryAgent);
                    break;
            }
            switch (option) {
                case 3:
                    OrderController orderController = new OrderController();
                    OrderService orderService = new CustomerImpl();
                    OrderNumberService orderNumberService = new OrderNumberImpl();
                    orderController.orderInfo();
                    orderService.createOrder();
                    Order order = new Order();
                    orderService.displayOrder();
                    orderService.createOrder();
                    System.out.println("Order created : " + order);
                    break;
            }
            switch (option) {
                case 4:
                    RestaurantController restaurantController = new RestaurantController();
                    RestaurantService restaurantService = new RestaurantService();
                    restaurantController.restaurantInfo();
                    restaurantService.createRestaurant();
                    Restaurant restaurant = new Restaurant();
                    restaurantService.displayRestaurant();
                    restaurantService.createRestaurant();
                    System.out.println("Restaurant created : " + restaurant);
                    break;
            }
            switch (option){
                case 5:
                    OrderNumberService orderNumberService = new OrderNumberImpl();
                    OrderNumberController orderNumberController = new OrderNumberController();
                    orderNumberController.orderInfo();
                    orderNumberService.createOrderNo();
            }
            switch (option){
                case 6:
                    OrderMultipleInheritanceService orderMultipleInheritanceService = new OrderMultipleInheritanceService();
                    orderMultipleInheritanceService.displayOrder();
            }
        } while (option != 0);

        System.out.println("THANK YOU!");
    }
}


