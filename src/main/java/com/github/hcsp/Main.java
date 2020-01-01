package com.github.hcsp;

public class Main {
    public static int i ;//静态成员,它是持续存在的,独立于函数调用,
                        // 在(Main)这个类的所有地方都可以调用这个变量
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    //psvm + tab键
    public static void main(String[] args) {
        int x = 0;
        System.out.println(f(x));
        a();

        int a=2,b=1;
        f(a,b);

        f(1);
        f(2);
        f(3);

        add();
        add();
        add();

    }

    public static void add(){
        i = i + 1;
    }

    public static void a(){
        b();
    }
    public static  void b(){
        c();
    }

    public static  void c(){
        System.out.println("你跳到c了");
    }

    public static int f(int x){
        int a = 2*x;//a是一个局部变量,其作用域为包含它的最近的那对大括号!
                    // 局部变量只在函数每次被调用的时候有效,函数调用结束的时候就会被销毁!
        return x+a;
    }

    public static int f(int x,int y){
        return x-y;
    }

}
