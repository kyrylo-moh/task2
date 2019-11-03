package controller;

import model.Envelope;
import service.Service;
import util.Input;
import util.Output;

import java.util.Scanner;

public class Controller {

    private Service service = new Service();
    private Output output = new Output();
    private Input input = new Input();
    private Envelope envelope1 = new Envelope();
    private Envelope envelope2 = new Envelope();

    private void enterEnvelopes () {
        try {
            envelope1.setHeight(input.getDouble());
            envelope1.setWidth(input.getDouble());
            envelope2.setHeight(input.getDouble());
            envelope2.setWidth(input.getDouble());
        }
        catch (Exception excpt) {
            output.getMsg(excpt.toString());
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            enterEnvelopes();
            if (envelope1.equals(envelope2)) {
                output.getMsg("Envelopes are equals and don`t contain one of one`s");
                service.printEnvelopeParam(envelope1, envelope2);
            }
            else if (service.compare(envelope1, envelope2)) {
                output.getMsg("The first envelope will contain the second envelope");
                service.printEnvelopeParam(envelope1, envelope2);
            } else {
                output.getMsg("The second envelope will contain the first envelope");
                service.printEnvelopeParam(envelope1, envelope2);
            }
            output.getMsg("Do you want to continue?\t y/n");
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
