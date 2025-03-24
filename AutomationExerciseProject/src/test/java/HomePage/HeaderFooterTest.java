package HomePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HeaderFooterTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void verifyHeaderLinks() {
        List<WebElement> headerLinks = driver.findElements(By.cssSelector("ul.nav.navbar-nav > li > a"));
        Assert.assertTrue(headerLinks.size() > 0, "Header links are missing.");

        // Example check for specific headers
        Assert.assertEquals(headerLinks.get(0).getText(), "Home");
        Assert.assertEquals(headerLinks.get(1).getText(), "Products");
        Assert.assertEquals(headerLinks.get(2).getText(), "Cart");
        Assert.assertEquals(headerLinks.get(3).getText(), "Signup / Login");
        Assert.assertEquals(headerLinks.get(4).getText(), "Test Cases");
        Assert.assertEquals(headerLinks.get(5).getText(), "API Testing");
        Assert.assertEquals(headerLinks.get(6).getText(), "Video Tutorials");
        Assert.assertEquals(headerLinks.get(7).getText(), "Contact us");
    }
    @Test(priority = 1)
    public void verifyFooterVisibility() {
        WebElement footer = driver.findElement(By.cssSelector("footer"));
        
         Assert.assertTrue(footer.isDisplayed(), "Footer is not visible");
    }
    @AfterMethod
    public void AfterMethod()
    {
    	driver.quit();
    }

}
