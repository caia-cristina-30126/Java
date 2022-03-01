package package2;
import package1.*;

 public class C {

    // 1. no-access modifier = we can have access to it because they are within the same package / visible only in the same package, different class
     String defaultMessage = "This is the default";

    // 2. public modifier = visible in any package within the project folder, if the class is public
    public String publicMessage = "This is public";

    // 4. private = visible to only in the class that it containts itself
    private String privateMessage = "This is private";

}
