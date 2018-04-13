package com.company.ht9;

public class Magazine extends Periodical {

    private boolean isGlossy;

    public Magazine(String title, int pageCount, int price, int number, boolean isGlossy) {
        super(title, pageCount, price, number);
        this.isGlossy = isGlossy;
    }

    public boolean isGlossy() {
        return isGlossy;
    }

    @Override
    public String toString() {
        return super.toString() + "\tisGlossy=" + isGlossy;
    }
}
