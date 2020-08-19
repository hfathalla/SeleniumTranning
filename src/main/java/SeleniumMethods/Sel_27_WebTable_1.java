package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_WebTable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");

//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
//*[@id="customers"]/tbody/tr[4]/td[1]

String beforeXpath ="//*[@id='customers']/tbody/tr[";
String afterXpath="]/td[1]";

for (int i = 2; i <=7; i++) {
String actualXpath = beforeXpath + afterXpath;
WebElement element = driver.findElement(By.xpath("actualXpath"));

//System.out.println("Companny name........");
System.out.println(element.getText());
}

System.out.println("===============================");
//*[@id="customers"]/tbody/tr[2]/td[2]
//*[@id="customers"]/tbody/tr[3]/td[2]

String actualXpathContant ="]/td[2]";

System.out.println("Contact name-------");
for (int i = 2; i <=7; i++) {
String actualXpath = beforeXpath + afterXpath;
WebElement element = driver.findElement(By.xpath("actualXpath"));
//System.out.println("Contant  name........");
System.out.println(element.getText());
}
//*[@id="customers"]/tbody/tr[2]/td[3]

String actualXpathCountry ="]/td[3]";

System.out.println("Countru name-------");
for (int i = 2; i <=7; i++) {
String actualXpath = beforeXpath + afterXpath;
WebElement element = driver.findElement(By.xpath("actualXpath"));
//System.out.println("Country  name........");
System.out.println(element.getText());
}

	}

}
