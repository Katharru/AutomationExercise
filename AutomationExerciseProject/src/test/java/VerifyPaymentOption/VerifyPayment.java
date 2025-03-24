package VerifyPaymentOption;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPayment {


	 WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.get("https://automationexercise.com/payment");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    @Test
	    public void payment() {
	    	driver.get("https://www.automationexercise.com/payment");
	    	driver.findElement(By.xpath("//button[@id='submit']")).click();
	    	
	    	driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("abc");
	    	driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("xyz");
	    	driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("aaa");
	    	driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys("32");
	    	driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys("2025");
	    	driver.findElement(By.xpath("//button[@id='submit']")).click();
	    	}
}
