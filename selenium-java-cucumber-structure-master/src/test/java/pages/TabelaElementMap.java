package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabelaElementMap {

    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(1) > div > div.card-body")
    protected WebElement btnElement;

    @FindBy(xpath = "//span[contains(.,'Web Tables')]")
    protected WebElement btnWebTables;

    @FindBy(id = "addNewRecordButton")
    protected static WebElement btnAdicionar;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/form/div[1]/div[2]/input")
    protected static WebElement txtFirstName;

    @FindBy(id = "lastName")
    protected static WebElement txtLastName;

    @FindBy(id = "userEmail")
    protected static WebElement txtEmail;

    @FindBy(id = "age")
    protected static WebElement txtIdade;

    @FindBy(id = "salary")
    protected static WebElement txtSalario;

    @FindBy(id = "department")
    protected static WebElement txtDepartamento;

    @FindBy(id = "submit")
    protected static WebElement btnSubmit;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]")
    protected static WebElement tblGrid;
}
