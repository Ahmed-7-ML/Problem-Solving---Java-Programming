import java.util.Scanner;

/*
    Problem 12: Grade Calculator Accept a percentage (0-100) as input. Use if-else-if ladder to
    determine the grade:
     90-100: A
     80-89: B
     70-79: C
     60-69: D
     Below60: F
     Validate input (reject negative numbers or >100).
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Percentage(%): ");
        int percentage = input.nextInt();


        if(percentage < 0 || percentage > 100){
            System.out.println("Invalid Percentage! Please enter a value between 0 and 100.");
        }
        else{
            char grade;
            if(percentage >= 90)
                grade = 'A';
            else if (percentage >= 80)
                grade = 'B';
            else if (percentage >= 70)
                grade = 'C';
            else if (percentage >= 60)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Grade = " + grade);
        }

    }
}