public class Car extends Vehicle {

        // object = an instance of a class that may contain atributes and methods;
    // we can reuse the classes to make multiple instances
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2022;
    String color = "blue";
    double price = 5000.00;

    void drive() {
        System.out.println("You drive the car!");
    }
    void brake(){
        System.out.println("Break");
    }

    public String toString(){
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
        // return make + "\n" + model + "\n" + color + "\n" + year;
    }

    @Override
    void go(){
        System.out.println("The car is going...");
    }

}
