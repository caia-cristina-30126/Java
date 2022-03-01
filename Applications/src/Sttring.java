import java.util.Locale;

public class Sttring {
    public static void main(String[] args) {
        String name = "sys";
       boolean res =  name.equals("sys"); // compare method -- case sensitive
        // boolean res = name.equalsIgnoreCase("Sys");
        // methods: name.charAt(0); name.indexOf("y"); name.isEmpty();
        String res2= name.toUpperCase();
        // trim : remove all the spaces before and after the character that I have
        String result = name.replace(name,"bro");
        System.out.println(result);
    }
}
