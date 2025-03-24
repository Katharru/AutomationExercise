package HomePage;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NevigateDifferentSections {
    WebDriver driver=null;
    @BeforeMethod
    public void SetupBeforeMethod()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @Test
    public void NevigateProduct()
    {
      	driver.get("https://automationexercise.com/");
    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
    	driver.findElement(By.id("search_product")).sendKeys("Shirt");
    	driver.findElement(By.id("submit_search")).click();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
    	driver.findElement(By.linkText("here")).click();
    	driver.findElement(By.className("panel-heading")).click();
    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/ul/li[1]/a")).click();
    	driver.findElement(By.id("search_product")).sendKeys("Jeans");
    	driver.findElement(By.id("submit_search")).click();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input")).sendKeys("Rushikesh");
    	driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input")).sendKeys("rushikathaar3399@gmail.com");
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[3]/input")).sendKeys("hii");
    	driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("No any Message");
    	driver.findElement(By.className("btn btn-primary pull-left submit_form")).click();
    	Alert alert=driver.switchTo().alert();
    	alert.accept();
    	
    	driver.navigate().back();
    	
    }
    
    @AfterMethod
    public void AfterM()
    {
    	driver.quit();
    }
    
	
}
