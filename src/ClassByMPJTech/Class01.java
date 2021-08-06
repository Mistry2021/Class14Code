package ClassByMPJTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {

public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://js-travel-blog.herokuapp.com/signup.php");
		driver.findElement(By.name("name")).sendKeys("Sam Smith");

	}

}
