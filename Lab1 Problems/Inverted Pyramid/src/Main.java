/*
Display the Pyramid but inverted:
                1 2 3 4 5
                _1 2 3 4
                __1 2 3
                ___1 2
                ____1
 */
public class Main {
    public static void main(String[] args){
        byte n = 5;

        for(int i = n; i >= 1; i--){         // Number of Lines displayed
            for(int k = 1; k <= (n - i); k++){// Spaces Loop
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){      // Numbers itself
                System.out.printf("%d ", k);
            }
            System.out.println();
        }
    }
}