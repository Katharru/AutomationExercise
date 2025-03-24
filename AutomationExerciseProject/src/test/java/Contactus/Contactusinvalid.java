package Contactus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Contactusinvalid {
	WebDriver driver;
	@BeforeClass
	
    public void BeforeSetup()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    }
    @Test
    public void Contactus() throws IOException
    {
    	driver.get("https://automationexercise.com/");
    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input")).sendKeys("Rushikesh");
    
    	driver.findElement(By.name("submit")).click();
    	 TakesScreenshot screenshot=(TakesScreenshot)driver;
		   File Source=screenshot.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(Source,new File("ScreenShot11\\screenshot8.png"));
    }
//    @AfterMethod
//    public void After()
//    {
//    	driver.quit();
//    }
      
}
