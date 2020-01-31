package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;

public class RegistrationPageDef {

    RegistrationPage registrationPage = new RegistrationPage();

    @Then("Input name")
    public void inputName() {
        registrationPage.inputName(UserConfig.USER_NAME);
    }

    @Then("Input surname")
    public void inputSurname() {
        registrationPage.inputSurname(UserConfig.USER_SURNAME);
    }

    @Then("Input PESEL")
    public void inputPESEL() {
        registrationPage.inputPersonal(UserConfig.USER_PESEL);
    }
}
