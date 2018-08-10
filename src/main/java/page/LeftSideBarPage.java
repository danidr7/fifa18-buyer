package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftSideBarPage {

    @FindBy(css = ".btnHome")
    private WebElement btHome;

    @FindBy(css = ".btnSquads")
    private WebElement btSquads;

    @FindBy(css = ".btnSBC")
    private WebElement btSbs;

    @FindBy(css = ".btnTransfers")
    private WebElement btTransfers;

    @FindBy(css = ".btnStore")
    private WebElement btStore;

    @FindBy(css = ".btnClub")
    private WebElement btClub;

    public LeftSideBarPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickBtTransfers(){
        btTransfers.click();
    }

}
