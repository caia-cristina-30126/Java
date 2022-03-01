import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
       // SERIALIZATION = the process of converting an object into a byte stream
        //  - persists (saves the state) the object after program exists
        // - this byte stream can be saved as a file or sent over a network
        // - can be sent to a different machine
        // byte stream can be saved as a file (.ser) which is platform independent platform
        // ( think of this as if you're saving a file with the onject's information)

        // DESERIALIZATION = the reverse process of converting a byte stream into an object
        // ( think of it as if you're loading a saved file)

    User user = new User();

    user.name ="Bro";
    user.password = "1234";

    FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(user);
    out.close();
    fileOut.close();

    System.out.println("object info saved");
    }
}
