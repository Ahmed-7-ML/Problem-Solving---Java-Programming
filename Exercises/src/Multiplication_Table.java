import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        // Input a number n and print its multiplication table up to 12.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("=========================================");
        for(int i = 1; i<=12; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println("=========================================");

    }
}
