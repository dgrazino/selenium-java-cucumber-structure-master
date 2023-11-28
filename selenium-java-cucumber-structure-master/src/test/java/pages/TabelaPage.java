package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static util.TestRule.driver;

public class TabelaPage extends TabelaElementMap{

    public TabelaPage(){
        PageFactory.initElements(util.TestRule.getDriver(), this);
    }

    public void criarNovosRegitros(String arg0,String arg1, String arg2, String arg3, String arg4, String arg5 ){
        boolean executado = false;
        if (!executado) {
            for (int i = 0; i < 1; i++) {

                btnAdicionar.click();
                waitElement(driver.findElement(By.id("firstName")));
                txtFirstName.sendKeys(arg0);
                txtLastName.sendKeys(arg1);
                txtEmail.sendKeys(arg2);
                txtIdade.sendKeys(arg3);
                txtSalario.sendKeys(arg4);
                txtDepartamento.sendKeys(arg5);
                btnSubmit.click();


            }
            validarConteudoTabela();
            executado = true;
        }


    }

    public void validarConteudoTabela(){

        WebElement tabela = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody"));
        List<WebElement> registros = tabela.findElements(By.className("rt-tr-group"));
        //Assert.assertEquals("Número incorreto de registros na tabela.", 10, registros.size());
        assert registros.size() == 10;




    }
    public void clicarAdicionar(){

        btnAdicionar.click();

    }

        public void waitElement(WebElement element){

            WebDriverWait wait = new WebDriverWait(util.TestRule.getDriver(), 50);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    public void clicarElement(){

       btnElement.click();

    }

    public void clicarWebTables(){

        btnWebTables.click();

    }
}
