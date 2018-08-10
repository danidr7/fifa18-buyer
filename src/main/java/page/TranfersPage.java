package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranfersPage {

    @FindBy(css = ".transferMarketTile")
    private WebElement accessTranferMarket;

    public void accessTranferMarket(){
        accessTranferMarket.click();
    }

    public void clickBtFilter(String btName, WebDriver driver){
        WebElement filter = driver.findElement(By.xpath("//span[text()='"+btName+"']"));
        filter.click();
    }

}
