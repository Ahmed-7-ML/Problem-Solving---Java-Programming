/*
A `Shipping` class calculates shipping cost.
Overload the `calculateCost` method:
    (1) takes weight only,
    (2) takes weight and distance,
    (3) takes weight, distance, and boolean for express shipping.
*/

// Method Overloading
class Shipping{
    float calculateCost(float weight){
        return weight * 2.5f;
    }

    float calculateCost(float weight, float distance){
        return weight * 2.5f + distance * 0.1f;
    }

    float calculateCost(float weight, float distance, boolean express){
        float baseCost = weight * 2.5f + distance * 0.1f;
        return express ? (baseCost * 1.5f) : baseCost;
    }
}


public class Main {
    public static void main(String[] args){

        Shipping s1 = new Shipping();
        System.out.println("Cost (Weight only) = $" + s1.calculateCost(1213.32f));

        System.out.println("Cost (Weight + Distance) = $" + s1.calculateCost(1213.32f, 12.32f));
        System.out.println("Cost (Express Shipping)= $" + s1.calculateCost(1213.32f, 12.32f, true));


    }
}