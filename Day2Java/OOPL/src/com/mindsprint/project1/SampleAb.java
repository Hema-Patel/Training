package com.mindsprint.project1;
abstract class Test{
    public abstract void display();
}
public class SampleAb  extends Test{
    @Override
    public void display() {
        System.out.println("Display ab");
    }
    public static void main(String[] args) {
        Test test = new SampleAb();
        test.display();
    }
}
