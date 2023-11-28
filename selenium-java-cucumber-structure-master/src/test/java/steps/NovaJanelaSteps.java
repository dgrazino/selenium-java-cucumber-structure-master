package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.NovaJanelaPage;

public class NovaJanelaSteps {

    @Quando("^clico no botão nova janela$")
    public void cliconobotãonovajanela() {
        NovaJanelaPage novaJanelaPage = new NovaJanelaPage();
        novaJanelaPage.acessarAlertEWindow();
        novaJanelaPage.acessarBrowserWindow();
    }


    @Entao("^valido que uma nova janela foi aberta$")
    public void validoQueUmaNovaJanelaFoiAberta() {
        NovaJanelaPage novaJanelaPage = new NovaJanelaPage();
        novaJanelaPage.alternarJanelas();
    }
}
