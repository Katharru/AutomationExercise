package LoginAndLogout;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidLogin {
  
	
	WebDriver driver;
	@BeforeMethod
	public void Method()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	@Test
	public void ValidLogincredential() throws IOException
	{
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("rushikathar3399@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rushi@123");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
        System.out.println("Account Successfully Logout");
	    		
}
}