public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread,String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    void bake(int degree) {
        System.out.println("Time for bake!");
        System.out.println();

        if (degree < 1000) {
            do {
                degree++;
            } while (degree == 1000);
        }
        if (degree == 1000) {
            System.out.println("Perfect temperature!");
        }
    }
}
