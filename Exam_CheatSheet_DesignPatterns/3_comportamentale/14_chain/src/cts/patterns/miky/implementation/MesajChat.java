package cts.patterns.miky.implementation;

public class MesajChat {
    String text;
    int prioritate;
    String destinatar;

    public MesajChat(String text, int prioritate, String destinatar) {
        this.text = text;
        this.prioritate = prioritate;
        this.destinatar = destinatar;
    }

    public String getText() {
        return text;
    }

    public int getPrioritate() {
        return prioritate;
    }

    public String getDestinatar() {
        return destinatar;
    }
}
