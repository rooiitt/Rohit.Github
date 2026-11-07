package com.kodewala.interfaces.java8.defaultmethod;

public interface OrderService {
    default void placeOrder() {
        validateOrder();
        System.out.println("Order placed successfully");
    }

    default void validateOrder() {
        System.out.println("Order validated");
    }
}

class FoodOrder implements OrderService {
}

class OrderServiceDriver { 
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.placeOrder();
    }
}


