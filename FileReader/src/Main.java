import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // FileReader = read the contents of a file as a stream of characters. One by one.
    // read() returns an int value which contains the byte value.
    // When read() returns -1, there is no more data to be read.
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:/Users/Cristina-Elena/Desktop/art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
