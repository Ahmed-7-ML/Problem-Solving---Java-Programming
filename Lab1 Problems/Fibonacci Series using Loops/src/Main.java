import java.util.Scanner;

/*

Problem 22: Fibonacci Series
    Print the first n terms of the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8...)
    where n is input by the user.
    Use a for loop. Ensure you handle the first two terms separately.

    --> Each number is the sum of the two numbers preceding it.
*/
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            printFibonacci(n);
        }
    }

    public static void printFibonacci(int n){
        long firstTerm = 0, secondTerm = 1;

        for(int i = 1; i <= n; i++){
            // Display the Current Number
            System.out.print(firstTerm + ((i < n)? ", " :  "\n"));

            // Compute the Next Term
            long nextTerm = firstTerm + secondTerm;

            // Update terms for next step
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}