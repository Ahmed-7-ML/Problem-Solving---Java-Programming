/*
Define a `BankAccount` class with fields
    `accountNumber` (String),
    `holderName` (String), and `balance` (double).
Add a method `displayInfo()` that prints all details.
In `main`, create two objects with different values and call `displayInfo()` on each.
*/

class BankAccount{
    // Fields (Data Members) = Attributes
    private String accountNumber;
    private String holderName;
    private  double balance;

    // Constructor
    BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


    // Behaviours (Methods)
    void displayInfo(){
        System.out.println("Account: " + this.accountNumber +
                           " | Holder: " + this.holderName +
                           " | Balance: $" + this.balance);
    }

}

public class Main {
    public static void main(String[] args){

        BankAccount acc1 = new BankAccount("EG-10001", "Ahmed Amer", 100000);
        BankAccount acc2 = new BankAccount("EG-10002", "Shima", 155000);

        acc1.displayInfo();
        acc2.displayInfo();
    }
}