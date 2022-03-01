import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        // elements can be added and removed after compilation phase store reference data types
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("pasta");
        food.add("hamburger");

        food.set(0, "sushi");
        food.remove(2);
        //food.clear();
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        // 2D array list = you can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> backeryList = new ArrayList();
        backeryList.add("pasta");
        backeryList.add("donuts");
        backeryList.add("garlic bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(backeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList.get(2).get(1));


    }
}
