/*
- Method Overloading: ( Related to Compile-Time (Static) Polymorphism )
    - Allow different methods to have the same name,
    - But different signatures -> Signature: Function Name + Parameters List.
    - Where the signature can differ by:
        1. Number of input Parameters.
        2. Type of input Parameters.
        3. Or Both of Them.
*/


public class Main {
    static int sum(int n1, int n2){
        return n1 + n2;
    }

    static float sum(float n1, float n2){
        return n1 + n2;
    }

    static double sum(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }

    // You can overload the Main Function itself
    public static void main(int num){
        System.out.println(num);
    }

    // In the Program Execution -> This Method is executed automatically.
    public static void main(String[] args){
        System.out.println("Sum = " + sum(12, 13));
        System.out.println("Sum = " + sum(1.3f, 1.2f));
        System.out.println("Sum = " + sum(1.3, 1.3, 1.2));

        fun(10);

        // Overloaded Main
        main(120);
    }

    static void fun(){
        System.out.print("fun ");
    }

    static void fun(int x){
        fun();
        System.out.println("X = " + x);
    }
}