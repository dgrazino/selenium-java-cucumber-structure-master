package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.SiteMainPage;
import pages.StudentRegistrationPage;

public class SiteMainSteps {

    
    @Entao("uma janela com agradecimento deve ser exibida")
    public void umajanelacomagradecimentodeveserexibida(){
        StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();
        Assert.assertTrue("Thanks for submitting the form", studentRegistrationPage.validarSucesso());
    }

    @Quando("^preencho todo o formulario$")
    public void preenchoTodoOFormulario() {
        StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();
        studentRegistrationPage.preencherFormulario();
    }

    @E("^anexo o arquivo \"([^\"]*)\"$")
    public void anexoOArquivo(String arg0) throws Throwable {
        StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();
        studentRegistrationPage.selecionarArquivo();
        throw new PendingException();
    }

    @E("^devo clicar em close$")
    public void devoClicarEmClose() {
        StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();
        studentRegistrationPage.clicarCloseModal();

    }
}
