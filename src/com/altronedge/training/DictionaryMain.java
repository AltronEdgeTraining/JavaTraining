package com.altronedge.training;


import java.util.Arrays;
import java.util.List;

public class DictionaryMain {

    Integer id;
    String bookName;
    String authorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public static void main(String[] args) {
        DictionaryMain dictionaryMain = new DictionaryMain();
        dictionaryMain.setId(1);
        dictionaryMain.setBookName("Mruntunjay");
        dictionaryMain.setAuthorName("Ajay");

        DictionaryMain dictionaryMain1 = new DictionaryMain();
        dictionaryMain.setId(2);
        dictionaryMain.setBookName("Maharati");
        dictionaryMain.setAuthorName("Pritesh");

        List<DictionaryMain> list = Arrays.asList(dictionaryMain, dictionaryMain1);

        for (DictionaryMain main : list) {
            System.out.println(main.authorName);
        }

    }


}
