package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
	driver.findElement(By.linkText("Good PopUp #3")).click();
	
	Set<String>handels = driver.getWindowHandles();
	Iterator<String>it = handels.iterator();
	
	String parentWindowId= it.next();
	System.out.println(" parentWindowId"+ parentWindowId );
	
	String childWindowID=it.next();
	System.out.println("childWindowID"+childWindowID);
	
	//switch to window
	driver.switchTo().window(childWindowID);
	System.out.println("child window title is :"+driver.getTitle());
	driver.close();
	driver.switchTo().window(parentWindowId);
	System.out.println("parent window title is:"+driver.getTitle());
	 
	driver.quit(); //close all the prowther  window
	}

}
