package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement =driver.findElement(By.id("draggable"));
		WebElement targetElement =driver.findElement(By.id("draggable"));
	
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(sourceElement, targetElement).release().build().perform();
		//actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		
		
		
		
	//interview Question 
		
//Action
//.clickAndHold(sourceElement	
//.moveToelement(targetElement)
//.release()	
//.build	
//.perform	
	
		
		
		
		
	}	
}
