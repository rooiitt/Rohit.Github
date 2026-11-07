package com.interfacetype.deepcloning.quetions1;

public class OrderDriver {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Original Order
        Order originalOrder = new Order(101, "Rohit");

        originalOrder.products.add(new Product(1, "Laptop", 55000));
        originalOrder.products.add(new Product(2, "Mobile", 25000));
        originalOrder.products.add(new Product(3, "Keyboard", 1500));



        Order shallowOrder = (Order) originalOrder.clone();

        shallowOrder.products.get(0).price = 60000;

        shallowOrder.products.remove(1);

        System.out.println("Original Order After Shallow Cloning:");

        for (Product p : originalOrder.products) {
            System.out.println(p.productName + " : " + p.price);
        }




        Order deepOrder = originalOrder.deepClone();

        deepOrder.products.get(0).price = 70000;

        deepOrder.products.remove(1);

        System.out.println("\nOriginal Order After Deep Cloning:");

        for (Product p : originalOrder.products) {
            System.out.println(p.productName + " : " + p.price);
        }
    }
}