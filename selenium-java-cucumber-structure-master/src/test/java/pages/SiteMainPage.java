package pages;

import org.openqa.selenium.support.PageFactory;

public class SiteMainPage extends SiteMainPageElementMap {

    public SiteMainPage(){
        PageFactory.initElements(driver, this);
    }

    public void acessarForms(){
        btnForms.click();
    }



}
