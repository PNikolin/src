package TestSearchGoogle;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.junit.SoftAsserts;
import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by PNikolin on 26.12.2015.
 */
public class SearchLine {
    public static SelenideElement newSearch = $("#lst-ib");

    @Rule
    // Включение профайлера выполянемых тетсов
    public TestRule report = new TextReport();
    // Проверки типа shouldhave валятся не сразу
    public SoftAsserts softAsserts = new SoftAsserts();

    @Test
    public void SearchLineGoogle(){
        OpenSearchLine();
        refresh();
        title();
        EnterText();
        AssertResultsSize();
    }

    private static void AssertResultsSize() {
        $$(".r>a").shouldHaveSize(9);
    }

    public static void EnterText() {
        $("#lst-ib").setValue("Nokia 3310").pressEnter();
    }

    public static void OpenSearchLine() {
        open("https://www.google.by/");
        newSearch.shouldBe(Condition.enabled);
    }


}
