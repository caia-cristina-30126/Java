public class Main {
    public static void main(String[] args) {

        // encapsulation = attributes of a class will be hidden or private,
        //                  can be accessed only through methods ( getters & setters)
        //                  obs: I should make attributes private if I don't have a reason mo make them public

        Car car1 = new Car("BMW", "Whatever", 2002);
        //Car car2 = new Car("Audi", "same", 2021);

        Car car2 = new Car(car1);
        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }


}
