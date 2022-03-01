import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
        for(int l=3; l>=0; l--){
            System.out.println(l);
        }

        System.out.println("Happy new year!");

        // nested loop =  a loop inside of a loop
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";
        System.out.println("Enter # of rows");
        rows =scanner.nextInt();
        System.out.println("Enter # of columns");
        columns =scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int a = 1; a<= rows; a++){
            System.out.println();
            for(int b = 1; b<=columns; b++){
                System.out.print(symbol + " ");
            }
        }

    }
}
