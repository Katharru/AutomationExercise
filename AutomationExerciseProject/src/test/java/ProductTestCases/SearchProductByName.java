package ProductTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductByName {

	  WebDriver driver=null;
	    @BeforeMethod
	    public void SetupBeforeMethod()
	    {
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    }
	    
	    @Test
	    public void NevigateProduct()
	    {
	      	driver.get("https://automationexercise.com/");
	    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
	    	driver.findElement(By.id("search_product")).sendKeys("Shirt");
	    	driver.findElement(By.id("submit_search")).click();
	    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/h4/a")).click();
	    	driver.findElement(By.cssSelector("/html/body/section/div/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div/ul/li[1]/a")).click();
	    	driver.findElement(By.className("pull-right")).click();
	    	
	    }
	    @AfterMethod
	    public void Setup()
	    {
	    	driver.quit();
	    }
}
