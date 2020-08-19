package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_Concept3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		WebElement username = driver.findElement(By.className("validate[required]"));
		username.sendKeys("Hend Fathalla");
		Thread.sleep(2000);
		
		WebElement E_mail = driver.findElement(By.className("validate[required,custom[email]]"));
		E_mail.sendKeys("Hfathalla543@gmail.com");
		Thread.sleep(2000);	
		
		WebElement Telephone = driver.findElement(By.className("validate[required,custom[phone]]"));
		Telephone.sendKeys("2015553310");
		Thread.sleep(2000);	
		
		WebElement Country = driver.findElement(By.name("country"));
	Country.sendKeys("Egypt");
		Thread.sleep(2000);
		
		WebElement Company = driver.findElement(By.name("company"));
		Company.sendKeys("Silicon Labe");
			Thread.sleep(2000);	
		
			WebElement Message = driver.findElement(By.name("message"));
			Message.sendKeys("work smarter not harder");
				Thread.sleep(2000);	
				WebElement SubmitBut = driver.findElement(By.linkText("Submit"));
				 SubmitBut.click();
					Thread.sleep(2000);	
					
				driver.findElement(By.xpath("  //div[ @class='formErrorContent'] ")).click();
					String text  = driver.findElement(By.xpath("//div[ @class='formErrorContent']")).getText();
					System.out.println(text );	
					
					if ( text.equals("Feedback has been sent to the administrator")) {
						System.out.println("correct text");
					}else{
						System.out.println("incorrect text");
					}
					//driver.close();
					System.out.println("text completed");		
	}

}
