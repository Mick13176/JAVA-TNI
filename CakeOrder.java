import java.util.Scanner;

public class CakeOrder {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();


        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);


        System.out.println(order1);


        System.out.println("Cup Cake's Details: ");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();


        CupCake order2 = new CupCake(piece, cup_flavor, 65);

        System.out.println(order2);


        System.out.println("Total price = " + (order1.getUnitPrice()*pound + order2.getUnitPrice()*piece
        ));


        System.out.println("Shiopan Details:" );
        System.out.print("Enter a flavor : ");
        String ShiopanFlavor = scanner.next();

        System.out.print("How many Shiopan: ");
        int qty = scanner.nextInt();

        System.out.print("Is premium? (true/false) : ");
        boolean premium = scanner.nextBoolean();


        Shiopan order3 = new  Shiopan(qty, premium,ShiopanFlavor, 55);


        System.out.println(order3);
        System.out.println("Total price = " + (order1.getUnitPrice()*pound + order2.getUnitPrice()*piece + order3.getUnitPrice()*piece
        ));
    }

}

