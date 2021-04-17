package book;

public class Book {

    private String name;
    private double price;
    private String author;
    private String type;
    private boolean isBorrow;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    public Book(String name, double price, String author, String type) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
