/*
    Problem 11: Logical Gate Simulator Accept three boolean values (true/false) as command line
    arguments. Simulate an AND gate, OR gate, and NOT gate using logical operators. Display the truth
    table results for combinations of these inputs

    --------------------

    A clever tidbit about Boolean.parseBoolean:
        - This Java method is very forgiving;
        - if you write true (in any case, like TrUe), it will return true.
        - Any other text in the universe (like "hello" or "1") will automatically be considered false
            and will not throw an error.
 */

public class Main {
    public static void main(String[] args){
        if(args.length < 3){
            // 1. javac main.java
            // 2. java Main [] [] []
            System.out.println("Usage: java Main <true/false> <true/false> <true/false>");
            return;
        }

        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);

        System.out.println("Inputs: A=" + a + ", B=" + b + ", C=" + c);
        System.out.println("------------------------------------");

        System.out.println("--------- AND Truth Table ---------");
        System.out.println("A && B = " + a + " && " + b + " = " + (a && b));
        System.out.println("A && C = " + a + " && " + c + " = " + (a && c));
        System.out.println("C && B = " + c + " && " + b + " = " + (c && b));

        System.out.println("--------- OR Truth Table ---------");
        System.out.println("A || B = " + a + " || " + b + " = " + (a || b));
        System.out.println("A || C = " + a + " || " + c + " = " + (a || c));
        System.out.println("C || B = " + c + " || " + b + " = " + (c || b));

        System.out.println("--------- NOT Truth Table ---------");
        System.out.println("Not A =  Not " + a + " = " + !a);
        System.out.println("Not A =  Not " + b + " = " + !b);
        System.out.println("Not A =  Not " + c + " = " + !c);

        System.out.println("NAND Gate !(A && B): " + !(a && b));
        System.out.println("Complex Logic (A && B) || C: " + ((a && b) || c));
    }
}