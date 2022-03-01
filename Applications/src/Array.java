public class Array {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);

        // another way to use an array
        String[] carrs = new String[3];
        carrs[0] = "Audi";
        carrs[1] = "Volvo";
        carrs[2] = "BMW";

        for (int i = 0; i < carrs.length; i++) {
            System.out.println(carrs[i]);
        }

        //2D arrays
        String[][] car = new String[3][3];
        car[0][0] = "Kawasaki";
        car[0][1] = "Mustang";
        car[0][2] = "Lexus";
        car[1][0] = "Lambo";
        car[1][1] = "Tesla";
        car[1][2] = "Ranger";
        car[2][0] = "F-150";
        car[2][1] = "Mus";
        car[2][2] = "Audi";

        for (int x = 0; x < car.length; x++) {
            System.out.println();
            for (int y = 0; y < car[x].length; y++) {
                System.out.print(car[x][y] + " "); // !! NU folosesc println pt ca imi va incepe pe linie noua
            }
        }
    }
}
