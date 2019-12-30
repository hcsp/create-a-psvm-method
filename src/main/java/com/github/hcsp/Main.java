package com.github.hcsp;


import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Main {
    public static void main(String[] args) {
        int x=0;
        System.out.println(f(x));
        int a=2,b=1;
        f(a,b);
        System.out.println(f(a,b));
        g();
    }

    public static int f(int x) {
           return x+1;
    }
    public static int f(int x,int y){
           return x-y;
    }
    public static void g() {
    }
}
