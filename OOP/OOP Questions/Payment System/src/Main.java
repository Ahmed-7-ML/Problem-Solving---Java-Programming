/*
A payment system has multiple payment methods
    (Credit Card, PayPal).

Define an abstract class `Payment` with an
    abstract method `processPayment(double amount)`.
Implement it in `CreditCard` and `PayPal` classes.

In `main`, process a payment using each method.
*/

abstract class PaymentSystem{
    String ownerName;
    PaymentSystem(String ownerName){
        this.ownerName = ownerName;
    }

    abstract void processPayment(double amount);
}

// Because of Inheritance -> CreditCard and PayPal Classes can access `ownerName` attribute and override the `processPayment` method

class CreditCard extends PaymentSystem{
    CreditCard(String ownerName){
        super(ownerName);
    }

    @Override
    void processPayment(double amount){
        System.out.println("Owner Name: " + ownerName + " | Amount: $" + amount + " via Credit Card");
    }
}

class PayPal extends PaymentSystem{
    PayPal(String name){
        super(name);
    }

    @Override
    void processPayment(double amount){
        System.out.println("Owner Name: " + ownerName + " | Amount: $" + amount + " via PayPal");
    }
}
public class Main {
    public static void main(String[] args){

        PaymentSystem p1 = new CreditCard("Ahmed Akram");

        PaymentSystem p2 = new PayPal("Shimaa Mohamed");

        p1.processPayment(10390);
        p2.processPayment(13290);

    }
}