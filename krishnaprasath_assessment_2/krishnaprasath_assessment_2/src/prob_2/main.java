package prob_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electronic Product Details");

		System.out.print("Enter Product ID: ");
		int eid = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
		String ename = sc.nextLine();

		System.out.print("Enter Price: ");
		double eprice = sc.nextDouble();

		System.out.print("Enter Warranty Period (Months): ");
		int warranty = sc.nextInt();

		Electronicproduct ep = new Electronicproduct(eid, ename, eprice, warranty);
		System.out.println("ELECTRONIC PRODUCT INFORMATION:");
		ep.displayInfo();

		System.out.println("Enter Clothing Product Details");

		System.out.print("Enter Product ID: ");
		int cid = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
		String cname = sc.nextLine();

		System.out.print("Enter Price: ");
		double cprice = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter Size: ");
		String size = sc.nextLine();

		System.out.print("Enter Material: ");
		String material = sc.nextLine();

		clothingproduct cp = new clothingproduct(cid, cname, cprice, size, material);
		System.out.println("CLOTHING PRODUCT INFORMATION:");
		cp.displayInfo();

	}

}
