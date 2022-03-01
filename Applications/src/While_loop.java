import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String color = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        do{
            System.out.println("Enter your color:");
            color = scanner.nextLine();
        } while (color.isBlank());
        System.out.println("The color is: " + color);
    }
}
