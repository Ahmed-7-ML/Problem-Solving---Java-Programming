import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        // ---------------------------------------------------------------------------------
        // 1) Loop through numbers from 1 to 10 by 3 different solutions

        // For Loop ( Initial Assignment; Condition; Increment/Decrement (Step) )
        for(int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
        }

        // While Loop
        int i = 1;      // Initial Assignment
        while(i <= 10){ // Condition
            System.out.println("i = " + i);
            i++;        // Step
        }

        // Do...While Loop
        do{
            System.out.println("i = " + i);
            i++;
        }while(i <= 10);

        // ---------------------------------------------------------------------------------
        // 2) Calculate the Sum of 10 Floating point numbers
        Scanner input = new Scanner(System.in);

        float sum = 0.0f, number;

        for(int i = 0; i<= 10; i++){
            System.out.print("Enter a Number: ");
            number = input.nextFloat();
            sum += number;
        }
        System.out.println("Sum = " + sum);

        // ---------------------------------------------------------------------------------
        // 3) Ask the user to input a number and display the multiplication table for it.
        System.out.print("Enter a Number: ");
        int n = input.nextByte();       // True -> As Byte < Int in Size.
        for(int i = 1; i<=12; i++){
            System.out.println(n + " * " + i + " = " + (i * n));
        }

//         ------------- Tricky Print -------------
//         From Left to Right
        System.out.println(12 + 2 + "Hello");   // 12+2 done first -> 14 , then concat with text -> 14Hello
        System.out.println("Hello" + 12 + 2);   // Concat Text with 12 -> Hello12 , then concat with 2 -> Hello122

        // ---------------------------------------------------------------------------------
        // 4) Find the Factorial of a Number (e.g. 5! = 5 * 4 * 3 * 2 * 1 = 120
        int f = 1;        // قيمة المحايد الضربي
        System.out.print("Enter a Number: ");
        int n = input.nextShort();   // True -> As Short < Int in Size.

        for(int j = n; j >= 1; j--){
            // IF n = 5
            // J = 5 -> 4 -> 3 -> 2 -> 1

            f *= j;
            // f = 5 * 1 = 5
            // -> f = 5 * 4 = 20
            // -> f = 20 * 3 = 60
            // ...etc.
            if( j > 1){
                System.out.print(j + " * ");
            }
            else{
                System.out.println(j);
            }
        }
        System.out.println("\n" + n + "! = " + f);

        // ---------------------------------------------------------------------------------

        // 5) Ask the user to input 10 numbers then display for him the summation of even numbers and odd numbers
        // and also display how many even and odd numbers.
        int n, sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0;
        for(int k=0; k < 10; k++){
            System.out.print("Enter a Number: ");
            n = input.nextInt();
            if(n % 2 == 0) {// Even
                sumEven += n;
                countEven++;
            }
            else { // Odd
                sumOdd += n;
                countOdd++;
            }
//             Tricky Solution -> Ternary Operator
            sumEven += (n % 2 == 0)?  n: 0;     // If n is Even : Add it to (n) else nothing(Add it to Zero)
            sumOdd  += (n % 2 != 0)?  n: 0;     // If n is Odd  :  Add it to (n) else nothing(Add it to Zero)

            countEven += (n % 2 == 0)? 1: 0;    // If n is Even : Add it to (1) else nothing(Add it to Zero)
            countOdd  += (n % 2 != 0)? 1: 0;    // If n is Odd  :  Add it to (1) else nothing(Add it to Zero)

        }
        System.out.println("Even Sum = " + sumEven);
        System.out.println("Odd Sum = " + sumOdd);
        System.out.println("Number of Even Values = "+ countEven);
        System.out.println("Number of Odd Values = "+ countOdd);

        // ---------------------------------------------------------------------------------
        // 6) Calculate the Sum of Series where n is input by user
        // 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...... + 1/n
        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        float sum = 0;
        for(int g = 1; g <= n; g++){
            System.out.print("(1/" + g + ")");
            if(g != n) {
                System.out.print(" + ");
            }
            sum += (1.0f / g);
        }
        System.out.println("\n" + sum);
    }
}