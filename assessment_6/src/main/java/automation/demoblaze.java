package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) throws ElementNotInteractableException {
		// TODO Auto-generated method stub
		//Login to the Application
		
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demoblaze.com/");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
  
  WebElement username = driver.findElement(By.cssSelector("input#loginusername"));
  username.sendKeys("admin");
  
  WebElement password = driver.findElement(By.xpath("//input[@id='loginpassword']"));
  password.sendKeys("admin");
  
 driver.findElement(By.xpath("//button[text()='Log in']")).click();
  
WebElement home=driver.findElement(By.xpath("//a[text()='Welcome admin']"));


if(home.getText().endsWith("Welcome admin")) {
	System.out.println("Login Successful");
}
else {
	System.out.println("Login Not Successful");
	
}
//Add Product to Cart

driver.findElement(By.xpath("//a[text()='Laptops']")).click();
driver.findElement(By.xpath("//a[text()='MacBook Pro']")).click();
driver.findElement(By.xpath("//a[text()='Add to cart']")).click();



driver.findElement(By.xpath("//a[text()='Cart']")).click();
System.out.println("product added to cart");
Boolean flag= false;
Boolean flag1= false;


for(int i=1;i<=10;i++) {
	WebElement data=driver.findElement(By.xpath("//table//tbody//tr//td["+i+"]"));
	String s = data.getText();
	if(s.equals("MacBook Pro")) {
		flag=true;
		break;
	}
}
for(int i=1;i<=10;i++) {
	WebElement data=driver.findElement(By.xpath("//table//tbody//tr//td["+i+"]"));
	String s = data.getText();
	if(s.equals("1100")) {
		flag1=true;
		break;
	}
}
if(flag&&flag1) {
	System.out.println("MacBook Pro added to cart");
}
//Place Order
driver.findElement(By.xpath("//button[text()='Place Order']")).click();
driver.findElement(By.cssSelector("input#name")).sendKeys("demo");
driver.findElement(By.cssSelector("input#card")).sendKeys("demo123");
driver.findElement(By.xpath("//button[text()='Purchase']")).click();
WebElement element = driver.findElement(By.xpath("/html/body/div[10]/p"));
String text = element.getText();
if(text.contains("Id")) {
	System.out.println("Order is placed successfully");
	System.out.println(text);

}
else {
	System.out.println("Order is not placed successfully");
	
}








	}

}
