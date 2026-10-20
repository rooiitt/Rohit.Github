package com.kodewala.quetions;

class Demo {
    static {
        System.out.println("Static");
    }

    {
        System.out.println("Instance");
    }

    Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}