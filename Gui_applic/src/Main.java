import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name"); // only the box
        JOptionPane.showMessageDialog(null, "Hello, " + name); // another box with my message

        // I haven an integer on the left part, but in the right, I m using a string => need to convert
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " + age);

        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " + height);
    }
}
