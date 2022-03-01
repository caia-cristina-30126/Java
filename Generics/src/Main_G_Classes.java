import java.util.ArrayList;
import java.util.HashMap;

public class Main_G_Classes {
    public static void main(String[] args) {
        // bounded types = you can create the objects of a generic class to have data of specific derived types, ex: number
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double, Double> mydouble = new MyGenericClass<>(3.14, 1.01);

        //MyGenericClass<Character, Character> myChar = new MyGenericClass<>('#', '&');
        //MyGenericClass<String, Character> myString = new MyGenericClass<>("DHello", '%');

        // ArrayList<String> myFriends = new ArrayList<>();

        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(mydouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());

    }
}
