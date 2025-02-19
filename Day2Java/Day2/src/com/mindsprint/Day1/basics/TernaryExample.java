package com.mindsprint.Day1.basics;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Selling_price:");
        int sell=scanner.nextInt();
        System.out.println("purchase_price:");
        int purchase=scanner.nextInt();

        String res=(sell>purchase)?"profit is: " + (sell-purchase) :"loss is: "+ (purchase-sell);
        System.out.println("result is:"+res);



    }
}
