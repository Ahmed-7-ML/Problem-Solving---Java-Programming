/*
    Problem 3: Temperature Converter Write a program to convert Celsius to Fahrenheit using the
    formula: F = (C × 9/5) + 32. Accept temperature as a command line argument. Use
    Double.parseDouble() to convert the argument.
*/
public class Main {
    public static void main(String[] args){ // Command Line Argument
        // Must be Run from the CMD or Terminal (Alt + F12)
        // Commands:-
        // 1. javac Main.java
        // 2. java Main [Value]
        // e.g. java Main 25

        // args[0] : First value the user enters it after file name

        double celius = Double.parseDouble(args[0]);

        double fahrenheit = (celius * 9 / 5.0) + 32;

        System.out.println("Temperature(C) = " + celius);
        System.out.println("Temperature(F) = " + fahrenheit );
    }
}