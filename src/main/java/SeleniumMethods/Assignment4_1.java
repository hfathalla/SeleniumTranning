package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
      driver.findElement(By.xpath("//button[text()='Start']")).click();
		
      FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchMethodException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver){
				WebElement element = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				String getTextPage = element.getText();
				if(getTextPage.equals("Hello World!")){
					System.out.println("Text: "+ getTextPage);
					return element;
				}else{
					
					return null;
				}
			}
		});
	 
	}

}
