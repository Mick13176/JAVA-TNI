import java.util.Scanner;

public class LAB204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inout hour :");
        int hour = scanner.nextInt();

        System.out.print("Input minute: ");
        int minute = scanner.nextInt();

        System.out.print("Total time is "+((hour * 60)+ minute)+"minute");
    }
}
