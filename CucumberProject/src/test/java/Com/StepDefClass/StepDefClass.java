package Com.StepDefClass;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefClass {

	WebDriver driver;
	@Given("User On the Facebook Login Page")
	public void user_On_the_Facebook_Login_Page() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}

	@When("User Should Enter valid {string} and {string}")
	public void user_Should_Enter_valid_and(String Username, String Password) {
	    
		WebElement User = driver.findElement(By.id("email"));
		User.sendKeys(Username);
		
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(Password);	
		
	}

	@When("User Should Enter the Login Button")
	public void user_Should_Enter_the_Login_Button() {
		
		WebElement login = driver.findElement(By.name("login"));
		login.click(); 
	}

	@Then("User Should Verify Success Button")
	public void user_Should_Verify_Success_Button() {
	    
		String title = driver.getTitle();
		boolean B = title.contains("login");
		Assert.assertTrue("Verifying Message", B);
        driver.close();
	
	}

}
