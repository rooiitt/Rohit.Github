package com.kodewala.quetions;

class Demo1 {
    {
        System.out.println("Instance Block"); 
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println("Main Method");
    }
}

