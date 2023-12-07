/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author A1
 */
class Loan extends Books implements Display{

    Students student;
    Books book;
    Date dueDate;

    public Loan(Students student, Books book, Date dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;

    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    private LocalDate calculateDueDate() {
        
        LocalDate currentDate = LocalDate.now();

        
        return currentDate.plus(5, ChronoUnit.DAYS);
    }

    
    public boolean isOverdue() {
        
        LocalDate currentDate = LocalDate.now();
        LocalDate dueLocalDate = dueDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return currentDate.isAfter(dueLocalDate);
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }

}
