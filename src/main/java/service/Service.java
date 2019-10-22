package service;

import model.Envelope;

public class Service {

    public static boolean compare (Envelope envelope1, Envelope envelope2) {
        if(envelope1.compareTo(envelope2) == 1){
            return true;
        }
        return false;
    }

}
