package ClassByMPJTech;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Class08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver ();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Explicit Wait
//WebDriverWait exp=new WebDriverWait(driver, 5);
		
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
  
 System.out.println(driver.findElements(By.cssSelector("#id_gender1")).size()+ "--Count");
 
	   //Css rule - 6 tagname[attribute*='sub_string_slashunder']
 driver.findElement(By.cssSelector("input[id*='_gender2']")).click();
 System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isDisplayed()+"--Mrs is Displayed");
 System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isSelected()+"--Mrs is Selected");
 System.out.println(driver.findElement(By.cssSelector("input[id*='_gender2']")).isEnabled()+"--Mrs is Enabled");
 System.out.println(driver.findElements(By.cssSelector("input[id*='_gender2']")).size()+ "--Count");
//exp.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id*='_gender2']")));
 
//Css rule - 7 tagname[attribute^='start of String']
 driver.findElement(By.cssSelector("input[id^='custo']")).sendKeys("John");
 System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isEnabled()+"--First Name is Enabled");
 System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isSelected()+"--First Name is Selected");
 System.out.println(driver.findElement(By.cssSelector("input[id^='custo']")).isDisplayed()+"--First Name is Displayed");
 
//Css rule - 8 tagname[attribute1='value'][attribute2='value']
 driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).sendKeys("Smith");
 System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isEnabled()+"--Last Name is Enabled");
 System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isSelected()+"--Last Name is Selected");
 System.out.println(driver.findElement(By.cssSelector("input[id='customer_lastname'][type='text']")).isDisplayed()+"--Last Name is Displayed");
//Css rule - 9 tag[attribute$=suffix of the string]
 driver.findElement(By.cssSelector("input[type$='rd']")).sendKeys("A123$bc00");
 
//Css rule 4 .class-value.class-value..... *if multiple value of class with spaces
 driver.findElement(By.cssSelector(".form-control")).sendKeys("16");
 System.out.println(driver.findElement(By.cssSelector(".form-control")).isEnabled()+"--Days is Enabled");
 System.out.println(driver.findElement(By.cssSelector(".form-control")).isSelected()+"--Days is Selected");
 System.out.println(driver.findElement(By.cssSelector(".form-control")).isDisplayed()+"--Days is Displayed");
 System.out.println(driver.findElements(By.cssSelector(".form-control")).size()+ "--Count");
 
 
	}

}
