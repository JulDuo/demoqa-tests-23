package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
    }

    @Test
    void fillFormTest () {

        open("/automation-practice-form");

        $("#firstName").setValue("Dia");
        $("#lastName").setValue("Forest");
        $("#userEmail").setValue("DiFor@gh.com");
        $("label.custom-control-label[for='gender-radio-2']").click();
        $("#userNumber").setValue("8347900987");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byValue("1994")).click();
        $(".react-datepicker__month-select").$(byText("July")).click();
        $("[aria-label='Choose Friday, July 29th, 1994']").click();

        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();

        $("#uploadPicture").uploadFromClasspath("hw1.jpg");

        $("#currentAddress").setValue("Rasskazova st 2");

        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();

        $("#submit").pressEnter();
    }
}

