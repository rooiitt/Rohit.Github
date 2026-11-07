package com.kodewala.interfaces.java8.defaultmethod;

public interface DeliveryService {
    default void trackOrder() {
        System.out.println("Tracking order");
    }
}

class OnlineDelivery implements DeliveryService {
}

class ExpressDelivery extends OnlineDelivery {
    @Override
    public void trackOrder() {
        System.out.println("Tracking express delivery");
    }
}

 class DeliveryDriver {
    public static void main(String[] args) {
        DeliveryService delivery = new ExpressDelivery();
        delivery.trackOrder();
    }
}


