package com.mindsprint.project1;
class Base{
    int num;
    Base(int num){
        this.num = num;
    }
}
class Derived extends Base{
    Derived(int data){
        super(data);//passing the parameter to parent class constructor
    }

}
public class SuperKey {
    public static void main(String[] args) {
        Derived d = new Derived(1);
        System.out.println(d.num);
    }
}
