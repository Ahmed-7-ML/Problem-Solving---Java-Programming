import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // To Accept Input from user.
        Scanner input = new Scanner(System.in);

        // Accept Text Input (Name with Spaces).
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        // Accept Whole Number from user (Age).
        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        // Accept Decimal Number from user (Weight and Length).
        System.out.print("Enter your Weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your Length (cm): ");
        double length = input.nextDouble();
        length /= 100;

        // BMI -> Bode Mass Index ---> BMI = Weight / Length^2
        double BMI = weight / (length * length);

        // Display User Data
        System.out.println("--------------- User Information ---------------");
        System.out.printf("%nName: %s%nAge: %d Years%nWeight: %.2f Kg%nLength: %.2f M%nBMI: %.2f%n", name, age, weight, length, BMI);

        System.out.print("Case: ");
        if (BMI < 18.5) {
            System.out.println("Under Weight");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal Weight");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Over Weight");
        } else if (BMI > 30) {
            System.out.println("Obese");
        }
    }
}