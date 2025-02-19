package com.mindsprint.project1.inheritance;
class ParentPhone{
    public void call(){
        System.out.println("Calling ParentPhone");
    }
}
class ChildPhone extends ParentPhone{
    public void call(){
        super.call();
        System.out.println("Calling ChildPhone");
    }
}
public class MethodOverRidding {
    public static void main(String[] args) {
        ChildPhone alex = new ChildPhone();
        alex.call();
        System.out.println();
    }
}
