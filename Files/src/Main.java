import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // file = an abstract representation of file and directory pathnames

        File file = new File("C:/Users/Cristina-Elena/Desktop/file_message.txt");
        if(file.exists()){
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else{
            System.out.println("That file doesn't exists!");
        }
        try {
            FileWriter writer = new FileWriter("C:/Users/Cristina-Elena/Desktop/file_message.txt");
            writer.write("Roses are red \n Violets are blue \n lala lala lala hehe\n Rocking everywhere");
            writer.append("\n(A poem by Bro!");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
