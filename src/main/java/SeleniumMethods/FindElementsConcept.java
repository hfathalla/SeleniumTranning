package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

//find elements
List<WebElement>linkList = driver.findElements(By.tagName("a"));

//size
System.out.println("Total links are:"+linkList.size());
for (int i = 0; i < linkList.size(); i++) {
String text = linkList.get(i).getText();
System.out.println(text);
if (!text.isEmpty()){
System.out.println(text);
}

if (text.equals("forget password")){
	linkList.get(i).click();
  break;	
}


}

	}

}
