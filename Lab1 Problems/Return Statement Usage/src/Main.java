/*
Problem 35: Return Statement Usage
- Write a method isPerfectNumber(int n) that returns boolean (use return statement).
- A perfect number equals the sum of its proper divisors (e.g., 6 = 1+2+3).
- In main, use this method to print all perfect numbers between 1 and 1000.
- Demonstrate early return if number <= 0.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter a Number: ");
        // int n = input.nextInt();
        for(int i = 1; i <= 1000; i++){
            if( isPerfectNumber(i) )
                System.out.println(i + " Perfect Number.");
            // else
                // System.out.println(i + " Not Perfect Number.");
        }
    }

    static boolean isPerfectNumber(int n){
        if(n <= 0)
            return false;

        int sum = 0;
        for(int i = (n - 1); i > 0; i--){
            if(n % i == 0)
                sum += i;
        }

        return (sum == n);
    }
}

// 6 -> 5, 4, 3, 2, 1
// loop (for int i = 6; i > 0; i--)
// if(6 % i) == 0 -> Save it in array --> But the Problem: Size is not Fixed
// Instead : use variable to sum all these divisors (on the fly).
// At the End -> Check this sum == 6