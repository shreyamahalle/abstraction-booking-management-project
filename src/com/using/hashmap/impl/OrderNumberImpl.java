package com.using.hashmap.impl;

import com.using.hashmap.service.OrderNumberService;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderNumberImpl implements OrderNumberService {

    @Override
    public void createOrderNo() {
        AtomicInteger orderNumberCounter = new AtomicInteger(100);

    }
}
