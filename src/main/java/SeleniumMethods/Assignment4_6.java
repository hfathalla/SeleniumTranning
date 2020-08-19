package SeleniumMethods;

import org.apache.bcel.generic.IF_ACMPEQ;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

//import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_6 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.designmantic.com/");
        String WinTitle =driver.getTitle();
        System.out.println("title: " + WinTitle);
	Assert.assertEquals( WinTitle,"Graphic Design Software & Logo Tool | DesignMantic: The Design Shop" );
		
		driver.findElement(By.xpath("//li[@class='login-link']//span[contains(text(),'Login')] ")).click();
		driver.findElement(By.id("username")).sendKeys("Hfathalla543@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Semo@34");
		driver.findElement(By.xpath("//input[@class='btn btn-md btn-color-1 btn-radius']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class ='alert alert-danger']"));
	
		String text =element.getText();
		if (text.equals("Bad credentials.")) {
		System.out.println("Text is correct");	
		
		}else{
			System.out.println("Text is wrong");
		}
driver.close();
	}

}
