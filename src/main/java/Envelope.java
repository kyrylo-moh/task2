import java.util.Scanner;

public class Envelope {
    static Scanner scanner = new Scanner(System.in);
    double width;
    double height;

    public Envelope(){}

    public Envelope(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static boolean compare(Envelope e1, Envelope e2) {
        return e1.width * e1.height < e2.width * e2.height;
    }

    public static double getDouble() {
        double num;
        System.out.println("Input number:");
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            if (num <= 0) {
                System.out.println("Your must input number > 0");
                scanner.next();
                num = getDouble();
            }
        } else {
            System.out.println("Your input number is incorrect, try again!");
            scanner.next();//recursion
            num = getDouble();
        }
        return num;
    }
}
