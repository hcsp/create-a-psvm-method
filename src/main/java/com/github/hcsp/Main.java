package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static int num;
    public static void main(String[] args) {
        int x = 0;
        System.out.println(f(x));

        int a = 3;
        int b = 2;
        System.out.println(f2(a, b));

        num++;
        System.out.println(num);
    }

    public static int f(int x) {
        return x + 1;
    }

    public static int f2(int x, int y) {
        return x - y;
    }

}
