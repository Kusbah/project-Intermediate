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
public class Magazines extends Books implements Display{
    private int issueNo;
    private int releaseDate;

    public Magazines() {
    }

    

    public Magazines(int issueNo, int releaseDate, String Title, String Author, int No, String Genre, String version, int date) {
        super(Title, Author, No, Genre, version, date);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public boolean inLoan(){
        return false;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\n issueNo"+ issueNo+"\n releaseDate"+releaseDate;
    }
}
