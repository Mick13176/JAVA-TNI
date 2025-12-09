import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
        String studentId;


        while (true) {
            studentId = JOptionPane.showInputDialog(null, "Enter student-id:");

            if (studentId != null && studentId.length() == 10) {
                break;
            }
        }


        String majorCode = studentId.substring(2, 5);

        String major;

        switch (majorCode) {
            case "131":
                major = "Information Technology (IT)";
                break;
            case "132":
                major = "Multimedia Technology (MT)";
                break;
            case "133":
                major = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                major = "Data Science and Data Analytics (DS)";
                break;
            default:
                major = "Cannot found major";
        }


        JOptionPane.showMessageDialog(null,
                "Student ID: " + studentId +
                        "\nMajor: " + major);
    }
}
