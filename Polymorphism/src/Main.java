public class Main {
    public static void main(String[] args) {
        // = the ability of an object to identify as more than one type
        Car car = new Car();
        Bike bike = new Bike();

        Vehicle[] racers = {car, bike};

        for(Vehicle x: racers){
            x.go();
        }
    }
}
