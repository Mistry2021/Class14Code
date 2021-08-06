package ClassByMPJTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02 {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver ();	
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("sam@gmail.com");
	driver.findElement(By.linkText("Contact us")).click();


	}

}
