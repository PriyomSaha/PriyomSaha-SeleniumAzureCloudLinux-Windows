import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DemoTest {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    void test() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        System.out.println(title);
    }

}
