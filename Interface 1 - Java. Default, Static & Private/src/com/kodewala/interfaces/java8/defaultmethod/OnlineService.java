package com.kodewala.interfaces.java8.defaultmethod;

public interface OnlineService {
    default void connect() {
        System.out.println("Connected through online service");
    }
}

interface NetworkService {
    default void connect() {
        System.out.println("Connected through network service");
    }
}

class BaseDevice {
    public void connect() {
        System.out.println("Connected through base device");
    }
}

class SmartTV extends BaseDevice
        implements OnlineService, NetworkService {
}

class OnlineServiceDriver {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.connect();
       
    }
}


