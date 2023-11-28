package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o site")
    public void acessarSite(){
        String ecommerceUrl = "https://demoqa.com/";
        TestRule.abrirNavegador(ecommerceUrl);
    }

}
