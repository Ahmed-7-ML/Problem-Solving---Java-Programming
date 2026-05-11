/*
    1. `Private` Access Modifier:
        - Uses keyword `private`
        - `Class-Private` -> Means that the methods and data members are accessible only within the class.

    2. `Default` Access Modifier:
        - Show the compile-time error when we try to access a default modifier class from a different package.
        - Members with default access cannot be accessed from classes in a different package.
        - Does not use any keyword.
        - `Package-Private` - > Means that the methods and data members are accessible only within the same package.

    3. `Protected` Access Modifier:
        - Accessible within the same package or subclasses in different packages.
        - Uses `protected` keyword.

    4. `Public` Access Modifier:
        - Uses `public` keyword.
        - Accessible from everywhere in the program.
        - There is no restriction on the scope of public data members.


    Notes: Top-Level Class or Interface cannot be declared as private -> As it means that it is only visible within the enclosing class.
 */

package p1;

class Person{

    // Private Data Member
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Car{
    // By default -> it is Default Access
    String model;
}

class MathUtils{
    public int add(int a, int b){
        return a + b;
    }
}



public class Main {
    public static void main(String[] args){

        // Private
        Person p1 = new Person();
        p1.setName("Ahmed");
        System.out.println("Name: " + p1.getName());

        // Default
        Car c1 = new Car();
        c1.model = "Tesla" ;    // Accessible only within the same package.
        System.out.println(c1.model);

        // Public
        MathUtils m = new MathUtils();
        System.out.println(m.add(2, 3));
    }
}