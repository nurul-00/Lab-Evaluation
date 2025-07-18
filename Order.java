package src;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Book> books;
    private String orderStatus;

    public Order(Customer customer, ArrayList<Book> books) {
        this.customer = customer;
        this.books = new ArrayList<>(books);
        this.orderStatus = "Processing";
    }

    public void placeOrder() {
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Membership Level: " + customer.getMembershipLevel());
        System.out.println("Books in Order:");
        for (Book book : books) {
            System.out.println("  - " + book.getTitle() + " ($" + String.format("%.2f", book.calculateFinalPrice()) + ")");
        }
        System.out.println("Order Total (after membership discount): $" + String.format("%.2f", customer.calculateCartTotal()));
        System.out.println("Order Status: " + orderStatus);
    }

    public void updateStatus(String newStatus) {
        this.orderStatus = newStatus;
        System.out.println("Order status updated to: " + newStatus);
    }
}