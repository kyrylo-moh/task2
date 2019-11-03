package service;

import model.Envelope;

public class Service {

    public boolean compare(Envelope envelope1, Envelope envelope2) {
        return envelope1.compareTo(envelope2) == 1;
    }

    public void printEnvelopeParam(Envelope envelope1, Envelope envelope2) {
        System.out.println("1.\t Height: \t" + envelope1.getHeight() + "\n\t Width: \t" + envelope1.getWidth() +
                "\n2.\t Height: \t" + envelope2.getHeight() + "\n\t Width: \t" + envelope2.getWidth());
    }

}
