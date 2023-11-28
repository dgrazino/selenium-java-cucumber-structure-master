package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

import static util.TestRule.driver;

public class NovaJanelaPage extends NovaJanelaElementMap {

    public NovaJanelaPage() {
        PageFactory.initElements(driver, this);
    }

    public void acessarAlertEWindow() {
        btnAlertEWindow.click();
    }

    public void acessarBrowserWindow() {

        btnBrowserWindow.click();
    }

    public void clicarNovaJanela() {

        btnNewWindow.click();
    }

    public void alternarJanelas() {
        String janelaPrincipal = driver.getWindowHandle();

        WebElement linkNovaJanela = driver.findElement(By.id("windowButton"));
        ((WebElement) linkNovaJanela).click();
        Set<String> janelas = driver.getWindowHandles();
        for (String janela : janelas) {
            if (!janela.equals(janelaPrincipal)) {
                driver.switchTo().window(janela);

                // Executar ações na nova janela
                // Validar um texto, por exemplo
                WebElement elementoNaNovaJanela = driver.findElement(By.id("sampleHeading"));
                String textoNaNovaJanela = elementoNaNovaJanela.getText();
                if (textoNaNovaJanela.equals("This is a sample page")) {
                    Assert.assertTrue(textoNaNovaJanela.equals("This is a sample page"));
                    driver.close();
                    driver.quit();
                }


            }


        }
    }
}






