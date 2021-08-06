package ClassByMPJTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class14{
	
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
driver.get("https://demoqa.com/frames");
driver.switchTo().frame(1); //First Child
WebElement SampleText=driver.findElement(By.id("sampleHeading"));
System.out.println(SampleText.getText());

driver.switchTo().defaultContent(); //Coming Back to Main page
driver.switchTo().frame(2);//2nd Child 
WebElement SampleText2=driver.findElement(By.id("sampleHeading"));
System.out.println(SampleText2.getText());

driver.switchTo().defaultContent();
WebElement iframe1=driver.findElement(By.id("frame1"));
driver.switchTo().frame(iframe1);
driver.switchTo().defaultContent();
js.executeScript("window.scrollBy(0, window.innerHeight)"); //Scroll Down
driver.switchTo().frame(2);

js.executeScript("window.scrollBy(48,148),'';"); // Scroll up based on x and y coordinate
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,-148),'';");//Scroll down based on x and y coordinate

js.executeScript("window.scrollBy(100,0)");//Scroll right based on x and y coordinate
js.executeScript("window.scrollBy(-100,0)");//Scroll left based on x and y coordinate
driver.switchTo().defaultContent();


driver.get("https://demoqa.com/elements");
WebElement checkBox=driver.findElement(By.id("item-1"));
Thread.sleep(1000);
js.executeScript("arguments[0].scrollIntoView;",checkBox); 


}
}
