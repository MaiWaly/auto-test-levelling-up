package firstTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestClass {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

  /*  @Test
    public void taskone() {
        driver.navigate().to("https://duckduckgo.com/");
        WebElement img = driver.findElement(By.xpath("//img[contains(@src, 'data:image/svg')]"));

        assertEquals("Google", driver.getTitle());
    }*/
    @Test
    public void tasktwo() {
        driver.navigate().to("https://duckduckgo.com/");
        assertEquals("Google", driver.getTitle());
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

}
