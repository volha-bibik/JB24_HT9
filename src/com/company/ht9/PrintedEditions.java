package com.company.ht9;

public class PrintedEditions {
    private String title;
    private int pageCount;
    private int price;

    public PrintedEditions(String title, int pageCount, int price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                "\tpageCount=" + pageCount +
                "\tprice=" + price;
    }
}
