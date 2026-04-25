/*
-> Methods:-
    - Block of Code that performs a specific task.
    - You write a piece of code logic once and reuse it whenever needed in the program.
    - All Methods in java must belong to class.
    - Like Functions and Expose the Behavior of Object.

    -> Difference between Function and Methods:
        - The both are the same ,but differences in where you write them
            1. Functions -> Block of Code that not belongs to a class.
            2. Methods   -> Function but within the class.

     -> Jave is Object-Oriented and Stack based programming language
        - So there is no functions here only methods -> As you write your program inside this class:
            public class Main{...}
        - public static main(String[] args) : Starting Point of Running Program is also a Method.

-> Syntax:- (Prototype)
    [Access Modifier] [static/..] [Return Value Type] [Method Name] (Parameter List){     <---- Prototype(Declaration)

        [Body of the Function]

    }
    *** If you use any return type other than (void) -> you must use return statement.
-> Key Components:
    1. Access Modifier [Public, Protected, Default, Private]
    2. Return Type / Void
    3. Method Name
    4. Parameters (Optional Inputs)
    5. Body (Code Block)

-> Calling(Invoking): [As the Function is implemented only when calling]
        [Method Name](Argument List);

        - Java use its internal structure [Call Stack] to manage execution, variables and return addresses.
        - Call Stack: Data structure used by the program during runtime to manage method calls and
                      local variables.
                      It operates in a Last-In-First-Out (LIFO) manner, meaning the last method
                      called is the first one to complete and exit.


     -> Difference between Arguments and Parameters:-
        1. Parameters: The Placeholders that you define them in method prototype.
        2. Arguments:  The actual values that you put them in method invoking.

     -> Difference between static and not static (instance)method:-
        1. static method: Tou don't need to instantiate an object from the class and you can use the method directly.
        2. not static method:  You must instantiate an object from the class & The Object then can access attributes and methods.

-> Benefits of Methods:-
    1. Reusability -> Write once, use multiple times by calling without repeating the code.
    2. Increase Code Readability, Efficiency and Organization.
    3. Modularity -> Dividing program into separate methods , allow each method to handle specific task.
    4. Maintainability -> As it is Modular Program, you can easily fix bugs or update code.
    4. Single Responsibility Principle -> The method is responsible about only 1 task.

 */

public class Main {
    // Static Method
    public static void displayName(String name){
        System.out.println("Hello, " + name);
    }

    // Non-Static Method -> You must define an object.
    public int Add(int n1, int n2){
        return n1 + n2;
    }

    public static void main(String[] args){

        displayName("Ahmed");

        double sum = Add(10.0, 20.0);
        System.out.println("Summation = " + sum);

        float sum1 = Add(10.0f, 20.0f);
        System.out.println("Summation = " + sum1);

        Main object = new Main();
        int res = object.Add(3, 5);
        System.out.println(res);

        /*
        -> 2 Methods with the same name but with different parameters -> different signature.
        */

    }

    // Static Method -> You don't need any objects.
    public static double Add(double n1, double n2){
        return  n1 + n2;
    }

    public static float Add(float n1, float n2){
        return  n1 + n2;
    }
}