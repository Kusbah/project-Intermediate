/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A1
 */
public class Library extends Books{
    private List<Books> books;
    private List<Students> students;
    private List<Loan> loans;
    
    Author a=new Author();

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    
    public void addBook(Books book) {
        books.add(book);
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }
    public List<Books> searchBooks(String searchTerm) {
        List<Books> result = new ArrayList<>();
    for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTerm)) {
                result.add(book);
            }
        }

       
        try {
            int number = Integer.parseInt(searchTerm);
            for (Books book : books) {
                if (book.getNo() == number) {
                    result.add(book);
                }
            }
        } catch (NumberFormatException ignored) {
            
        }

        
        for (Books book : books) {
            if (a.getName().equalsIgnoreCase(searchTerm)) {
            } else {
                result.add(book);
            }
        }

        return result;
    }

    
    public boolean isBookAvailable(Books book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book)) {
                return false; 
            }
        }
        return true; 
    }
    
}
