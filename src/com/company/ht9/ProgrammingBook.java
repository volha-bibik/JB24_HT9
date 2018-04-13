package com.company.ht9;

public class ProgrammingBook extends Book {

    private final String genre = "programming";
    private String language;
    private String level;

    public ProgrammingBook(String title, int pageCount, int price, String author, String ageLimit, int publishingYear, String language, String level) {
        super(title, pageCount, price, author, ageLimit, publishingYear);
        this.language = language;
        this.level = level;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + "\tgenre='" + genre + '\'' +
                "\tlanguage='" + language + '\'' +
                "\tlevel='" + level + '\'';
    }
}
