package src;

public class PrintedBook extends Book {
    private double shippingWeight;

    public PrintedBook(String title, String author, double price, String ISBN, double shippingWeight) {
        super(title, author, price, ISBN);
        this.shippingWeight = shippingWeight;
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = getPrice();
        if (shippingWeight > 1.0) {
            finalPrice += 5.0;
        }
        return finalPrice;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Type: Printed Book");
        System.out.println("Shipping Weight: " + shippingWeight + " kg");
        System.out.println("Final Price (with shipping): $" + String.format("%.2f", calculateFinalPrice()));
    }
}