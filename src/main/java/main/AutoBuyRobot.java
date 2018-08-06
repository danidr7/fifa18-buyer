package main;

import org.openqa.selenium.WebDriver;
import setting.BrowserSetting;

import java.net.MalformedURLException;

/**
 * Created by daniel on 05/08/18.
 */
public class AutoBuyRobot {

    public static void main(String[] args) throws MalformedURLException {
        BrowserSetting setting = new BrowserSetting();
        WebDriver drive = setting.newWebDriver();

        drive.get("https://www.easports.com/fifa/ultimate-team/web-app/");

    }

}
