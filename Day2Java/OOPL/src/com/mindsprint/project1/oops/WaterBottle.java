package com.mindsprint.project1.oops;

public class WaterBottle {

        int capacity;
        String colour;
        String brand;
        public void setData(int capacity, String colour,String brand)
        {
            this.capacity=capacity;
            this.colour=colour;
            this.brand=brand;
        }
        public void display()
        {
            System.out.println("Brand:"+brand);
            System.out.println("Colour:"+colour);
            System.out.println("Capacity:"+capacity+"ltr");
        }
        public static void main(String[]args)
        {
            WaterBottle bottle=new WaterBottle();
            bottle.setData(1,"red","Tupperware");
            bottle.display();
    }
}
