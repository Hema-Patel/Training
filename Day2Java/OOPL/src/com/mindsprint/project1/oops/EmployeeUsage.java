package com.mindsprint.project1.oops;

public class EmployeeUsage {
    public static void main(String[] args) {
        Employee e1=new Employee("John",1,345678);
        System.out.println(e1);
        Employee e2=new Employee();
        e2.setName("TestUser");
        e2.setId(1001);
        e2.setSalary(2000);
        System.out.println("Id:"+e2.getId()+"Name:"+e2.getName()+"Salary:"+e2.getSalary());
    }
}
