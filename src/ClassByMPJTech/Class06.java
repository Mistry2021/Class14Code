package ClassByMPJTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class06 {
@Test
public void practice06 ()


{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("sam1000000000000000000@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		//X path rules 13 	//tagname/button/preceding::input[@name='value']
		//driver.findElement(By.xpath("//input/preceding::input[@type='radio']")).click();
		// x path 14 	//tagname/button/following::input[@name='value']
		//driver.findElement(By.xpath("//input/preceding::input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input/following::input[@value='2']")).click();
		
		// xpath rules 5 //tagname[starts-with(@attribute,'value')and(@attribute='value')] did not worked 
		//rules 1 //tagname[@attribute='value'] worked 
		// xpath rules 6 //tagname[starts-with(@attribute,'value') or (@attribute='value')] worked 
	WebElement drpdays = driver.findElement(By.xpath("//select[starts-with(@id,'day') or (@name='day')]"));
    drpdays.click();
	Select Day=new Select (drpdays);
	Day.selectByIndex(10);
	// xpath rules 7 //*[@attribute='value']
	WebElement drpmonth= driver.findElement(By.xpath(" //*[@id='months']"));
	//Thread.sleep(2000);
	drpmonth.click();
	Select Month=new Select(drpmonth);
	Month.selectByVisibleText("May ");
	//xpath rules 8 //*[@attribute='value' or @attribute='value']     
	WebElement drpyear= driver.findElement(By.xpath("//*[@id='years' or @name='years']"));
	drpyear.click();
	Select Year=new Select (drpyear);
	Year.selectByValue("2021");
	//xpath rules 9 //*[@attribute='value' and @attribute='value']
	driver.findElement(By.xpath(" //*[@type='checkbox' and @name='newsletter']")).click();
	// Xpath rules 10 //*[@attribute='value' and @attribute='value' or @attribute='value']
	driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).click();


	}

}
