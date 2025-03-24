package SignupPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invalidSignupCredential {

	WebDriver driver;
	@BeforeMethod
	public void Method()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}	
	@Test
	public void NevigateSignupandSignUpvalid() throws IOException
	{
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		   File Source=screenshot.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(Source,new File("ScreenShot11\\screenshot3.png"));
		
		
	}
	
}
