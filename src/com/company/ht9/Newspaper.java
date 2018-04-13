package com.company.ht9;

public class Newspaper extends Periodical {
    private boolean isColor;

    public Newspaper(String title, int pageCount, int price, int number, boolean isColor) {
        super(title, pageCount, price, number);
        this.isColor = isColor;
    }

    public boolean isColor() {
        return isColor;
    }

    @Override
    public String toString() {
        return super.toString() + "\tisColor=" + isColor;
    }
}
