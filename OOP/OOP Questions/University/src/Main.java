/*
A university has `Person` as a base class with
    `name` and `age`.

`Student` extends `Person` and adds
    `studentId` and `major`.

`GradStudent` extends `Student` and adds
    `thesisTitle`.

Create a `GradStudent` object and print all its details (multilevel inheritance).
*/

// Base = Parent Class
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayPerson(){
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// Child Class (w.r.t Person Class)
// Parent Class (w.r.t GradStudent Class)
class Student extends Person{
    String studentId;
    String major;

    Student(String name, int age, String studentId, String major){
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public void displayStudent(){
        displayPerson();
        System.out.println("ID: " + studentId + " | Major: " + major);
    }
}

// Child Class (w.r.t Student Class)
class GradStudent extends Student{
    String thesisTitle;

    GradStudent(String name, int age, String studentId, String major, String thesisTitle){
        super(name, age, studentId, major);
        this.thesisTitle = thesisTitle;
    }

    public void displayGradStudent(){
        displayStudent();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

/* Summary:
    1. Student class inherit from Person class -> So Student Object will have attributes
        {name, age, studentId, major}

    2. GradStudent class inherit from Student class -> So GradStudent Object will have attributes
        {name, age} + {studentId, major, thesisTitle}
        as the Student inherit from Person , so GradStudent also inherit from Person
*/

public class Main {
    public static void main(String[] args){
        GradStudent gs1 = new GradStudent("Ahmed", 23, "GS123", "CSE", "AI Engineer");

        gs1.displayGradStudent();

    }
}