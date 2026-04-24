/*
Problem 8: Compound Assignment Demonstrator Initialize an integer variable num = 100.
Perform the following operations in sequence using compound assignment operators only (+=,-=,
*=, /=, %=):
         Add50
         Subtract 30
         Multiply by 2
         Divide by 5
         Modulus by 7
         Print the value after each operation.
 */

public class Main {
    public static void main(String[] args){
        int num = 100;
        System.out.println("Initial Value: " + num);

        // num += 50 ----> num = num + 50   ----> 150
        num += 50;
        System.out.printf("Number Value after (+=): %d%n", num);

        // num -= 30 ----> num = num - 30   ----> 120
        num -= 30;
        System.out.printf("Number Value after (-=): %d%n", num);

        // num *= 2 ----> num = num * 2     ----> 240
        num *= 2;
        System.out.printf("Number Value after (*=): %d%n", num);

        // num /= 5 ----> num = num / 5     ----> 48
        num /= 5;
        System.out.printf("Number Value after (/=): %d%n", num);

        // num %= 7 ----> num = num % 7     ----> 6
        num %= 7;
        System.out.printf("Number Value after (%%=): %d%n", num);

        System.out.printf("Final Value of Num: %d", num);
    }
}