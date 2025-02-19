package com.mindsprint.project1.oops;

import java.awt.*;

public class Student {
    int id;
    String name;
    String email;
    String address;
public Student(){}//default constructor
    public Student(String name, String email, String address) {
        //this((int)Math.round(Math.random()*1000),name,email,address);
        this.id=(int)Math.round(Math.random()*10000);
        this.name=name;
        this.email=email;
        this.address=address;

    }




    public Student(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{"+"id="+id+",name="+name+",email="+email+",address="+address+'}';
    }
    public static void main(String[]args)
    {
        Student s=new Student();
        Student s1=new Student("Alex","alex@gmail.com","US");
        Student s2=new Student("Alia","alia@gmail.com","UK");
        System.out.println(s1);
        System.out.println(s2);

    }
}
