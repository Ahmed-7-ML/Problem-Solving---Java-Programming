/*
    - System.out.printf() Like System.out.print() 
        But it is used for Text Formatting (Insert values from variables inside String)
        * %s for String Variables
        * %n Like /n for Line Break
        * %d for Integer Variables
        * %f for Double/Float Variables
            %.(n)f -> To approximate the number. (n) digits after decimal point
        * %b for Boolean Variables
*/

public class Formatter{
    public static void main(String[] args){
        String name = "Ahmed";
        
        System.out.printf("Your name is %s", name);
        
        String fname = "Ahmed";
        String lname = "Akram";
        
        System.out.printf("Full Name is %s %s %n", fname, lname);
        System.out.printf("First Name: %s%nLast Name: %s",fname, lname);
        
        short age = 22;
        System.out.printf("Your Age is: %d", age);
        
        float gpa = 3.71f;
        System.out.printf("GPA = %.2f", gpa);
        
        Boolean success = true;
        System.out.printf("Succeded ? %b", success);
    }
}