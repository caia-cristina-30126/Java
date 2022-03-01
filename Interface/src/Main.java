public class Main {
    public static void main(String[] args) {
        // interface =  a template that can be applied to a class;
        // similar to inheritance, but specifies what a class has/must do.
        // Classes can apply more than one interface, inheritance is limited to 1 super class
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
    System.out.println();
    Hawk hawk = new Hawk();
    hawk.hunt();
    System.out.println();
    Fish fish = new Fish();
    fish.hunt();
    fish.flee();
    }
}
