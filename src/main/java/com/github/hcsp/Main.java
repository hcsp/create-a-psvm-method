package com.github.hcsp;

public class Main {
    public static int i;

    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args) {
        d();
        d();
        d();
    }
    public static void d() {
        i = i + 1;
    }
}
