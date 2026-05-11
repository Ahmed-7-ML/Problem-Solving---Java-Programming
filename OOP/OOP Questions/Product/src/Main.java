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

    // 1. Default Constructor (No Parameter) -> Java Automatically creates it unless f you don't create it.
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

    // 4. Private Constructor -> Used via Factory Method
    private Product(String name){
        this.name = name;
        this.price = -1;    // Indicates "unlisted" product
    }

    public static Product createUnlistedProduct(String name){
        return new Product(name);
    }


    void display(){
        System.out.println("Product Name: " + name + " | Price $" + price);
    }
}

public class Main {
    public static void main(String[] args){

        // Using default
        Product p1 = new Product();

        // Using parameterized
        Product p2 = new Product("Mobile", 123.11);

        // Using copy
        Product p3 = new Product(p2);

        // Using private
        Product p4 = Product.createUnlistedProduct("I-Pad");

        p1.display();
        p2.display();
        p3.display();
        p4.display();

    }
}

