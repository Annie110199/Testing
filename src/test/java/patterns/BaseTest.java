package patterns;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/AnnieG/IdeaProjects/Testing/src/main/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
}