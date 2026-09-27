package task4.original;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    public List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (!book.isIssued) {
            book.isIssued = true;
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        book.isIssued = false;
        borrowedBooks.remove(book);
    }
}
