package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	WebElement firstName = driver.findElement(By.name("firstName"));
	firstName.sendKeys("Hend");
		
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Fathalla");
	
	WebElement phoneNymber = driver.findElement(By.name("phone"));
	phoneNymber.sendKeys("2013339990");
	
	WebElement email = driver.findElement(By.id("userName"));
	email.sendKeys("hfathalla543@gmail.com");
	
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("490 Essex st");
	
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("Hackensack");
	
	WebElement state= driver.findElement(By.name("state"));
	state.sendKeys("New jersy");
	
	WebElement codepostal= driver.findElement(By.name("postalCode"));
	codepostal.sendKeys("07601");
	
	Select select = new Select(driver.findElement(By.name("country")));
	select.selectByValue("UNITED STATES");
	
	WebElement userNmame= driver.findElement(By.id("email"));
    userNmame.sendKeys("hfathalla");
	
    WebElement password= driver.findElement(By.name("password"));
	password.sendKeys("test123@");
	
	  WebElement confirmpassword= driver.findElement(By.name("confirmPassword"));
		confirmpassword.sendKeys("test123@");

		  WebElement submitBtn= driver.findElement(By.name("submit"));
			submitBtn.click();


	
	
	
	
	}

}
