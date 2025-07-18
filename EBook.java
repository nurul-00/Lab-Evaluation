package src;

public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, double price, String ISBN, double fileSizeMB) {
        super(title, author, price, ISBN);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = getPrice();
        if (fileSizeMB > 100.0) {
            finalPrice *= 0.90;
        }
        return finalPrice;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Type: E-Book");
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Final Price (with discount): $" + String.format("%.2f", calculateFinalPrice()));
    }
}