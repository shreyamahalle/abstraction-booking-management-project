package com.using.hashmap;
import com.using.hashmap.controller.CustomerController;
import com.using.hashmap.controller.DeliveryAgentController;
import com.using.hashmap.controller.OrderController;
import com.using.hashmap.controller.RestaurantController;
import com.using.hashmap.model.Customer;
import com.using.hashmap.model.DeliveryAgent;
import com.using.hashmap.model.Order;
import com.using.hashmap.model.Restaurant;
import com.using.hashmap.service.CustomerService;
import com.using.hashmap.service.DeliveryAgentService;
import com.using.hashmap.service.OrderService;
import com.using.hashmap.service.RestaurantService;

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
                    OrderService orderService = new OrderService();
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
        } while (option != 0);

        System.out.println("THANK YOU!");
    }
}


