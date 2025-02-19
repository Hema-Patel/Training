package com.mindsprint.project1.pract;

import java.util.Scanner;

public class ReversingOfArray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of the array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("enter the elements of the array");
            arr[0]=sc.nextInt();
        System.out.println("the reverse of the array is");
            for(int i=num;i>=0;i--)
            {


                System.out.println(arr[i]+" ");

            }


    }
}
