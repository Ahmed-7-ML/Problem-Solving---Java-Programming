/*
Problem 22: Fibonacci Series
    Print the first n terms of the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8...)
    where n is input by the user.
    Use a for loop. Ensure you handle the first two terms separately.
    --> Each number is the sum of the two numbers preceding it.
    --> Mathematical Equation: F(n) = F(n-1) + F(n-2)  , where F(0) = 0, F(1) = 1
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        // Recursion Solution
        System.out.println("Result = " + (calcFibonacciSeries(n)));
    }

    public static long calcFibonacciSeries(int number){
        if(number == 1){
            return 1;
        }
        else if(number == 0){
            return 0;
        }
        else{
            return calcFibonacciSeries( number - 1) + calcFibonacciSeries( number - 2);
        }
    }

}