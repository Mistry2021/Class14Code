package ClassByMPJTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver ();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("sam@gmail.com");
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.partialLinkText("in")).click();
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Short");  
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	    Thread.sleep(2000);
		
		//Relative xpath Rule Number 1 //tagname [@attribute='value']
	    driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		//Relative xpath Rule Number 2 //tagname [@attribute='value'] [@attribute='value']
		driver.findElement(By.xpath("//input[@id='email_create'][@name='email_create']")).sendKeys("TestSummer2021@gmail.com");
		//Relative xpath Rule Number 3 //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).click();
		
		//driver.close();
		
	}

}
