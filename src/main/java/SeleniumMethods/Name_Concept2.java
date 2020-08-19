package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Concept2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("No, thanks!")).click();
		
		
		
		WebElement a = driver.findElement(By.id("sum1"));
		a.sendKeys("5");
		WebElement b	= driver.findElement(By.id("sum2"));
		b.sendKeys("5");
		driver.findElement(By.xpath("  //button[contains(text(),'Get Total')] ")).click();
		String GetTotal  = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
		System.out.println( GetTotal);
		
		
		if ( GetTotal.equals("10")){
		System.out.println(  GetTotal+" is Correct ");	
		}else{
		System.out.println(  GetTotal+" is incorrect");	
		}
		
		
	}

}


