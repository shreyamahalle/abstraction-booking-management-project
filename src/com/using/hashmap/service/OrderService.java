package com.using.hashmap.service;
import com.using.hashmap.model.Order;
import com.using.hashmap.repository.OrderRepository;
import java.util.*;

public class OrderService {

    OrderRepository orderRepository = new OrderRepository();
    private HashMap<Integer,Order> orders = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Order order){

        System.out.println(order);
    }
    public Order createOrder(){
            Order order = new Order();
            orderRepository.createOrder(order);
            orderRepository.displayOrder(order);
            orderRepository.displayOrderToBeClosed(1);

            try {
                System.out.println("Please enter id");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println("Please enter type");
                String type = sc.nextLine();

                System.out.println("Please enter note");
                String note = sc.nextLine();

                System.out.println("Please enter paymentMethod");
                String paymentMethod = sc.nextLine();

                order.setId(id);
                order.setPaymentMethod(paymentMethod);
                order.setNote(note);
                order.setType(type);
                orders.put(1, order);
            }catch (Exception e){
                System.out.println("Invalid input type correct data");
            }
            return order;
        }
    public void displayOrder(){
        try {
            Set<Map.Entry<Integer, Order>> entrySet = orders.entrySet();
            for (Map.Entry<Integer, Order> customerEntry : entrySet) {
                System.out.println("Customer Info: " + orders);
            }
        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
    }
}