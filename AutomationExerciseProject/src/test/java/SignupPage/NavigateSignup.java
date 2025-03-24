package SignupPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateSignup {
 	WebDriver driver;
	@BeforeMethod
	public void Method()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}	
	@Test
	public void NevigateSignupandSignUpvalid()
	{
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("rushikathar3399@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.id("password")).sendKeys("Rushi@123");
		driver.findElement(By.id("days")).sendKeys("1");
		driver.findElement(By.id("months")).sendKeys("January");
		driver.findElement(By.id("years")).sendKeys("2003");
		WebElement web=	driver.findElement(By.name("newsletter"));
	    web.click();
	    boolean b=web.isSelected();
	    Assert.assertTrue(b);
		
	    driver.findElement(By.name("first_name")).sendKeys("Rushikesh");
		driver.findElement(By.id("last_name")).sendKeys("Kathar");
		driver.findElement(By.name("company")).sendKeys("QuamtumSoft Technologies");
		driver.findElement(By.id("address1")).sendKeys("Chhtrapati Sambhaji Nagar");
		driver.findElement(By.id("address2")).sendKeys("Chhtrapati Sambhaji Nagar");
		Select dropdown =new Select(driver.findElement(By.id("country")));
		dropdown.selectByVisibleText("India");
		driver.findElement(By.id("state")).sendKeys("Maharastra");
		driver.findElement(By.id("city")).sendKeys("Chhtrapati Sambhaji nagar");
		driver.findElement(By.id("zipcode")).sendKeys("431001");
		driver.findElement(By.id("mobile_number")).sendKeys("7666775065");
		driver.findElement(By.id("/html/body/section/div/div/div/div[1]/form/button")).click();
		
		
	}
	
}
