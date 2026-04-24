import java.util.Scanner;

public class Project{
    
    public static void main(String[] args){
        
        double average = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Grade for the First Course: ");
        double grade1 = input.nextDouble();        
        
        System.out.print("Enter the Grade for the Second Course: ");
        double grade2 = input.nextDouble();
        
        System.out.print("Enter the Grade for the Third Course: ");
        double grade3 = input.nextDouble();
        
        System.out.print("Grade Average = ");
        average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println(average);
        
    }
}