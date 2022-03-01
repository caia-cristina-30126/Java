
import java.util.Scanner;

public class Citire_tastatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine(); // type in the console window

        System.out.println("How old are u?");
        int age = scanner.nextInt(); // for numbers
        scanner.nextLine();
        System.out.println("Your fav food?");
        String food  = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("you are " + age);
        System.out.println("u like " + food);


    }
}

