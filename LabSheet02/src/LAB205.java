import javax.swing.*;

public class LAB205 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("input minute: ");
        int minute = Integer.parseInt(input);
        int hour = minute /60;
        int hourtomin = minute %60;;

        String message = minute + "minutes is "+ hour + "hour" + hourtomin + "minute";
        JOptionPane.showMessageDialog(null,message);
    }
}
