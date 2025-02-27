package com.using.abstraction.impl;
import com.using.abstraction.model.Order;
import com.using.abstraction.repository.OrderRepository;
import com.using.abstraction.service.OrderNumberService;
import com.using.abstraction.service.OrderService;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CustomerImpl implements OrderNumberService {

    OrderRepository orderRepository = new OrderRepository();
    HashMap<Integer,Order> orders = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void printCustomer(Order order){

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

    @Override
    public void createOrderNo() {

    }
}