import java.util.Scanner;

/*
Problem 19: Tax Calculator Calculate income tax based on these slabs:
     0-2,50,000: No tax
     2,50,001- 5,00,000: 5%
     5,00,001- 10,00,000: 20%
     Above10,00,000: 30%
     Use if-else-if ladder. Add 4% health and education cess on the calculated tax.

    The progressive tax system is the standard system used in most countries worldwide.
    In this case, we don't multiply the entire income by a single percentage; we calculate the tax piecemeal.
    The logic:
        First bracket: We subtract the first $250,000 (these are taxed at 0%).
        Second bracket: We take the amount between $250,001 and $500,000 and multiply it by 5%.
        Third bracket: We take the amount between $500,001 and $1,000,000 and multiply it by 20%.
        Any amount exceeding this is multiplied by 30%.
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income($): ");
        double income = input.nextDouble();

        double tax = 0;

        if(income > 1000000){
            // Fourth bracket: Tax on what exceeds one million + the full tax of the previous brackets
            tax += (income - 1000000) * 0.30;

            // Third bracket tax (from 500 thousand million)
            tax += (500000 * 0.20);

            // Second bracket tax (from 250 thousand to 500 thousand)
            tax += (250000 * 0.05);
        }
        else if(income > 500000){
            tax += (income - 500000) * 0.20;
            tax += (250000 * 0.05);
        }
        else if(income > 250000){
            tax += (income - 250000) * 0.05;
        }
        else{
            tax = 0;
        }

        // Add the 4% cess once
        double totalTax = tax * 1.04;   // tax + (tax * 0.04)
        System.out.println("Tax (before cess): " + tax);
        System.out.println("Cess: " + (tax * 0.04));
        System.out.printf("Total Progressive Tax: %.2f%n", totalTax);
    }
}