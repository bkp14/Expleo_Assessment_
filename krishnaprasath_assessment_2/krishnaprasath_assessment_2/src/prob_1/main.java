package prob_1;
import java.util.Scanner;
class customer{
	private int id ;
	private String name;
	private char gender;
	
	public customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
class account{
	private int id;
	private customer Customer;
	private double balance=0.0;
	public account(int id, customer customer, double balance) {
		
		this.id = id;
		Customer = customer;
		this.balance = balance;
	}
	public account(int id, customer customer) {
		this.id = id;
		Customer = customer;
	}
	public int getId() {
		return id;
	}
	
	public customer getCustomer() {
		return Customer;
	}
	
	public double getBalanace() {
		return balance;
	}
	public void setBalanace(double balanace) {
		this.balance = balanace;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", Customer=" + Customer + ", balanace= (%.2f)" + balance + "]";
	}
	public void deposit (double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		else {
			balance-=amount;
			System.out.println("amount withdrawn successfully");

		}
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account ID: ");
        int accountId = sc.nextInt();
		 System.out.print("Enter Customer ID: ");
	        int customerId = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Customer Name: ");
	        String customerName = sc.nextLine();

	        System.out.print("Enter Customer Gender: ");
	        char customerGender = sc.next().charAt(0);

	        System.out.print("Enter Account Balance: ");
	        double accountBalance = sc.nextDouble();
	        customer obj = new customer(customerId,customerName,customerGender);
		account ob = new account(customerId,obj,accountBalance);
		boolean flag = true;
  while(flag) {
	  
	  
	  System.out.println("PLEASE SELECT ONE OPTION FROM BELOW:");
	  System.out.println("1.WITHDRAW");
	  System.out.println("2. DEPOSIT");
	  System.out.println("3. CHECK BALANCE");
	  System.out.println("4. EXIT");
	  System.out.println("option: ");
	  int choice =sc.nextInt();
	  switch(choice) {
	  case 1:
		  System.out.println("enter amount to withdraw: ");
		  double am =sc.nextDouble();
		  ob.withdraw(am);
		  break;
	  case 2:
		  System.out.print("ENTER AMOUNT TO DEPOSIT: "); 
			  double pm =sc.nextDouble();
			 ob.deposit(pm);
			 break;
	  case 3:
		  System.out.print("Current Balance: "); 
		  System.out.println(ob.getBalanace());
		  break;
	  case 4:
		  flag=false;
		  System.out.print("THANK YOU FOR BANKING WITH US!!"); 
		  break;
      
	  }

	  

	  
  }
	}

}
