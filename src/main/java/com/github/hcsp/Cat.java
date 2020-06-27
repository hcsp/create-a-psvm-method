package com.github.hcsp;

public class Cat {
    public String name;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        Main.i = 123;
        System.out.println("meow " + name+",length is " + name.length());
    }
}
