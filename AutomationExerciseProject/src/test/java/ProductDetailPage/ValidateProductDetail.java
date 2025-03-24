package ProductDetailPage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateProductDetail {
	  WebDriver driver;

	    @BeforeClass
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.get("https://automationexercise.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    @Test
	    public void valaidateName()
	    {
      	driver.get("https://automationexercise.com/");
	   	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a")).click();
	    String ActualResult=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")).getText();
        String Expected="Men Tshirt";
        assertEquals( ActualResult, Expected);
        
        System.out.println();
	    }
	    @Test
	    public void Validateprice()
	    {
	    	driver.get("https://automationexercise.com/");
		   	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		    driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a")).click();
		    String Actual= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")).getText();
		    String Expected="Rs. 400";
		    assertEquals(Actual,Expected );
	    }
	    @Test
	    public void availabolityCheck()
	    {
	    	driver.get("https://automationexercise.com/");
		   	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		    driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a")).click();
		   String Actual= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]")).getText();
		    
		    String Expected="Avaibility:Instock";
		    assertEquals(Actual, Expected);

	    }
}