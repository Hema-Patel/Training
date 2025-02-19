package com.mindsprint.Day1.conditional;

import java.util.Scanner;

public class SwitchCalci {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("Choose any operation + for addition\n - for subtract\n * for multiplication\n / for division\n");
        String input=sc.next();

        switch(input)
        {
            case "+":
                System.out.println("Add"+(num1+num2));
                break;
                case "-":
            System.out.println("sub"+(num1-num2));
            break;
            case "*":
                System.out.println("Mul"+(num1*num2));
                break;
            case "/":
                System.out.println("div"+(num1/num2));
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println("Enter y to continue press other key to exit");
        String op=sc.next();
        if (op.equals("y")||op.equals("Y"));



    }
}
