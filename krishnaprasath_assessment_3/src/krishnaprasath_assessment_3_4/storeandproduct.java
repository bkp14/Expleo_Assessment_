package krishnaprasath_assessment_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class storeandproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<product_s> list = new ArrayList<>();

		System.out.print("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for product " + (i + 1));

			System.out.print("Product ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Product Name: ");
			String name = sc.nextLine();

			System.out.print("Category: ");
			String category = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			System.out.print("Discount: ");
			double discount = sc.nextDouble();

			System.out.print("Quantity: ");
			int qty = sc.nextInt();

			list.add(new product_s(id, name, category, price, discount, qty));
		}

		while (true) {
			System.out.println("\n1. Sort by Id");
			System.out.println("2. List Mobiles with price more than 40000");
			System.out.println("3. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Collections.sort(list);
				System.out.println("Sorted Products:");
				for (product_s p : list) {
					p.display();
				}
				break;

			case 2:
				System.out.println("Mobiles with price > 40000:");
				for (product_s p : list) {
					if (p.productCategory.equalsIgnoreCase("Mobile") && p.productPrice > 40000) {
						p.display();
					}
				}
				break;

			case 3:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
