import javax.swing.JOptionPane;

public class Lab501 {


    public static double cal_bmi(double weight, double height_cm) {
        double height_m = height_cm / 100;
        return weight / (height_m * height_m);
    }


    public static String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Healthy Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        while (true) {
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION
            );


            if (confirm == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "END PROGRAM!!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
                break;
            }


            String weightStr = JOptionPane.showInputDialog(
                    null,
                    "Enter your weight (kg.)",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            String heightStr = JOptionPane.showInputDialog(
                    null,
                    "Enter your height (cm.)",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);

            double bmi = cal_bmi(weight, height);
            String result = check_bmi(bmi);

            JOptionPane.showMessageDialog(
                    null,
                    String.format("Your BMI = %.2f\nYour BMI result = %s", bmi, result),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}

