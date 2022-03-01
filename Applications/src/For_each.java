import java.util.ArrayList;

public class For_each {
    public static void main(String[] args) {
        // traversing technique to iterate yhe elements in an array/collection
       // String[] animals = {"cat","dog","rat","bird"}; // array
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        for(String i: animals) {
            System.out.println(i);
        }
    }
}
