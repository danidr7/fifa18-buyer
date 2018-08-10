package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "footer")
    private LeftSideBarPage leftSideBarPage;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public LeftSideBarPage getLeftSideBarPage() {
        return leftSideBarPage;
    }
}
