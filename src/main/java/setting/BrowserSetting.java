package setting;

import org.openqa.selenium.WebDriver;
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
        String hubUrl = "http://localhost:4444/wd/hub";
        WebDriver webDriver = new RemoteWebDriver(new URL(hubUrl), new FirefoxOptions());
        webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        return webDriver;
    }

}
