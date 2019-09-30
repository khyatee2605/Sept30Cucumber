package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPOMTest {
	WebDriver driver;
	@Given("User is on HerokuApp")
	public void user_is_on_HerokuApp() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("User is on Home Page");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		LoginOR obj=new LoginOR(driver);
		obj.user.sendKeys("tomsmith");
		obj.pass.sendKeys("SuperSecretPassword!");
		obj.login.click();
		/*driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();*/
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("User logged in successfully");
	}
}
