package com.mindsprint.project1.inheritance;
class Parent{
    public String name="Test";
    public Parent(){
        System.out.println("Parent");
    }
    public void hello()
    {
        System.out.println("hello");
    }
}
class Child extends Parent{
    public Child(){
        super();
        System.out.println("Child");
    }
    public void print()
    {
        System.out.println("Welcome"+name);
    }
}
public class SampleInheritance {
    public static void main(String[] args) {


        Child child = new Child();
        child.print();
        child.hello();
        System.out.println(child.name);
    }
}