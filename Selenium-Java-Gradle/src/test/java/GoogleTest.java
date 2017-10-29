/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class GoogleTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    
    
@Test
public void googleTest(){


	  System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");

       WebDriver driver = new ChromeDriver(); 
       driver.get("http://www.google.com"); 
       WebElement element = driver.findElement(By.name("q"));
       element.sendKeys("QTP");
       element.submit();
       driver.close();
}
}
