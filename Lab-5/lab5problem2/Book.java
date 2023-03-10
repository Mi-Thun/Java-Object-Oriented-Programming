package lab5problem2;

public class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPage;
    private static int count = 0;

    public Book() {
        count++;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public Book(int ISBN, String bookTitle, int numberOfPage) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPage = numberOfPage;
        count++;
    }

    public String toString() {
        return "ISBN = "+ ISBN + " " + "Book Tittle = "+ bookTitle +" "+
                "Number of page = "+numberOfPage;
    }

    int compareTo(Book newBook) {
        return 0;
    }

    static int getCount() {
        return count;
    }

    int getNumberOfPage() {
        return numberOfPage;
    }

}

