import java.util.Scanner;

public class CakeOrder2 {

    static Scanner sc = new Scanner(System.in);

    public static String selectFlavor() {
        int choice = 0;

        while (true) {
            System.out.println("Press 1 for Chocolate");
            System.out.println("Press 2 for Vanilla");
            System.out.println("Press 3 for Strawberry");
            System.out.println("Press 4 for Lemon");
            System.out.println("Press 5 for Red Velvet");
            System.out.print("Enter a flavor number: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();

                System.out.println();

                switch (choice) {
                    case 1: return "Chocolate";
                    case 2: return "Vanilla";
                    case 3: return "Strawberry";
                    case 4: return "Lemon";
                    case 5: return "Red Velvet";
                    default:

                        System.out.println("Invalid flavor! Please try again.\n");
                }
            } else {
                sc.nextLine();
                System.out.println("Please enter a number.\n");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.print("Enter an option: ");

        if (sc.hasNextInt()) {
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println();

            String flavor;

            if (option == 1) {

                flavor = selectFlavor();


                System.out.print("Enter a message: ");
                String message = sc.nextLine();

                System.out.print("How many pounds: ");
                double pounds = sc.nextDouble();

                System.out.println();

                BirthdayCake order1 = new BirthdayCake(message, pounds, flavor, 350.0);
                System.out.println(order1.toString());

            } else if (option == 2) {

                flavor = selectFlavor();

                System.out.print("How many pieces: ");
                int pieces = sc.nextInt();


                System.out.println();

                CupCake order2 = new CupCake(pieces, flavor, 70.0);
                System.out.println(order2.toString());

            } else {
                System.out.println("Wrong option!! Try again!!");
            }
        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}