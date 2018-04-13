package com.company.ht9;

public class Book extends PrintedEditions {
    private String author;
    private String ageLimit;
    private int publishingYear;

    public Book(String title, int pageCount, int price, String author, String ageLimit, int publishingYear) {
        super(title, pageCount, price);
        this.author = author;
        this.ageLimit = ageLimit;
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    @Override
    public String toString() {
        return super.toString() + "\tauthor='" + author + '\'' +
                "\tageLimit='" + ageLimit + '\'' +
                "\tpublishingYear=" + publishingYear;
    }
}
