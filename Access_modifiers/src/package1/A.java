package package1;
import package2.*;

public class A {
    // 3. protected = visible to a different class in a different package as long as that class is a subclass of whatever class contains the protected member
    protected String protectedMessage = "This is protected";

    // 1 and 2
   // public static void main(String[] args) {
      // C c = new C();
       // 1. System.out.println(c.defaultMessage);
        // 2. 1. System.out.println(c.publicMessage);
    }
}

