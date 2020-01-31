package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButton(String text) {
        $(By.xpath("//div[@class=\"info-summary table full-width for-wide\"]/div/div/button")).click();
    }
}