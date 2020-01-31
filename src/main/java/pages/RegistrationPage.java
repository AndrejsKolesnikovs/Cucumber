package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    private SelenideElement userName = $(By.cssSelector("#main-reg-form > div.wrapped-block.my-data > div.inner > div.left > div.input-wrapper.row.cf.mandatory.First_Name > input"));
    private SelenideElement userSurname = $(By.cssSelector("#main-reg-form > div.wrapped-block.my-data > div.inner > div.left > div.input-wrapper.row.cf.mandatory.Last_Name > input"));
    private SelenideElement personalCode = $(By.cssSelector("#main-reg-form > div.wrapped-block.my-data > div.inner > div.left > div.input-wrapper.row.cf.mandatory.Personal_No > input"));

    public void inputName(String text) {
        this.userName.val(text);
    }

    public void inputSurname(String text) {
        this.userSurname.val(text);
    }

    public void inputPersonal(String text) {
        this.personalCode.val(text);
    }
}
