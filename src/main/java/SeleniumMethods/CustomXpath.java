package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		
//xpasth is used to find the location of any element on a webpage using html structure
//Absolute Xpath: start with single slath(/) starting from root element and all the way to the element		
//Relative Xpath start with double slash(//)starting selecting matching		
//anywhere in the document		
//Absolute xpath :html/body/div/div[5]/li/div[1/a]		
//relative xpath //tagname[@attribute='value']		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://app.hubspot.com/login");
		
		
	//	 //htmltag[@attribute='value']
	//commend +f	
	//  //input[@id='username']	  ---username
	//  //input[@id='password'and@type='password']-----password	
	//	// button[@id='loginBtn'] ----login
	//	// button[@id='loginBtn'and@data-test-id='password-login-button'] ---login
	//  //input[@name='username']---->crmpro user
	//  //iput[@name='password']------>crmpro password
		
	//contains()	
	//input[contains(@name,'username')]	
	//input[contains(@name,'password')]	
		//input[contains(@name,'password')and@type='password']	
	//   //input[@class='btn btn-small'and@value='login']
		
	//some value are available which return false or true	
	//Dynamic xpath	
	//<input id=test_123>	
	//<input id= test_345>
	
	//sample   //input[contains(@id,'test_')]
		
	//Contains is used for or dynamic element properties	
		
	//text function	
	// text()  
	//    //a[text()='signin']
	
	//   // i18n-string[text()='signin']
	
	//   //a//i18n-string[text()='signin']
		
	//   //i18n-string[text()='privacy policy']	
		
	//  //h2[text()]	
	
	//h2[contains(text(),'The email address')]
		
		
	// srart-with function	
	//input[start-with(@id,'username')]
		//input[ends-with(@id,'test_')]		
    //ends-with function
	//input[ends-with(@type,'email')]
		
	//<input id=test_123>
	//<input id=123_test>
		
	//input[ends-with(@id,'_test')]	
		
	//position--->index number
		
	// (//input[contains(@class,'form-control')])[1]	
	// (//input[contains(@class,'form-control')])[1]	
		
		// (//input[contains(@class,'form-control')])[position()=2]	
		
	//parent and child tags in html	
	//  //div[contains(@class,'private-form_input-wrapper')]/input[@id='username']	----->direct child
		
	//  //div[contains(@class,'private-form_input-wrapper')]/input[@id='password']		----->direct child
		
	// //div[@class ='private-form_set m-bottom-4']	/input[@id='username']
		
		
		//following ::
		
		//div[@class='private-form_input-wrapper']/following::input[@id='password']
		//div[@class='private-form_input-wrapper']/following::input[@id='ermember']
		//div[@class='private-form_input-wrapper']//following::input[@id='ermember']
		
		
		//preciding ::

		//input[@id='password']/preceding::div[@class='private-form_input-wrapper']
		
		//child to parent(reverse direction)
		//input[@name='username']/../../../../../../..
		
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//parent::form
		
		
		//last ()
		// (//input[]@type='text'])[last()]--->to reach last index
		
		//ancestor
		
		//input[@id='uid-firstName-6']//ancestor::body
		
		
	}

}
