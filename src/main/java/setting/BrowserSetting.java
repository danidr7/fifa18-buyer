package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by daniel on 05/08/18.
 */
public class BrowserSetting {

    public WebDriver newWebDriver() throws MalformedURLException {
        String driverPath = System.getenv("DRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        return webDriver;
    }

}
