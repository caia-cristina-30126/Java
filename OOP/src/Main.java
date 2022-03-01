public class Main {
    public static void main(String[] args) {

        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //           abstract methods are declared without an implementation

    Car myCar = new Car(); // 1st instance of the class
    Car myCar1 = new Car(); // 2nd instance of the same class
        System.out.println(myCar.model);

        myCar.drive();;
        System.out.println();
        myCar.brake();

        // toString() = special method that all object inherit,
        //              that returns a string that "textually represent" an object.
        //              can be used both implicitly and explicitly
        System.out.println();
        Car car2 = new Car();
       // System.out.println(car2.toString()); // used explicitly
        System.out.println(car2); // used implicitly
        System.out.println();
        myCar.go();

    }
}
