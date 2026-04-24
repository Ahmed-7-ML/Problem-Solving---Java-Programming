/*
   for(Initialization ; Condition Check ; Step){
        // Block of Code
   }

*/

public class For {
    public static void main(String[] args){

        // Entry-Controlled Loop
        // Used when we know the number of iterations
        for(int i = 0; i<= 5; i++){
            // i variable here is local only to for loop
            System.out.println("Hi #"+i);
        }
        //  System.out.println(i);  // java: cannot find symbol
        // To Solve this problem -> Declare variable i outside the loop.
    }
}
