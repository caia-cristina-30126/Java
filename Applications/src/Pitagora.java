import java.util.Scanner;

public class Pitagora {
    public static void main(String[] args) {


        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gve me x: ");
        x = scanner.nextDouble();
        System.out.println("Gve me y: ");
        y = scanner.nextDouble();

         z = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is: " + z);
        scanner.close();


    }

}
