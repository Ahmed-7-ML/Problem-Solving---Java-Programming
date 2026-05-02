import java.util.Scanner;

/*
Problem 21: Factorial Calculator Calculate the factorial of a given number using:
     Method A: for loop
     Method B: while loop
     Handle negative inputs (factorial not defined) and 0! = 1. Use long data type for
    the result.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        if(number >= 0){
            System.out.printf("(For Method) -> The Factorial of %d (%d!) = %d%n", number, number, calcFactorialFor(number));
            System.out.printf("(While Method) -> The Factorial of %d (%d!) = %d%n", number, number, calcFactorialWhile(number));
        }
//        else if(number == 0){
//            System.out.printf("The Factorial of %d (%d!) = %d%n", number, number, 1);
//        }
        else{
            // Negative Number
            System.out.println("Cannot compute factorial for negative number.");
        }
    }

    public static long calcFactorialFor(int number){
        long f = 1;
        for(int i = 2; i <= number; i++){
            f = f * i;
        }
        return f;
    }

    public static long calcFactorialWhile(int number){
        long f = 1;
        int i = 2;
        while( i <= number ){
            f = f * i;
            i++;
        }

        return f;
    }
}