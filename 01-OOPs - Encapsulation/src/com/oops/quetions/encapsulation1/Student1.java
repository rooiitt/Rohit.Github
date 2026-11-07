package com.oops.quetions.encapsulation1;

public class Student1 {
	    private int age = 20;

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }
	}

class Main3 {
	    public static void main(String[] args) {
	        Student1 s = new Student1();
	        s.setAge(22);
	        System.out.println(s.getAge());
	    }
	}


