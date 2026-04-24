import java.util.Scanner;

public class Sum_of_First_N_Numbers {
    public static void main(String[] args){
        // Input n and print the sum from 1 to n.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("Sum = " + sum);

    }
}
