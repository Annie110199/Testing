package patterns;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class UITesting extends BaseTest {

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pageTest() {
        TestingService service = PageFactory.initElements(driver, TestingService.class);
        service.open();

        assertTrue(service.isShowAnswerButtonExist());
        assertTrue(service.isLinkForAnswerExist());
        assertTrue(service.isHideAnswerButtonExist());
    }


}