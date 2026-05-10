package prob_2;

abstract public class product {
	int productId;
    String productName;
    double price;
    public product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    abstract void displayInfo();
}
