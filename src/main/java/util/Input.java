package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private Output output = new Output();
    private Validator validator = new Validator();

    public double getDouble() {
        double num;
        output.getMsg("Input number:");
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            if (!validator.numIsPositive(num)) {
                output.getMsg("Your must input number > 0");
                scanner.next();
                num = getDouble();
            }
        } else {
            output.getInstruction();
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
