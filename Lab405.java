import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;

        System.out.print("Input some sentence: ");
        sentence = scanner.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sentence = scanner.nextLine();
        }

        String[] words = sentence.split(" ");

        System.out.println();
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
