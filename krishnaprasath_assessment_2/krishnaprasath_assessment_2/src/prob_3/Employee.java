package prob_3;

public class Employee {
  int employeeid;
  String name;
  String designation;
  double salary;
  public Employee(int employeeid, String name, String designation, double salary) {
	this.employeeid = employeeid;
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	
  }
  public void displayInfo() {
      System.out.println("Employee ID: " + employeeid);
      System.out.println("Name: " + name);
      System.out.println("Designation: " + designation);
      System.out.println("Salary: " + salary);  
}
  void increasesalary(double percentage) {
	  salary=salary+(salary*(percentage/100));
	  //System.out.println("the updated salary is: "+salary);
  }
  void increasesalary(double percentage,double bonus) {
	  salary=salary+(salary*(percentage/100))+bonus;
	 // System.out.println("the updated salary is: "+salary);
  }
}