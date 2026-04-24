/*
Problem 6: (((Compound Interest))) Calculator Calculate Compound interest using the formula: A = P * (1 + r / 100)^t.
Accept Principal(P) (long), Rate(r) (float), and Time(t) (int) using appropriate data types to
minimize memory usage. Display the result with 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal Value (P): ");
        long principal = input.nextLong();

        System.out.print("Enter the Annual Interest Rate (R%): ");
        float rate = input.nextFloat();

        System.out.print("Enter the Time in years (T): ");
        int time = input.nextInt();

        // حساب المبلغ الكلي باستخدام قانون الفائدة المركبة
        // Math.pow(base, exponent) تحسب (الأس) وترجع دائماً double
        double totalAmount = principal * Math.pow((1 + rate / 100.0), time);

        // الفائدة الربحية فقط هي المبلغ الكلي ناقص الأصلي
        double compoundInterest = totalAmount - principal;

        System.out.println("--------------------------------");
        System.out.printf("Compound Interest Value: %.2f%n", compoundInterest);
        System.out.printf("Total Balance after %d years: %.2f%n", time, totalAmount);
    }
}