import javax.swing.JOptionPane;

public class Lab505 {


    public static boolean is_palindrome(String word) {
        String text = word.toLowerCase();
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {


        String word = JOptionPane.showInputDialog(
                null,
                "Enter some word:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );


        boolean result = is_palindrome(word);


        if (result) {
            JOptionPane.showMessageDialog(
                    null,
                    word + " is Palindrome",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    word + " is NOT Palindrome",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
