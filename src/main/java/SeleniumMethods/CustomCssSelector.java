package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {
		
         //Xpath is slower than Css
        //Css is faster than xpath		
        //xpath allows very precise locators
		//Css allows forselection of element by their surrounding context
		//xpath relies on brother's xpath implementation which is not always comlete
		//Css provides a good balance between structure and attributes
		//Css doe not provide sibling, parents ,preceding etc
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://app.hubspot.com/login");
		
	//xpath	
//	//input[@id='username']	
//	//input[@id='username'and@type='name']
	  
		
		
	//Css	
	// #username
	//	input[id='username'][type='email']
	// input.form-control.private-form.login-email	
	// #loginBtn
		
	//button[id='logBtn']	
		
	// input.form-control.private-form__control.login-password.m-buttom-3
		
	// input.m-buttom-3	
	//	 button.login-submit
		
	//Dynamic element	
	//  <input id=test_123>	
	//	<input id= test_345>
		
	//....contains		
	//input	[id*='username'] ---contains
		
	//--starting test	
	// input[id^='username']------starting test
		
	//---ending test	
	//  input[id$='username']-------ending test	
	
	//----parent child relation ship	
		
	// div>input[id='username']	--->parent child relation ship
		
		
		
		
	}

}
