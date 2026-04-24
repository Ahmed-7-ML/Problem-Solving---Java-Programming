/*
Problem 15: Menu-Driven Calculator Display a menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Exit

Use a switch-case structure. For choice 1-5, accept two numbers and perform
the operation. Loop until user selects 6 (use a do-while loop for the menu).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte key;

        do {
            System.out.println("""
                    \n--- Menu-Driven Calculator ---
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Modulus
                    6. Exit
                    """);
            System.out.print("Enter your choice: ");
            key = input.nextByte();

            if (key == 6) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            if (key < 1 || key > 6) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            System.out.print("Enter two numbers: ");
            float n1 = input.nextFloat();
            float n2 = input.nextFloat();
            float result = 0;
            char op = ' ';

            switch (key) {
                case 1 -> { result = n1 + n2; op = '+'; }
                case 2 -> { result = n1 - n2; op = '-'; }
                case 3 -> { result = n1 * n2; op = '*'; }
                case 4 -> {
                    if (n2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result = n1 / n2; op = '/';
                }
                case 5 -> {
                    if (n2 == 0) {
                        System.out.println("Error: Modulus by zero!");
                        continue;
                    }
                    result = n1 % n2; op = '%';
                }
            }

            System.out.printf("Result: %.2f %c %.2f = %.2f%n", n1, op, n2, result);

        } while (key != 6);
    }
}