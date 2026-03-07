import javax.swing.JOptionPane;

public class Lab105 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;


        String message = "Summation number = " + (a + b) + "\n"
                + "Subtraction number = " + (a - b) + "\n"
                + "Multiplication number = " + (a * b) + "\n"
                + "Division number = " + ((double)a / b) + "\n"
                + "Modulus number = " + (a % b);

        JOptionPane.showMessageDialog(null, message, "Arithmetic Operators", JOptionPane.WARNING_MESSAGE);
    }
}