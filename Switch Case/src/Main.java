import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        int selection = 8;

        // break -> to exit from the switch...case
        // switch(value) -> value can be byte, short, int, char, String
        // not accept float or double

//        switch(selection) {
//            case 1:
//                System.out.println("Play the Game.");
//                break;
//            case 2:
//                System.out.println("Exit the Game.");
//                break;
//            default:
//                System.out.println("Welcome to the Game.");
//                break;
//        }
//        int day = 10;
//
//        switch(day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday.");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend.");
//                break;
//            default:
//                System.out.println("Not a Valid WeekDay Number.");
//        }

        // Exercise:- Calculator
        System.out.print("Enter the Operation Symbol: ");
        char symbol = input.next().charAt(0);

        System.out.print("Enter the First Number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int n2 = input.nextInt();

        int result = 0;

        switch(symbol){
            case '+':
                System.out.println("Addition Operation");
                result = n1 + n2;
                break;
            case '-':
                System.out.println("Subtraction Operation");
                result = n1 - n2;
                break;
            case '*':
                System.out.println("Multiplication Operation");
                result = n1 * n2;
                break;
            case '/':
                System.out.println("Division Operation");
                result = n1 / n2;
                break;
            case '%':
                System.out.println("Modulus Operation");
                result = n1 % n2;
                break;
            default:
                System.out.println("Not valid Symbol!");
                break;
        }
        System.out.printf("%d %s %d = ", n1, symbol, n2);
        System.out.print(result);
    }
}