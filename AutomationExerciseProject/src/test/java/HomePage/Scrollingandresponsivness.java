package HomePage;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scrollingandresponsivness {
    WebDriver driver=null;
   
@BeforeMethod
public void Method()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority = 4)
 public void testScrolling() {
	driver.get("https://automationexercise.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	
}}
