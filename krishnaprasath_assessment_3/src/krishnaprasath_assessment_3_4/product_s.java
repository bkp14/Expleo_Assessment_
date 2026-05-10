package krishnaprasath_assessment_3_4;

public class product_s implements Comparable<product_s> {
	int productId;
	String productName;
	String productCategory;
	double productPrice;
	double productDiscount;
	int productQuantity;

	public product_s(int productId, String productName, String productCategory, double productPrice,
			double productDiscount, int productQuantity) {

		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	}

	public int compareTo(product_s p) {
		return this.productId - p.productId;
	}

	public void display() {
		System.out.println(productId + " | " + productName + " | " + productCategory + " | " + productPrice + " | "
				+ productDiscount + " | " + productQuantity);
	}

}
