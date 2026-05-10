package prob_3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();  

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Designation: ");
	        String designation = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        Employee emp = new Employee(id, name, designation, salary);
	        emp.displayInfo();
   
System.out.println("1. Increase salary by percentage");
System.out.println("2. Increase salary by percentage + bonus");
System.out.print("Enter your choice: ");

int choice = sc.nextInt();

switch (choice) {

    case 1:
        System.out.println("Enter hike percentage:");
        double h = sc.nextDouble();
        emp.increasesalary(h);
        break;

    case 2:
        System.out.println("Enter hike percentage:");
        double h1 = sc.nextDouble();
        System.out.println("Enter bonus amount:");
        double h2 = sc.nextDouble();
        emp.increasesalary(h1, h2);
        break;

    default:
        System.out.println("Invalid choice");
}

System.out.println("Updated Details:");
emp.displayInfo();
	        
	}

}
