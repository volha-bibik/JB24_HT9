package com.company.ht9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <PrintedEditions> shell = new ArrayList<PrintedEditions>();
        shell.add(new Newspaper("Times", 34, 30, 4, true));
        shell.add(new Magazine("Playboy", 40, 50, 5, true));
        shell.add(new ProgrammingBook("Learn Java", 1200, 700, "Some auther", "12+", 2010, "Java", "middle"));
        shell.add(new ScientificBook("New theory", 200, 300, "New auther", "12+", 2015, "math"));

        for (PrintedEditions item: shell){
            item.print();
            System.out.println("");
        }
    }
}
