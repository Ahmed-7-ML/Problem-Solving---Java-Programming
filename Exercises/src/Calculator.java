import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char symbol;

        do {
            System.out.println("Enter Operation Symbol: + , -, *, /, %, q to quit");
            symbol = input.next().charAt(0);

            if(symbol == 'q') {
                System.out.println("Exit the Program");
                break;
            }
            else if(symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/' && symbol != '%'){
                System.out.println("Invalid Operator Symbol, Try Again!");
                continue;
            }

            System.out.println("Enter 2 Numbers");

            System.out.print("Enter First Number: ");
            int n1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            int n2 = input.nextInt();

            if (symbol == '+') {
                System.out.println("Addition Result: " + n1 + " + " + n2 + " = " + (n1 + n2));
            } else if (symbol == '-') {
                System.out.println("Subtraction Result: " + n1 + " - " + n2 + " = " + (n1 - n2));
            } else if (symbol == '*') {
                System.out.println("Multiplication Result: " + n1 + " * " + n2 + " = " + (n1 * n2));
            } else if (symbol == '/') {
                System.out.println("Division Result: " + n1 + " / " + n2 + " = " + (n1 / n2));
            } else if (symbol == '%') {
                System.out.println("Modulus Result: " + n1 + " % " + n2 + " = " + (n1 % n2));
            }

        }while(symbol != 'q');

        input.close();
    }
}
