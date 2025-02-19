package com.mindsprint.Day1.basics;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter 1st number");
        int num2 = sc.nextInt();
        System.out.println("Addition:" + (num1 + num2));
        System.out.println("Subtraction:" + (num1 - num2));
        System.out.println("Multiplication:" + (num1 * num2));
        System.out.println("Division:" + (num1 / num2));
        System.out.println("Modulus:" + (num1 % num2));


    }

    }


