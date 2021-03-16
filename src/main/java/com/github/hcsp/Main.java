package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args) {
        int x = 1;
        System.out.println(f(x));
        int a = 2,b = 1;
        System.out.println(f(a,b));
    }

    public static int f(int x) {
        return x + 1;
    }

    public static int f(int x, int y) {
        return x - y ;
    }
}
