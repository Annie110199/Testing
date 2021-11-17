
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import java.util.*;

public class TestTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/AnnieG/IdeaProjects/Testing/src/main/drivers/chromedriver.exe");
        //driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/AnnieG/IdeaProjects/Testing/src/main/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://playground.learnqa.ru/puzzle/triangle");
        driver.manage().window().setSize(new Dimension(1536, 824));
        {
            List<WebElement> elements = driver.findElements(By.id("show_answ"));
            assert(elements.size() > 0);
        }
        driver.findElement(By.id("show_answ")).click();
        {
            List<WebElement> elements = driver.findElements(By.id("hide_answ"));
            assert(elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.linkText("Ссылка на ответы"));
            assert(elements.size() > 0);
        }

    }
}
