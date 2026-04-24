public class Main {
    public static void main(String[] args){
        // Nested Loops : Loop(Inner) inside another Loop (Outer)
        // Any type of Loop inside any type of Loop (for, while, do...while)

        // Each iteration of outer loop will have 5 iterations inside it from inner loop.
//        for(int i = 0; i < 3; i++){     // 3 Iterations
//            System.out.println("Outer Loop " + i);
//
//            for(int j = 0; j < 5; j++){ // 5 Iterations
//                // Iterator Variable here != i as we defined it in outer loop
//                System.out.println("  | Inner Loop " + j);
//            }
//        }

        // Each iteration of outer loop will have 5 iterations inside it from inner loop
        // and for each if 5 iterations will have 3 iterations inside it.
        for(int i = 0; i < 3; i++){     // 3 Iterations
            System.out.println("Outer Loop " + i);

            for(int j = 0; j < 5; j++){ // 5 Iterations
                // Iterator Variable here != i as we defined it in outer loop
                System.out.println("  | Inner Loop " + j + ", i = " + i);

                for(int k=0; k<=2; k++){ // 3 Iterations
                    System.out.println("       | Inner Loop2 " + k + ", j = " + j + ", i = " + i);
                }
            }
        }

    }
}