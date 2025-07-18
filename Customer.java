package src;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private String membershipLevel;
    private ArrayList<Book> cart;

    public Customer(String name, String email, String membershipLevel) {
        this.name = name;
        this.email = email;
        this.membershipLevel = membershipLevel;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Book book) {
        this.cart.add(book);
        System.out.println(book.getTitle() + " added to " + name + "'s cart.");
    }

    public double calculateCartTotal() {
        double total = 0.0;
        for (Book book : cart) {
            total += book.calculateFinalPrice();
        }
        switch (membershipLevel) {
            case "Silver":
                total *= 0.95;
                break;
            case "Gold":
                total *= 0.90;
                break;
            case "Regular":
            default:
                break;
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public ArrayList<Book> getCart() {
        return cart;
    }
}