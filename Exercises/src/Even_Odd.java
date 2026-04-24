import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        // Continuously Input an integer and print whether it is even or odd.
        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.print("Enter a Number: (-1 to Exit) ");
            number = input.nextInt();

            if (number == -1){
                break;
            }

            if(number % 2 == 0)
                System.out.println("Even Number");
            else
                System.out.println("Odd Number");
        }while(true);
    }
}
