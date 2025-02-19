package com.mindsprint.project1.oops;

public class StudentGrade {
    String name;
    int[] grades;

    public StudentGrade(String name,int[]grades) {
        this.name=name;
        this.grades=grades;

    }
public double getAverage() {

    int sum = 0;
    for (int i = 0; i < grades.length; i++) {
        sum += grades[i];
    }
    return (double) sum / grades.length;
}
    public void display()
    {
        System.out.println(name);
        System.out.println(getAverage());

    }
public static void main(String[]args)
{
    StudentGrade s1= new StudentGrade("Alia",new int[] {5,6,7,8,9});
    s1.display();
}
}
