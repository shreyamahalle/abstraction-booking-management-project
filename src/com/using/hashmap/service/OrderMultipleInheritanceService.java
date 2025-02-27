package com.using.hashmap.service;

import com.using.hashmap.model.Order;

public class OrderMultipleInheritanceService extends Order {
    public void displayOrder() {
        System.out.println("Order are not accepted ");
    }
}