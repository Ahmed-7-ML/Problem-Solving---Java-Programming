/*
8. Create a `Product` class with all 4 constructor types:
    (1) default sets name="Unknown", price=0,
    (2) parameterized takes name and price,
    (3) copy constructor copies another product,
    (4) private constructor
  shown via a static factory method.

Demonstrate each in `main`.
*/

// IDEA: Method Overloading

class Product{
    private String name;
    private double price;

    // 1. Default Constructor (No Parameter)
    Product(){
        this.name = "Unknown";
        this.price = 0;
    }

    // 2. Parameterized Constructor
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // 3. Copy Constructor to copy another product
    Product(Product other){
        this.name = other.name;
        this.price = other.price;
    }

    // 4. Private Constructor
    Product(){

    }

}

public class Main {
    public static void main(String[] args){

    }
}

