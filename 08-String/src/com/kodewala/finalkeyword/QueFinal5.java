package com.kodewala.final2;

class QueFinal5 {
    final int number;

    // 1. Constructor
    QueFinal5() {
        number = 100;
    }

    // 2. Instance method
    void display() {
        System.out.println(number);
    }

    // 3. Main method — execution starts here
    public static void main(String[] args) {
    	QueFinal5 obj = new QueFinal5();
        obj.display();
    }
}