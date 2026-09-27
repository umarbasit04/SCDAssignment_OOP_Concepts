package task4.fixed;

/**
 * Task 4 fix: Book's fields are now private. The only way isIssued can
 * change is through the controlled methods markIssued()/markReturned(),
 * which only Member (via borrowBook/returnBook) should call - external
 * code can no longer flip isIssued directly and desync it from
 * Member.borrowedBooks.
 */
public class Book {

    private final String title;
    private final String author;
    private boolean issued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    void markIssued() {
        issued = true;
    }

    void markReturned() {
        issued = false;
    }
}
