package book;

import java.util.Arrays;

public class BookList {

    private Book[] books = new Book[100];
    private int usedsize = 0;

    public BookList() {
        books[0] = new Book("西游记",100,"吴承恩","novel");
        books[1] = new Book("三国演义",200,"罗贯中","novel");
        books[2] = new Book("水浒传",150,"施耐庵","novel");
        this.usedsize = 3;
    }

    public int getUsedsize() {
        return usedsize;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
