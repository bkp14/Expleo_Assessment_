package prob_2;

public class Electronicproduct extends product {
	int warrantyperiod;

	public Electronicproduct(int productId, String productName, double price, int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyperiod = warrantyPeriod;
	}

	public void displayInfo() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Warranty Period: " + warrantyperiod);
	}

	public int getWarrantyPeriod() {
		return warrantyperiod;
	}
}
