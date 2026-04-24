import java.util.Scanner;

public class Do_While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Exit-Controlled
        // Executed at least once
        // Execute Block then Check Condition

        char letter;
        int i = 0;
        do{
            letter = input.next().charAt(0);
            if(letter != 'q') {
                i++;
                System.out.println("Letter: " + letter + " Counter: " + i);
            }
        }while(letter != 'q');

        System.out.print(i);


    }
}
