/*
Problem 1: Personal Information Display Write a Java program that declares variables to store
your name (String), age (int), and favorite character (char). Print these values in a formatted manner:
Name: [Your Name]
Age: [Your Age]
Favorite Character: [Char]
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Problem 1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favorite character: ");
        char favChar = input.next().charAt(0);

        System.out.println(" ---- INFORMATION ----");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Favorite Character: "+ favChar);
    }
}