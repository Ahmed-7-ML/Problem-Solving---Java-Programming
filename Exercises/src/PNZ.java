import java.util.Scanner;

public class PNZ {
    public static void main(String[] args){
        //  Positive, Negative, or Zero
        //  Input a number and classify it:
        //      Positive
        //      Negative
        //      Zero

        Scanner input = new Scanner(System.in);
        short number = input.nextShort();

        if(number > 0){
            System.out.println("Positive Number");
        }
        if(number < 0){
            System.out.println("Negative Number");
        }
        if(number == 0){
            System.out.println("Zero");
        }





    }
}
