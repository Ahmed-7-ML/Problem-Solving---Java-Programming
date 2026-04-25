/*
Types of Methods:
    1. Predefined Method = Standard Library Method = Built-in Method
        - Already defined in java class libraries.
        - Access it by: ClassName.methodName();
    2. User-defined Method
        - Written by user to define the requirements.

Difference between Static and Instance Method:
    1. Static Method: Belongs to the class rather than any specific object.
        • Can be called without creating an instance of the class.
        • Since static methods are not object-specific, they can access only static members (data
        and methods), and cannot access non-static members.
        • Called directly or by ClassName.methodName();

    2. Instance Method: Belongs to an object.
        • Need to create an instance of the class to call.
        • Can access instance variables, other instance methods, and static members of the class.
        • Have access to this reference, which points to the current object.

*/
class Test{
    // Attribute
    String n = "";

    // Instance Method
    public void test(String n){
        // this keyword used to refer the current object.
        this.n = n;
    }
}

public class Main {

    // Static Method
    public static void greet(String name){
        System.out.println("Hello, " + name + " !");
    }

    public static void main(String[] args){
        greet("Ahmed");

        // Using Class Name
        Main.greet("Omar");


        // Instantiate an Object from the Class
        Test t = new Test();

        t.test("Hello, world!");
        System.out.println(t.n);


    }
}