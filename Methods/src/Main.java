public class Main {
    public static void main(String[] args) {
        // method =  a block of code that is executed whenever it is called upon
        // lower case (the first letter of the name)

        String name = "Bro";
        hello(name);
    }

    static void hello(String name){ // add "static" bc we are calling it from the main static psvm
        System.out.println("Hello " + name);
    }
}
