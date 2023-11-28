package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import static util.TestRule.*;


public class StudentRegistrationPage extends StudentRegistrationElementMap {

    public StudentRegistrationPage(){
        PageFactory.initElements(util.TestRule.getDriver(), this);
    }

    public void getData() {
        WebDriverWait wait = new WebDriverWait(util.TestRule.getDriver(), 100);
        txtDateBirth.click();
        // Localizar elementos para dias, meses e anos
        List<WebElement> weekElements = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]")); // Substitua pelo seu localizador de semanas

        // Selecionar uma data específica (substitua os valores pelos desejados)
        String selectedDay = "11";
        String selectedMonth = "August";
        String selectedYear = "1982";

        boolean dataEncontrada = false;

        // Localizar e selecionar o mês
        WebElement monthDropdown = driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select")); // Substitua pelo seu localizador de mês
        monthDropdown.sendKeys(selectedMonth);

        // Localizar e selecionar o ano
        WebElement yearDropdown = driver.findElement(By.cssSelector(".react-datepicker__year-select")); // Substitua pelo seu localizador de ano
        yearDropdown.sendKeys(selectedYear);

        // Percorrer semanas
        for (WebElement weekElement : weekElements) {
            List<WebElement> dayElements = weekElement.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]")); // Substitua pelo seu localizador de dias

            // Percorrer dias
            for (WebElement dayElement : dayElements) {
                dayElement = driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__month > div:nth-child(2) > div.react-datepicker__day.react-datepicker__day--011"));
                    // Encontrou o dia desejado, clique nele
                    dayElement.click();
                    dataEncontrada = true;
                    break;

            }

            if (dataEncontrada) {
                // Se a data foi encontrada, não há necessidade de continuar procurando
                break;
            }
        }


    }


    public void waitElement(WebElement element){

        WebDriverWait wait = new WebDriverWait(util.TestRule.getDriver(), 50);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selecionarArquivo(){

        WebElement inputFile = btnEscolherFicheiro;
        ((WebElement) inputFile).sendKeys("C:\\Users\\diego\\OneDrive\\Área de Trabalho\\test.txt");

    }

    public void clicarCloseModal(){
        WebElement closeModalButton = driver.findElement(By.id("closeLargeModal"));
        closeModalButton.click();

    }

    public boolean validarSucesso() {
        WebElement element = driver.findElement(By.id("example-modal-sizes-title-lg"));
        waitElement(element);
        if (element.getText().equals("Thanks for submitting the form")) {
            return true;


        }
        clicarCloseModal();

        return false;
    }

    public void preencherFormulario(){
        btnForms.click();
        waitElement(btnPracticeForm);
        btnPracticeForm.click();
        waitElement(txtNome);
        txtNome.sendKeys("Diego");
        txtSobreNome.sendKeys("Grazino");
        txtEmail.sendKeys("teste@teste.com");
        WebElement parentElement = driver.findElement(By.id("gender-radio-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(parentElement).click().perform();
        waitElement(txtNumeroCelular);
        txtNumeroCelular.sendKeys("11999999999");
        getData();
        waitElement(txtSubjects);
          txtSubjects.sendKeys("Co");
        txtSubjects.sendKeys(Keys.RETURN);
        txtSubjects.sendKeys(Keys.TAB);

        txtCurrentAddress.sendKeys("Rua Joao de Tal 2000");
        btnSubmit.click();




    }



}