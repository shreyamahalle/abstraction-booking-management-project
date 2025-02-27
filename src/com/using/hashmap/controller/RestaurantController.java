package com.using.hashmap.controller;

import com.using.hashmap.exception.CustomerException;
import com.using.hashmap.model.Customer;
import com.using.hashmap.model.Restaurant;
import com.using.hashmap.service.OrderService;
import com.using.hashmap.service.RestaurantService;

import java.util.Scanner;

public class RestaurantController {


    private RestaurantService restaurantService = new RestaurantService();
    private Customer C = new Customer();
    private Scanner sc = new Scanner(System.in);

    public void restaurantInfo() {
        int option;
        do{
            System.out.println("\n---- Order ----");
            System.out.println("1. Add Order");
            System.out.println("2. View Order Details");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");

            option = Integer.parseInt(sc.nextLine());
            try {
                switch (option) {
                    case 1:
                        RestaurantService.createRestaurant();
                        Restaurant restaurant = new Restaurant();
                        RestaurantService.displayRestaurant();
                        System.out.print("restaurant " + restaurant);
                        break;
                    case 2:
                        RestaurantService.createRestaurant();
                        break;
                    case 0:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (CustomerException e) {
                System.out.println("Error: " + e.getClass());
            }
        } while (option != 0);
    }
}


