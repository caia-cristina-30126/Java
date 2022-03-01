import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI windows to add components to
      /*  JFrame frame = new JFrame(); // creates a frame
        // we have to set the visibility to true:
        frame.setSize(420,420); // sets the x-dimension and y-dimension of my frame
        frame.setTitle("Whatever, who cares?"); // sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setResizable(false); // prevent frame from being resized

        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:/Users/Cristina-Elena/Desktop/wallpapers/image.jpg");
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0,0,0));
*/
        //Myframe myFrame = new Myframe();


        /*
        // Jlabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("C:/Users/Cristina-Elena/Desktop/wallpapers/image.jpg");
        JLabel label = new JLabel(); // create a label
        label.setText("Do u even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set the text where u want
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set font of text

        JFrame frame = new JFrame(); // creates a frame
        // we have to set the visibility to true:
        frame.setSize(700,700); // sets the x-dimension and y-dimension of my frame
        frame.setTitle("Whatever, who cares?"); // sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setResizable(true); // prevent frame from being resized
        frame.setVisible(true);
        frame.add(label); // add the label to my frame
*/

         // JPannel = a GUI component that functions as a container to hold other components

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setTitle("Whatever, who cares?");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setVisible(true);
        frame.add(redpanel);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(240,0,250,250);
        frame.add(bluepanel);

        JPanel yellowpanel = new JPanel();
        yellowpanel.setBackground(Color.yellow);
        yellowpanel.setBounds(480,0,250,250);
        frame.add(yellowpanel);

    }
}
