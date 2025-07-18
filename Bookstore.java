package src;

public class Bookstore {
    public static void main(String[] args) {
        PrintedBook printedBook1 = new PrintedBook("The Great Adventure", "Jane Doe", 25.50, "978-1234567890", 1.2);
        PrintedBook printedBook2 = new PrintedBook("Mystery of the Old House", "John Smith", 18.00, "978-0987654321", 0.8);
        EBook eBook1 = new EBook("Digital Dreams", "Alice Brown", 12.99, "978-5555555555", 120.0);
        EBook eBook2 = new EBook("Coding Fundamentals", "Bob White", 30.00, "978-1111111111", 75.0);

        Customer regularCustomer = new Customer("Mike Ross", "mike@example.com", "Regular");
        Customer silverCustomer = new Customer("Harvey Specter", "harvey@example.com", "Silver");
        Customer goldCustomer = new Customer("Donna Paulsen", "donna@example.com", "Gold");

        regularCustomer.addToCart(printedBook1);
        regularCustomer.addToCart(eBook2);
        System.out.println("Mike's Cart Total: $" + String.format("%.2f", regularCustomer.calculateCartTotal()));
        Order orderMike = new Order(regularCustomer, regularCustomer.getCart());
        orderMike.placeOrder();

        silverCustomer.addToCart(printedBook2);
        silverCustomer.addToCart(eBook1);
        System.out.println("Harvey's Cart Total: $" + String.format("%.2f", silverCustomer.calculateCartTotal()));
        Order orderHarvey = new Order(silverCustomer, silverCustomer.getCart());
        orderHarvey.placeOrder();
        orderHarvey.updateStatus("Shipped");

        goldCustomer.addToCart(printedBook1);
        goldCustomer.addToCart(eBook1);
        goldCustomer.addToCart(printedBook2);
        System.out.println("Donna's Cart Total: $" + String.format("%.2f", goldCustomer.calculateCartTotal()));
        Order orderDonna = new Order(goldCustomer, goldCustomer.getCart());
        orderDonna.placeOrder();
        orderDonna.updateStatus("Delivered");
    }
}