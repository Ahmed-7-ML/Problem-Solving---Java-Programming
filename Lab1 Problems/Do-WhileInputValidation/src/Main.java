/*
Problem25:Do-While Input Validation
Write a program that repeatedly asks the user to enter a positive even number until they comply.
Use a do-while loop to ensure the prompt appears at least once.
(Simulate user input using a predefined array for testing).

Your task:
Use a do-while loop to "ensure" that the program asks the user at least once.
Keep the loop running (looping) and repeat the question as long as (while) the user enters "wrong" numbers.
As soon as the user enters a "correct" number (meaning both even and positive at the same time), the loop stops and the program ends.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte number;

        do{
            System.out.print("Enter even positive number: ");
            number = input.nextByte();

            if(number <= 0)     // Consider 0 is Even but not positive or negative
                System.out.println("Negative Number -> Try again.");
            else if(number % 2 != 0)
                System.out.println("Odd Number -> Try again.");

        }while(number % 2 != 0 || number < 0);    // Repeat when number is odd or negative.

        System.out.println("Success! " + number + " is an even positive number.");
    }
}