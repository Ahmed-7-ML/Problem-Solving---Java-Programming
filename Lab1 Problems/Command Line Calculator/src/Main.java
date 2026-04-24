/*
Problem 2: Command Line Calculator Write a program that accepts two integers and one
operator (+,-, *, /) as command line arguments (String[] args). Perform the operation and display
the result. Handle division by zero with an appropriate message.
 */

public class Main {
    public static void main(String[] args){
        // Ensure that user enters 3 Values
        if(args.length < 3){
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        System.out.println("Arg 0: " + args[0]);
        System.out.println("Arg 1: " + args[1]);
        System.out.println("Arg 2: " + args[2]);

        // Convert inputs from text to  numbers
        float n1 = Float.parseFloat(args[0]);
        String symbol = args[1];
        float n2 = Float.parseFloat(args[2]);

        double result = 0;

        switch(symbol) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "x": // As * not works in Terminal
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0)
                    System.out.println("Cannot Divide by Zero");
                else
                    result = n1 / n2;
                break;
            case "%":
                if (n2 == 0)
                    System.out.println("Cannot divide by Zero");
                else
                    result = n1 % n2;
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }

        System.out.println(n1 + " " + symbol + " " + n2 + " = " + result);

    }
}