package src;

public abstract class Book {
    private String title;
    private String author;
    private double price;
    private String ISBN;

    public Book(String title, String author, double price, String ISBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    public abstract double calculateFinalPrice();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Base Price: $" + String.format("%.2f", price));
    }
}