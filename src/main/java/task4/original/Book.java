package task4.original;

// This is what you get from prompting an AI with exactly:
// "Write a Java program for a simple Library System using OOP.
//  Include classes for Book and Member."
// with no follow-up refinement - kept as-is here for the critique in Task 4.

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public String author;
    public boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}
