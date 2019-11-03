package util;

import model.Envelope;

public class Output {

    public void getMsg(String string) {
        System.out.println(string);
    }

    void getInstruction() {
        getMsg("Yuo must enter 4 sides envelopes, numbers must be bigger than 0!");
    }



}
