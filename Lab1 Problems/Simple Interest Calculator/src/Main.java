/*
Problem 6: (((Simple Interest))) Calculator Calculate simple interest using the formula: SI = (P × R ×
T) / 100. Accept Principal (long), Rate (float), and Time (int) using appropriate data types to
minimize memory usage. Display the result with 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // وضع المبلغ الاساسي
        System.out.print("Enter the Principal Value: ");
        long principal = input.nextLong();

        // وضع نسبة الفائدة
        System.out.print("Enter the Rate Value: ");
        float rate = input.nextFloat();

        // وضع مدة الفائدة
        System.out.print("Enter the Duration(Years): ");
        int time = input.nextInt();

        // حساب الفائدة كمبلغ
        double interest = (principal * rate * time) / 100.0d;

        System.out.println("--------------------------------");
        System.out.printf("The Interest Value: %.2f%n", interest);

        // حساب المبلغ الكلى بعد اضافة الفائدة
        System.out.printf("The Whole Balance (after interest): %.2f%n", (principal + interest));


    }
}