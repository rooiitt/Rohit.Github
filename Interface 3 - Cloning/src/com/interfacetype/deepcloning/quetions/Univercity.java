package com.interfacetype.deepcloning.quetions;

public class Univercity implements Cloneable {

    String univercityName;
    String location;
    Department department;

    @Override
    public Object clone() throws CloneNotSupportedException {

        Univercity univercity = (Univercity) super.clone();

        univercity.department = (Department) department.clone();

        return univercity;
    }
}

