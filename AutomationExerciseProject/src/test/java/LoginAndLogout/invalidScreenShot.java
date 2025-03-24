package LoginAndLogout;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invalidScreenShot {
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
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		 File Source=screenshot.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(Source,new File("ScreenShot11\\screenshot4.png"));

}
}