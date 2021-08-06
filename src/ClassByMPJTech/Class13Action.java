package ClassByMPJTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class13Action {
WebDriver driver;
WebDriverWait Ex;
Actions build;

@BeforeTest 
public void setup() {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
driver=new ChromeDriver ();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Ex=new WebDriverWait(driver, 6);
build=new Actions(driver);
}
		    
@Test (priority=0)
public void actions () throws InterruptedException {
driver.get("https://www.facebook.com/");
WebElement email =driver.findElement(By.id("email"));
Action series= build.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys(email, "hello").keyUp(email, Keys.SHIFT).build();
series.perform();
driver.get("https://demoqa.com/droppable");
WebElement from=driver.findElement(By.id("draggable"));
WebElement to=driver.findElement(By.id("droppable"));
Action series2=build.dragAndDrop(from, to).build();
series2.perform();
//driver.navigate().refresh();
//Thread.sleep(5000);
}

@Test (priority=1)
public void alarts1 () throws InterruptedException {
driver.get("https://demoqa.com/alerts");
driver.findElement(By.id("alertButton")).click();
driver.switchTo().alert().accept();
driver.findElement(By.id("timerAlertButton")).click();
Thread.sleep(6000);
driver.switchTo().alert().accept();
driver.findElement(By.id("confirmButton")).click();
driver.switchTo().alert().dismiss();
driver.findElement(By.id("promtButton")).click();
driver.switchTo().alert().sendKeys("Sam");
driver.switchTo().alert().accept();
}

//@AfterTest 
//public void closeTab() {
//driver.close();
//}
}

