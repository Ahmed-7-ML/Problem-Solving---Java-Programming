import java.util.Scanner;

/*
Problem 14: Number to Words (Switch) Accept a single digit (0-9) as input. Use a switch
statement (traditional or modern arrow syntax) to print the number in words (e.g., input 5 prints
"Five"). Include a default case for invalid inputs.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Single Digit(0-9): ");
        byte digit = input.nextByte();

        // Traditional Syntax
        switch (digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }

        // Modern-Syntax(Java >= 14)  -> Removes Colon : and break statement.
        switch(digit){
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Invalid Input!");
        }

        // In Modern Syntax, you can use Switch to directly assign a value to a variable (Assignment).
        String word = switch (digit){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid Input";
        };
        // Don't Forget the semi-colon(;) at the end of assignment.

        System.out.printf("%d -> %s%n", digit, word);

        // Another Solution with Array
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if(digit >= 0 && digit <= 9)
            System.out.println("The Word: " + words[digit]);
        else
            System.out.println("Invalid Input");

    }
}