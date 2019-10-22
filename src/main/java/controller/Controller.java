package controller;

import model.Envelope;
import service.Service;
import util.Input;
import util.Output;

import java.util.Scanner;

public class Controller {

    private Envelope envelope1 = new Envelope();
    private Envelope envelope2 = new Envelope();

    private void enterEnvelopes () {
        try {
            Scanner scanner = new Scanner(System.in);
            envelope1.setHeight(Input.getDouble());
            envelope1.setWidth(Input.getDouble());
            envelope2.setHeight(Input.getDouble());
            envelope2.setWidth(Input.getDouble());
        }
        catch (Exception excpt) {
            Output.getMsg(excpt.toString());
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            enterEnvelopes();
            if (Service.compare(envelope1, envelope2)) {
                Output.getMsg("The first envelope will contain the second envelope");
            } else {
                Output.getMsg("The second envelope will contain the first envelope");
            }
            Output.getMsg("Do you want to continue?\t y/n");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
