public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Spiderman", 22, "$$$");
        Hero hero2 = new Hero("Superman", 55, "allUWant");
        System.out.println(hero1.name + " " + hero1.age + " " + hero1.power);
        System.out.println(hero2.toString());
    }
}
