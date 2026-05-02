/*
Problem 20: Multiplication Table Accept a number and print its multiplication table from 1 to 20
using a for loop. Format the output as:
5 x 1 = 5
5 x 2 = 10
...
5 x 20 = 100
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        System.out.println("Multiplication Table");
        System.out.println("-----------------------------");
        for(int i = 1; i <= 20; i++){
            System.out.printf("%d x %-2d = %-3d%n", number, i, (number * i));
            // System.out.println(number + " x " + i + " = " + (number * i));
        }

        // %-2d -> means reserve space for two digits and align to the left.
        // %-3d -> means reserve space for three digits so the result can reach three digits.

    }
}