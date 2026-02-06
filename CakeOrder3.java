import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {

        String poundsInput = JOptionPane.showInputDialog(null, "How many pounds do you want?", "Input", JOptionPane.QUESTION_MESSAGE);
        if (poundsInput == null) return;
        double pounds = Double.parseDouble(poundsInput);
        String flavor = JOptionPane.showInputDialog(null, "Enter a flavor birthday cake:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (flavor == null) return;
        String message = JOptionPane.showInputDialog(null, "Enter a message on cake:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (message == null) return;
        BirthdayCake order = new BirthdayCake(message, pounds, flavor, 400.0);


        while (true) {
            String info = order.toString() + "\n\nConfirm this order?";
            int result = JOptionPane.showConfirmDialog(null, info, "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

            if (result == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(null, order.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (result == JOptionPane.NO_OPTION || result == JOptionPane.CANCEL_OPTION) {

                String newMessage = JOptionPane.showInputDialog(null, "Enter a new message for changing:", "Input", JOptionPane.QUESTION_MESSAGE);

                if (newMessage != null) {
                    order.changMessage(newMessage);
                }
            } else {
                break;
            }
        }
    }
}