package com.interfacetype.deepcloning.quetions1;

import java.util.ArrayList;

public class Order implements Cloneable {

    int orderId;
    String customerName;
    ArrayList<Product> products;

    public Order(int orderId, String customerName) {

        this.orderId = orderId;
        this.customerName = customerName;

        // Initialize ArrayList
        this.products = new ArrayList<>();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Order deepClone() throws CloneNotSupportedException {

        Order clonedOrder = (Order) super.clone();

        clonedOrder.products = new ArrayList<>();

        for (Product product : this.products) {
            Product clonedProduct = (Product) product.clone();
            clonedOrder.products.add(clonedProduct);
        }

        return clonedOrder;
    }
}
