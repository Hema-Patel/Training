package com.mindsprint.project1.inheritance;

public class MethodOverLoading {
    public int add(int a, int b) {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        System.out.println(obj.add(1.0,2.9));
        System.out.println(obj.add(1,2));

    }
}
