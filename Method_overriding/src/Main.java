public class Main {
    public static void main(String[] args) {
       // method overriding = declaring a method in sub clss,
        //                  which is already present in parent class;
        //                  Done so that a child class can give its own implementation

        Animal animal = new Animal();
        animal.speak();
        Dog dog = new Dog();
        dog.speak();
    }
}
