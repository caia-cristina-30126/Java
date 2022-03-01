import java.util.Random;

public class Random_numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1; // generates a no between 0-5

        System.out.println(x);
    }
}
