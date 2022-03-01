public class Main {
    public static void main(String[] args) {
        // =  multimple cinstructors within a class with the same name, but have diff parameters
        //  name + parameteres = signature
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozarella", "pepperoni");

        System.out.println("Here are the ingredients for each pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println();
        Pizza pizza1 = new Pizza("cereals", "pesto");
        System.out.println("The ingredients for pizza1 are less, I mean: " + pizza1.bread + " " + pizza1.sauce);
        pizza.bake(1000);
    }
}
