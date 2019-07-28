package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args){
        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        d();
    }

    public static void d(){
        System.out.println("debug");
    }

}
