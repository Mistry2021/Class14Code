package ClassByMPJTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class07 {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver ();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Explicit Wait
		WebDriverWait exp=new WebDriverWait(driver, 5);
		
		//CSS rule 1 tagname[attribute='value']
		driver.findElement(By.cssSelector("a[class='login']")).click();
//Validation method 1 isDisplayed
		System.out.println(driver.findElement(By.cssSelector("a[class='login']")).isDisplayed()  + "--Signin Button Found");
		//Css rule 2 tagname#id-value
		driver.findElement(By.cssSelector("input#email_create")).sendKeys("Sam2019C@yahoo.com");
//Validation method 2 isSelected
		System.out.println(driver.findElement(By.cssSelector("input#email_create")).isSelected()+"-- Email address is Selected");
		//Css rule 3 tagname.class-value (we used . for each space)
		driver.findElement(By.cssSelector("button.btn.btn-default.button.button-medium.exclusive")).click();	
//validation method 3 isEnabled
System.out.println(driver.findElement(By.cssSelector("button.btn.btn-default.button.button-medium.exclusive")).isEnabled()+"--Click Crerate An Account Button");
        //Css rule 5 #(id-value)
        driver.findElement(By.cssSelector("#id_gender1")).click();
 //validation method 4 .size()
        int Mr= driver.findElements(By.cssSelector("#id_gender1")).size();
 System.out.println(Mr +"-- Mr in the page ");
	   //Css rule - 6 tagname[attribute*='sub_string_slashunder']
 exp.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id*='_gender2']")));
        driver.findElement(By.cssSelector("input[id*='_gender2']")).click();
 
		

}
}
