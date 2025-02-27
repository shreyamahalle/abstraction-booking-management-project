package com.using.abstraction.service;

import com.using.abstraction.model.Order;

public class OrderMultipleInheritanceService extends Order {
    public void displayOrder() {
        System.out.println("Order are not accepted ");
    }
}