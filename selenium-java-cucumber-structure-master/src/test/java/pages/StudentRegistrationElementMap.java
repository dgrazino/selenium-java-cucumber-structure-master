package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentRegistrationElementMap {

    @FindBy(id = "firstName")
    protected WebElement txtNome;

    @FindBy(id = "lastName")
    protected WebElement txtSobreNome;

    @FindBy(id = "userEmail")
    protected WebElement txtEmail;

    @FindBy(id = "gender-radio-1")
    protected WebElement rdbGeneroMasculino;

    @FindBy(id = "gender-radio-2")
    protected WebElement rdbGeneroFeminino;

    @FindBy(id = "gender-radio-3")
    protected WebElement rdbGeneroOutro;

    @FindBy(id = "userNumber")
    protected WebElement txtNumeroCelular;

    @FindBy(id = "dateOfBirthInput")
    protected WebElement txtDateBirth;

    @FindBy(css = "#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header")
    protected WebElement txtDatePicker;

    @FindBy(id = "subjectsInput")
    protected WebElement txtSubjects;

    @FindBy(id = "hobbies-checkbox-1")
    protected WebElement chkHobbiesSports;

    @FindBy(id = "hobbies-checkbox-2")
    protected WebElement chkHobbiesReading;

    @FindBy(id = "hobbies-checkbox-3")
    protected WebElement chkHobbiesMusic;

    @FindBy(id = "uploadPicture")
    protected WebElement btnEscolherFicheiro;

    @FindBy(id = "currentAddress")
    protected WebElement txtCurrentAddress;

    @FindBy(css = "#state > div > div.css-1hwfws3")
    protected WebElement txtState;

    @FindBy(id = "example-modal-sizes-title-lg")
    protected WebElement txtThanks;

    @FindBy(id = "city")
    protected WebElement txtCity;

    @FindBy(id = "submit")
    protected WebElement btnSubmit;


    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(2)")
    protected WebElement btnForms;

    @FindBy(css = "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > div")
    protected WebElement btnPracticeForm;

    @FindBy(id = "closeLargeModal")
    protected WebElement btnClose;


}
