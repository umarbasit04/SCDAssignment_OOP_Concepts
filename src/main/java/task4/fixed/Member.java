package task4.fixed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Task 4 fix: name and borrowedBooks are now private. getBorrowedBooks()
 * returns an unmodifiable view, so callers can look but not directly add
 * or remove entries - all borrowing/returning must go through
 * borrowBook()/returnBook(), which keeps Book.issued and this list in sync.
 */
public class Member {

    private final String name;
    private final List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return Collections.unmodifiableList(borrowedBooks);
    }

    public boolean borrowBook(Book book) {
        if (book.isIssued()) {
            return false; // already out - can't double-issue it
        }
        book.markIssued();
        borrowedBooks.add(book);
        return true;
    }

    public boolean returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            return false; // this member never had this book
        }
        book.markReturned();
        borrowedBooks.remove(book);
        return true;
    }
}
