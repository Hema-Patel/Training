package com.mindsprint.project1.array;

public class TwoDArray {
    public static void main(String[]args)
    {
       // int[][] array=new int[3][];
        int[][] array={{1,2,3},{4,5,6}};
        for(int i=0;i<array.lenght;i++) {
            for (int j = 0; j < array[i].lenght; j++) {
                System.out.println(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("access using each");
        for(int[] arr:array)
        {
            for(int num:arr)
            {
              System.out.print(num+"\t");
            }
        }
    }
}
