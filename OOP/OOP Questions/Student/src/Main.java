/*
Create a `Student` class with fields
    `name`, `id`, and `gpa`.
Create three student objects and print which student has the highest GPA without using arrays.
*/

class Student{
    String id;
    String name;
    float gpa;

    Student(String id, String name, float gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
}

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("S123", "Omar", 3.82f);
        Student s2 = new Student("S124", "Shimaa", 4.0f);
        Student s3 = new Student("S125", "Aya", 3.50f);

        Student top = s1;       // Like a Pointer to s1.
        if( s2.gpa > top.gpa )
            top = s2;
        else if ( s3.gpa > top.gpa )
            top = s3;

        System.out.println("Top Student: " + top.name + " | GPA: " + top.gpa + " | ID: " + top.id);
    }
}