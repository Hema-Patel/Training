package com.mindsprint.project1.array;

public class ArrayDemo1 {
    public static void main(String[]args)
    {
        int array[]=new int[5];
        String[] names={"t1","t2"};
        System.out.println("Access Direct:"+names[0]);//Accessing direct element
        for(int i=0;i<names.length;i++)
            System.out.println(names[i]);
        for( String name:names)
            System.out.println(name);
        System.out.println("store values");




    }
}
