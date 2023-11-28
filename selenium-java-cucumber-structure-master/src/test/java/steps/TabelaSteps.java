package steps;


import cucumber.api.PendingException;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.NovaJanelaPage;
import pages.TabelaPage;

public class TabelaSteps {




    @Então("^Valido o numero de registros da minha tabela$")
    public void validoONumeroDeRegistrosDaMinhaTabela() {
    }

    @Quando("^insiro todos os registros na tabela: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void insiroTodosOsRegistrosNaTabela(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        TabelaPage tabelaPage = new TabelaPage();
        tabelaPage.clicarElement();
        tabelaPage.clicarWebTables();
        tabelaPage.criarNovosRegitros(arg0, arg1, arg2, arg3, arg4, arg5);
        throw new PendingException();
    }
}

