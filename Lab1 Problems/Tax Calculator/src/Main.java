import java.util.Scanner;

/*
Problem 19: Tax Calculator Calculate income tax based on these slabs:
     0 -> 2,50,000: No tax
     2,50,001 -> 5,00,000: 5%
     5,00,001 -> 10,00,000: 20%
     Above10,00,000: 30%
     Use if-else-if ladder.
    Add 4% health and education cess on the calculated tax.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = input.nextDouble();
        double tax = 0;

        if(income >= 0 && income <= 250000){
            tax = 0;
        }
        else if(income <= 500000){
            tax = income * .05;
        }
        else if(income <= 1000000){
            tax = income * 0.2;
        }
        else{
            tax = income * 0.3;
        }

        double cess = tax * 0.04;
        double totalTax = tax + cess;

        System.out.printf("Tax (before cess): %.2f%n", tax);
        System.out.printf("Health & Education Cess (4%%): %.2f%n", cess);
        System.out.printf("Total Tax to be paid: %.2f%n", totalTax);
    }
}