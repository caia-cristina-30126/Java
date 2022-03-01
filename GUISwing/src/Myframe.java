import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){
    JFrame frame = new JFrame(); // creates a frame
    // we have to set the visibility to true:
    this.setSize(420,420); // sets the x-dimension and y-dimension of my frame
    this.setTitle("Whatever, who cares?"); // sets title of the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
    this.setResizable(false); // prevent frame from being resized

    this.setVisible(true);

    ImageIcon image = new ImageIcon("C:/Users/Cristina-Elena/Desktop/wallpapers/image.jpg");
    this.setIconImage(image.getImage());// change icon of frame
     this.getContentPane().setBackground(new Color(0,0,0));

    }
}
