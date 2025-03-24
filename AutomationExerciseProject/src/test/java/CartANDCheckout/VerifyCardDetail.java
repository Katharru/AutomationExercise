package CartANDCheckout;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyCardDetail {
	      WebDriver driver=null;
	  @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://automationexercise.com/view_cart");
	    }

	    @Test
	    public void AddCard()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	    	driver.findElement(By.linkText("here")).click();
	    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();
	    	driver.findElement(By.linkText("View Cart")).click();
	        String Actual= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[2]/h4/a")).getText();
	        String Expected="Men Tshirt";
	
	       assertEquals(Actual,Expected);
	       
	    }
	    @Test
	    public void AddCredd()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	    	driver.findElement(By.linkText("here")).click();
	    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();
	    	driver.findElement(By.linkText("View Cart")).click();
	    	String ActualAm= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[5]/p")).getText();
	    	String ExpectedAm="Rs. 800";
	    	assertEquals(ActualAm,ExpectedAm);
	    }
	    @Test
	    
	    public void AddCasrd()
	    {
	    	driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
	    	driver.findElement(By.linkText("Register / Login\r\n"+ "\r\n"+ "")).click();
	    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("rushikathar3399@gmail.com");
	    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Rushi@12345");
	    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	    	driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
	    }
        @AfterMethod
        public void Afetr()
        {
        	driver.quit();
        }
    
}
	    

