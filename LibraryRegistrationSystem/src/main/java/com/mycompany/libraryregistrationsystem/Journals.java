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
public class Journals extends Books implements Display{
    private String ConferenceName;
    private int ConferenceNo;

    public Journals() {
    }
    

    public Journals(String ConferenceName, int ConferenceNo, String Title, String Author, int No, String Genre, String version, int date) {
        super(Title, Author, No, Genre, version, date);
        this.ConferenceName = ConferenceName;
        this.ConferenceNo = ConferenceNo;
    }

    public String getConferenceName() {
        return ConferenceName;
    }

    public void setConferenceName(String ConferenceName) {
        this.ConferenceName = ConferenceName;
    }

    public int getConferenceNo() {
        return ConferenceNo;
    }

    public void setConferenceNo(int ConferenceNo) {
        this.ConferenceNo = ConferenceNo;
    }
    @Override
    public boolean inLoan(){
        return false;
    }
    @Override
    public String getInfo(){
        
        return super.getInfo()+ "\n ConferenceName : "+ConferenceName+"\n ConferenceNo : "+ConferenceNo;
    }
}
