import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Envelope envelope1 = new Envelope();
        Envelope envelope2 = new Envelope();

        Scanner scanner = new Scanner(System.in);
        String answer = "no";
        do {
                envelope1.height = Envelope.getDouble();
                envelope1.width = Envelope.getDouble();

                envelope2.height = Envelope.getDouble();
                envelope2.width = Envelope.getDouble();

                if (Envelope.compare(envelope1, envelope2)) {
                    System.out.println("The second envelope will contain the first envelope");
                } else {
                    System.out.println("The first envelope will contain the second envelope");
                }

                System.out.println("Do you want to continue?\t y/n");

                //scanner.nextLine();
                answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
