package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_19_WebTableHandling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		ElementUtil.launchURL(driver, "https://techcanvass.com/examples/webtable.html");
		System.out.println("Company name are:");
		String beforeXpath = "//table[@id='t01']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for (int i = 2; i < 5; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			
			//System.out.println(element.getText());
			if(element.getText().equals("Suzuki")) {
			System.out.println("Company name : " + element.getText() + " is found at position " + (i-1));
			break;
			}
	}
		String afterXpathMake = "]/td[2]";
		System.out.println("\nMake :");
		for (int i = 2; i < 5; i++) {
			String actualXpath = beforeXpath + i + afterXpathMake;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}	
		
		
		driver.quit();	
			
				
	}

}
