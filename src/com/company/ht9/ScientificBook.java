package com.company.ht9;

public class ScientificBook extends Book {

    private final String genre = "scientific";
    private String scienceSection;

    public ScientificBook(String title, int pageCount, int price, String author, String ageLimit, int publishingYear, String scienceSection) {
        super(title, pageCount, price, author, ageLimit, publishingYear);
        this.scienceSection = scienceSection;
    }

    public String getGenre() {
        return genre;
    }

    public String getScienceSection() {
        return scienceSection;
    }

    @Override
    public String toString() {
        return super.toString() + "\tgenre='" + genre + '\'' +
                "\tscienceSection='" + scienceSection + '\'';
    }
}
