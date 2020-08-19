package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveElementConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
	
		WebElement contantMenu = driver.findElement(By.className("menulink"));
		
		Actions actions =new  Actions(driver); 
		actions.moveToElement(contantMenu).build().perform();	
			
		WebElement courcesLink =driver.findElement(By.linkText("COURSES"));		
		courcesLink.click();//first approach	
		
		//actions.click(courcesLink);
		
	}

}
