/*
    1. Define Constant Variable -> `final`
    2. Integer Literals can be Binary like 0b110 or Hex-Decimal like 0x1A
    3. Explict Type Casting -> Ex: int z = (int) 5.9;
    4. Loops:-
        1. While Loop
        2. Do...While Loop
        3. For Loop
        4. Enhanced For Loop (For Arrays and Collections)

*/

public class Main{
    public static void main(String[] args){

        // Entry-Controlled Loop -> Check Condition First
//        int i = 10;
//        System.out.print("\nAt the Start of Loop: " + i + "\n");
//        while(i >= 1){
//            System.out.println("Iterator = " + i);
//            --i;
//        }
//        System.out.print("\nAt the End of Loop: " + i);

//        int count = 1;
//        System.out.print("\nAt the Start of Loop: " + count + "\n");
          // Check Count into Condition then Increment it
//        while(count++ <= 5){ // 2 3 4 5 6
//            System.out.println("Hi #" + count);
//        }
//        System.out.print("\nAt the End of Loop: " + count); // 7

        int j = 1;
        System.out.print("\nAt the Start of Loop: " + j + "\n");
        // Increment the counter then Check it into Condition
        while(++j <= 5){ // 2 3 4 5
            System.out.println("Hi #" + j);
        }
        System.out.print("\nAt the End of Loop: " + j); // 6

    }
}