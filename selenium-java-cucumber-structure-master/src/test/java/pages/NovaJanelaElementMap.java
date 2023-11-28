package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NovaJanelaElementMap {

    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(3) > div > div.card-body > h5")
    protected WebElement btnAlertEWindow;

    @FindBy(xpath = "//span[contains(.,'Browser Windows')]")
    protected WebElement btnBrowserWindow;

    @FindBy(id = "windowButton")
    protected WebElement btnNewWindow;
}
