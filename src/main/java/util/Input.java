package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static double getDouble() {
        double num;
        Output.getMsg("Input number:");
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            if (!Validator.numIsPositive(num)) {
                Output.getMsg("Your must input number > 0");
                scanner.next();
                num = getDouble();
            }
        } else {
            Output.getInstruction();
            scanner.next();
            num = getDouble();
        }
        return num;
    }

}
