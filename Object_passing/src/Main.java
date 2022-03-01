public class Main {
    public static void main(String[] args) {
        // you can pass objects as arguments to the method
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Bycicle bike = new Bycicle();

        garage.park(car);
        System.out.println();
        bike.cross(car);
    }
}
