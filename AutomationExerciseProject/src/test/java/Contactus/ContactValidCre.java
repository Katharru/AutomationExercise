package Contactus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactValidCre {

	
	WebDriver driver=null;

    @BeforeClass
    public void BeforeSetup()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    }
    @Test
    public void Contactus()
    {
    	driver.get("https://automationexercise.com/");
    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input")).sendKeys("Rushikesh");
    	driver.findElement(By.name("email")).sendKeys("rushikathar3399@gmail.com");
    	driver.findElement(By.name("subject")).sendKeys("Nothing");
    	driver.findElement(By.name("message")).sendKeys("I dont have problem");
    	driver.findElement(By.name("submit")).click();
    }
    @AfterMethod
    public void After()
    {
    	driver.quit();
    }
      

}
