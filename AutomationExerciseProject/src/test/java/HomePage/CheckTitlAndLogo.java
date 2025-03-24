package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckTitlAndLogo {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void verifyTitle() {
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed!");
    }
    
    
    @Test
    public void verifyLogo() {
        boolean logoDisplayed = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img")).isDisplayed();
        Assert.assertTrue(logoDisplayed, "Logo is not displayed!");
        System.out.println("Logo is Successfully Check");
    }

   @AfterMethod
   public void setupForAfterMethod()
   {
	   driver.quit();
   }

}
