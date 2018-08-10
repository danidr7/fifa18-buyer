package main;

import org.openqa.selenium.WebDriver;
import page.LeftSideBarPage;
import setting.BrowserSetting;

import java.net.MalformedURLException;

/**
 * Created by daniel on 05/08/18.
 */
public class AutoBuyRobot {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        BrowserSetting setting = new BrowserSetting();
        WebDriver driver = setting.newWebDriver();

        driver.get("https://www.easports.com/fifa/ultimate-team/web-app/");

        LeftSideBarPage leftSideBar = new LeftSideBarPage(driver);

        leftSideBar.clickBtTransfers();

    }

}
