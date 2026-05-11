package p2;

import p1.Vehicle;

public class Bike extends Vehicle{
    // Bike is a subclass and Vehicle is a superclass

    void showSpeed(){
        speed = 100;    // Sub Class in different package
        System.out.println(speed);
    }
}
