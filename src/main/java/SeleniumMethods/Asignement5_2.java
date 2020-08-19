package SeleniumMethods;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asignement5_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/payment-gateway/index.php");
		
		String price = driver.findElement(By.xpath("//h3[contains(text(),'Price: $20')]")).getText();
		System.out.println("the price is :" +price);
		
		
	//WebElement price = driver.findElement(By.xpath("//h3[contains(text(),'Price: $20')]"));
	
			Select select =new Select(driver.findElement(By.name("quantity")));		
			select.selectByValue("3");
			
		 driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		
		
		String total = driver.findElement(By.xpath("//*[@id='three']/div/form/div/div[1]")).getText();
		System.out.println("Total price is:" +total);
	
		
		
	}

}
