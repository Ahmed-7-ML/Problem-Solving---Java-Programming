import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
         Branching Statements:-
            1. break statement    -> (Un-Labeled Break) Causes immediate exit from the control structure (Switch...Case / Loops)
            2. continue statement -> Causes skipping the current iteration of the Loop.
        */
//        for(int i =0; i < 10; i ++){
//            if( i == 4 )
//                break;
//            if( i > 2 )
//                continue;
//            System.out.println("i = " + i);
//        }

        Scanner input = new Scanner(System.in);

        System.out.println("Test yourself: ");
        System.out.print("What is the result of :- '5 + 10 / 2 * 10 = ? '");
        float userAnswer, correctAnswer=55;
        boolean questionAnswer = false;

        for(int i =1; i <=3; i++){
            userAnswer = input.nextInt();
            if(userAnswer == correctAnswer){
                questionAnswer = true;
                break;
            }
            else {
                if(i == 3)
                    continue;

                System.out.print("Chance #" + (i + 1) + " : ");
            }
        }

        if(questionAnswer){
            System.out.println("Correct Answer.");
        }
        else{
            System.out.println("Wrong Answer.");
        }






    }
}