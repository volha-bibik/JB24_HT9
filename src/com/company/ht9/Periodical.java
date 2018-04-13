package com.company.ht9;

public class Periodical extends PrintedEditions {

    private int number;

    public Periodical(String title, int pageCount, int price, int number) {
        super(title, pageCount, price);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString() + "\tnumber=" + number;
    }
}
