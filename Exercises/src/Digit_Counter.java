import java.util.Scanner;

public class Digit_Counter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Input an integer and count how many digits it has.
        int n = input.nextInt();
        int counter = 0;

        while(n != 0){
            n = n / 10;     // 122 -> 12 -> 1
            counter++;
        }
        System.out.println("Number of Digits = " + counter);


    }
}
