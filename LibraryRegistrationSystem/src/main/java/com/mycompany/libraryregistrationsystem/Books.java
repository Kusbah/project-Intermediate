/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

/**
 *
 * @author A1
 */
public class Books implements Display{
    private String  Title;
    private String Author;
    private int No;
    private String Genre;
    private String version;
    private int date;

    public Books() {
    }

    public Books(String Title) {
        this.Title = Title;
    }
    

    public Books(String Title, String Author, int No, String Genre, String version, int date) {
        this.Title = Title;
        this.Author = Author;
        this.No = No;
        this.Genre = Genre;
        this.version = version;
        this.date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @Override
    public boolean inLoan(){
        return false;
    }
    @Override
    public String getInfo(){
        return "Title : " + Title +"\n Author : " + Author + "\n Number : " + No+"\n Genre : "+ Genre+ "\n version : "+version+"\n date : "+date;
    }
}
