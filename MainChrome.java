package task21;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

    public class MainChrome {

        ChromeDriver chromeDriver;

        @Before
        public  void setup()
        {
            chromeDriver = new ChromeDriver();
            chromeDriver.manage().window().maximize();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        @After
        public  void down()
        {
            chromeDriver.quit();
        }
    }
