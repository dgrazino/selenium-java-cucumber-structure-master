package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteMainPageElementMap extends CommonPage {

    @FindBy(id = "search_query_top")
    protected WebElement txtPesquisarProduto;

    @FindBy(name = "submit_search")
    protected WebElement btnPesquisarProduto;

    @FindBy(css = ".heading-counter")
    protected WebElement lblQtdResultadosEncontrados;

    @FindBy(css = "card:nth-child(2) .card-up")
    protected WebElement btnForms;

    @FindBy(id = "item-0")
    protected WebElement btnPracticeForm;

}
