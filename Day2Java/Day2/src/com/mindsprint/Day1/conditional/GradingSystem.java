package com.mindsprint.Day1.conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any marks:");
        int marks=sc.nextInt();
        if(marks>=75&&marks<=95)
            System.out.println("Congrats distinction");
        else if(marks==99)
            System.out.println("Topper");
        else if(marks>=35&&marks<=60)
            System.out.println("You are passed");
        else if(marks<=0&&marks<=30)
            System.out.println("you are failed");
        else
            System.out.println("enter vaild marks");
    }
}
