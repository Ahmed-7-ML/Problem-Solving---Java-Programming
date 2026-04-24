import java.util.Scanner;

// 1. next()
// 2. nextLine()
// 3. nextInt()
// 4. nextDouble()
// 5. nextBoolean()

public class Input{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // 1) Accept Text from user.
        System.out.print("Enter your Name: ");
        String name = input.next();
        
        // If the user writes -> Ahmed Akram
        // name stores only "Ahmed" 
        // Stop at the first space.
        
        System.out.println("Hello, "+ name);
        
        System.out.print("Enter your full name: ");
        // ---> To Accept the Text from the Whole Line with spaces
        String fullname = input.nextLine();
        
        System.out.println("Hello, "+ fullname);

        // -----------------------------------------------------
        
        // 2) Accept Integers (Whole Numbers) from user
        // Don't use 'byte' or 'short' as the size of them is less than the int size
        // You should use 'int' -> The Exact Size we want or 'long' Larger Size
        // To avoid this error -> incompatible types: possible lossy conversion from int to byte/short
       
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        // long age = input.nextInt();
        
        System.out.println("Your Age : "+ age);

        // -----------------------------------------------------
        
        // 3) Accept decimal numbers from user
        // Don't use 'float' as its size is less than double
        // To avoid this error -> incompatible types: possible lossy conversion from double to float
        
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();
        
        System.out.println("Your GPA : "+ gpa);

        // -----------------------------------------------------
        
        // 4) Accept only boolean values from the user
        
        System.out.print("Is he Student? ");
        boolean isStudent = input.nextBoolean();
        
        System.out.println(isStudent);
        
    }
    
}