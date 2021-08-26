package ClassByMPJTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class16 {
	WebDriver driver;
	WebDriverWait Ex;
	Actions build;
	JavascriptExecutor js; 

	@BeforeTest 
	public void setup() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Ex=new WebDriverWait(driver, 6);
	build=new Actions(driver);
	js=(JavascriptExecutor) driver;

	}

	@Test (priority=0)
	public void frame() throws InterruptedException {
	driver.get("http://automationpractice.com/index.php");

}
}
