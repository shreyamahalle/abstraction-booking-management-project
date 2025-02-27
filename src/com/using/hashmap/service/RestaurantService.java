package com.using.hashmap.service;
import com.using.hashmap.model.Restaurant;
import com.using.hashmap.repository.RestaurantRepository;
import java.util.*;

public class RestaurantService {
    private static RestaurantRepository restaurantRepository = new RestaurantRepository();
    private static HashMap<Integer,Restaurant> restaurants = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    void printCustomer(Restaurant restaurant){

        System.out.println(restaurant);
    }
    public static void createRestaurant(){

           Restaurant restaurant = new Restaurant();
            restaurantRepository.createRestaurant(restaurant);
            restaurantRepository.displayRestaurant(restaurant);
            restaurantRepository.displayRestaurantToBeClosed("name");
            try {

            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter area");
            String area = sc.nextLine();

            restaurant.setRegisterNo(registerNo);
            restaurant.setName(name);
            restaurant.setCity(city);
            restaurant.setArea(area);
            restaurants.put(1,restaurant);
            }catch (Exception e){
                System.out.println("Invalid input type correct data");
            }
    }
    public static void displayRestaurant(){
        try {
            Set<Map.Entry<Integer, Restaurant>> entrySet = restaurants.entrySet();
            for (Map.Entry<Integer, Restaurant> customerEntry : entrySet) {
                System.out.println("Customer Info: " + restaurants);
            }
        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
    }
}