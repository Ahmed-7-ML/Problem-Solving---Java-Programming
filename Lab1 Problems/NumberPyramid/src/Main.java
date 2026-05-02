/*
Problem24:Number Pyramid Using nested for loops,
    print this pattern for n=5: (Centered Pyramid)
                 ____1
                 ___1 2
                 __1 2 3
                 _1 2 3 4
                 1 2 3 4 5
 */
public class Main {
    public static void main(String[] args){
        byte n = 5;

        for(int i=1; i<=n; i++) {         // Number of Lines printed

            for (int k = (n-i); k >= 1; k--) {     // Space Loop
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {   // The numbers itself
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

    }
}