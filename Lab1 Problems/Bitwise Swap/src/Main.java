/*
Problem 7: Bitwise Swap Write a program to swap two integers without using a temporary
variable or arithmetic operators. Use only bitwise XOR (^) operator. Display values before and after
swapping.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" ------ Swapping Numbers ------ ");

        System.out.print("Enter First Number: ");
        int n1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int n2 = input.nextInt();

        System.out.println("Before Swap: n1 = " + n1 + ", n2 = " + n2);
//        // Let: n1 = 5 , n2 = 3

//        int result = n1 ^ n2;     // To Save the result with original numbers entered.
//        n1 = result ^ n1;         // (3 ^ 5) ^ 3 = (6 ^ 3) = 5 -> n1 = n2
//        n2 = result ^ n2;         // (3 ^ 5) ^ 5 = (6 ^ 5) = 3 -> n2 = n1

        // Another Solution (Without Third Variable `result`)
        n1 = n1 ^ n2;               // (5 ^ 3) = 6 -> n1 = 6
        n2 = n1 ^ n2;               // (6 ^ 3) = 5 -> So n2 has the value of first number (n1 = 5)
        n1 = n1 ^ n2;               // (6 ^ 5) = 3 -> We use the original value of n1 (5) that stored in n2

        System.out.println("After Swap:  n1 = " + n1 + ", n2 = " + n2);
    }
}