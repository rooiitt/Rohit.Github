package interfacetype.quetions.functionalinterface;
/*
 * Child inherits the same abstract method show() from both parent interfaces.
 *  Java treats it as one logical abstract method, 
 *  so Lambda implementation is allowed
 */
interface ParentA {

    void show();

}

interface ParentB {

    void show();

}

@FunctionalInterface
interface Child extends ParentA, ParentB {

}

class Driver {

    public static void main(String[] args) {

        Child obj = () -> {
            System.out.println("Show method implemented using Lambda");
        };

        obj.show();
    }
}
