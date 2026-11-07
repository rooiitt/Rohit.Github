package com.interfacetype.deepcloning.quetions;

public class Department implements Cloneable {

    String departmentName;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
