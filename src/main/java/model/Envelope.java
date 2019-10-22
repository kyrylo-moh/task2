package model;

import java.util.Scanner;

public class Envelope implements Comparable<Envelope> {

    private double width;
    private double height;

    public Envelope(){}

    public Envelope(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int compareTo(Envelope object) {
        if (this.getHeight() > object.getHeight()) {
            if (this.getWidth() > object.getWidth()) {
                return 1;
            }
        }
        return -1;
    }

    private double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
