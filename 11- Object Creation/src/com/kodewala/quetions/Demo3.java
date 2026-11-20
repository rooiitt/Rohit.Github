package com.kodewala.quetions;

class Demo3 {
    {
        System.out.println("IIB");
    }

    static void display() {
        Demo3 d = new Demo3(); //IIB executes once for every object created, not once for every method call.
    }

    public static void main(String[] args) {
        display();
        display();
    }
}
