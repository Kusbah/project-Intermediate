/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libraryregistrationsystem;
import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author A1
 */
public class LibrarySystem {
    private static Library library;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Books Book = new Books();
       
        library = new Library();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    // Add a book
                    addBook(scanner);
                    break;
                case 2:
                    // Search for books
                    searchBooks(scanner);
                    break;
                case 3:
                    // Check book loans
                    checkBookLoans(scanner);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nLibrary Management System Menu:");
        System.out.println("1. Add a Book");
        System.out.println("2. Search for Books");
        System.out.println("3. Check Book Loans");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            // Consume the invalid input
            scanner.next();
            return -1; // Return an invalid choice
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.println("Adding a book. Enter book title:");
        String title = scanner.next();
        library.addBook(new Book(title, new Author(1, "Author1", "Address1", new Date()), 1, "Genre1", "Version1", new Date()));
        System.out.println("Book added successfully.");
    }

     private static void searchBooks(Scanner scanner) {
        System.out.println("Searching for books. Enter search term:");
        String searchTerm = scanner.next();

        List<Books> foundBooks = library.searchBooks(searchTerm);

        if (!foundBooks.isEmpty()) {
            System.out.println("Found Books:");
            for (Books foundBook : foundBooks) {
                System.out.println(foundBook.getInfo());
            }
        } else {
            System.out.println("No books found.");
        }
     }

    private static void checkBookLoans(Scanner scanner) {
        System.out.println("Checking book loans. Enter book title:");
        String title = scanner.next();

        Books bookToCheck = new Library.searchBooks(title);

        if (bookToCheck != null) {
            List<Loan> loansForBook = new Library.isBookAvailable();

            if (!loansForBook.isEmpty()) {
                System.out.println("Loans for the Book:");
                for (Loan loan : loansForBook) {
                    System.out.println(loan.getInfo());
                }
            } else {
                System.out.println("No loans found for the book.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}

        
        
    
    

