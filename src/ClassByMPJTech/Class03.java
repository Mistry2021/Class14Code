package ClassByMPJTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver ();
		
	driver.get("http://automationpractice.com/index.php");
	//driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.partialLinkText("in")).click();
	//example of relative xpath-- Line 20
	driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Shorts");  
	//example of absolute/full xpath--- Line 22 (all the parent and child tags)
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
		
	//driver.close();
	}

}
