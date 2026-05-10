package prob_2;

public class clothingproduct extends product {
	String size;
	String material;

	public clothingproduct(int productId, String productName, double price, String size, String material) {

		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	public void displayInfo() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Size: " + size);
		System.out.println("Material: " + material);
	}
}