import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args){
        // Continually Input two integers and print the larger one.
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int i = 0;

        do{
            System.out.println(i + "th Iteration");

            System.out.print("Enter First Number: ");
            n1 = input.nextInt();

            System.out.print("Enter Second Number: ");
            n2 = input.nextInt();

            if(n1 > n2){
                System.out.println("Number 1 is Greatest");
            }
            else if(n2 > n1){
                System.out.println("Number 2 is Greatest");
            }
            else{
                System.out.println("2 Numbers are Equal");
            }
            i ++;
        }while(i <= 5);
    }
}
