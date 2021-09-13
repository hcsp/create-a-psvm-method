package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static int i;

    public static void main(String[] args) {
        add();
        add();
        add();
    }
    public static void add() {
        i = i + 1;
    }
}
