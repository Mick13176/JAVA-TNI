import javax.swing.JOptionPane;

public class LAB302 {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog(null, "Enter your name:");


        String heightInput = JOptionPane.showInputDialog(null, "Enter your height (cm.):");
        double height = Double.parseDouble(heightInput);


        int maleOption = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);

        double weightStd;


        if (maleOption == JOptionPane.YES_OPTION) {


            weightStd = height - 100;

            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Mr. " + name +
                            "\nIf your height is " + height + " cm." +
                            "\nYour weight should be " + weightStd + " kg.");

        } else {

            int femaleOption = JOptionPane.showConfirmDialog(
                    null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);


            if (femaleOption == JOptionPane.YES_OPTION) {


                weightStd = height - 110;

                JOptionPane.showMessageDialog(
                        null,
                        "Hello, Ms. " + name +
                                "\nIf your height is " + height + " cm." +
                                "\nYour weight should be " + weightStd + " kg.");

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}
