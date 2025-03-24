package ADDtoCARD;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateCardUpdates {

	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://automationexercise.com/");
	    }
 
	    @Test
	    public void AddCard()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	    	driver.findElement(By.linkText("here")).click();
	    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();
	    	driver.findElement(By.linkText("View Cart")).click();
	        String Actual= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[3]/p")).getText();
	       String Expected="Rs. 400";
	
	       assertEquals(Actual,Expected);
	       
	    }
	    @Test
	    public void AddCredd()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	    	driver.findElement(By.linkText("here")).click();
	    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();
	    	driver.findElement(By.linkText("View Cart")).click();
	    	String ActualAm= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[3]/p")).getText();
	    	String ExpectedAm="";
	    	assertEquals(ActualAm,ExpectedAm);
	    }
	    
	    
	
}
