/*
 Syntax:- (Prototype)
    [Return Value Type] [Method Name] (Parameters){     <---- Prototype(Declaration)

        [Body of the Function]

    }

    *** If you use any return type other than (void) -> you must use return statement.

  Calling(Invoking): [As the Function is implemented only when calling]
        [Method Name](Arguments);

 Benefits of Methods:-
    1. Reusability.
 */

public class Main {
    public static void displayName(String name){
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args){

        displayName("Ahmed");

        double sum = Add(10.0, 20.0);
        System.out.println("Summation = " + sum);

    }

    public static double Add(double n1, double n2){
        return  n1 + n2;
    }
}