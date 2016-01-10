package TestSearchGoogle;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import static TestSearchGoogle.SearchLine.OpenSearchLine;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by PNikolin on 26.12.2015.
 */
public class TestClass {

    // Включение профайлера выполянемых тетсов
    @Rule
    public TestRule report = new TextReport();

    // Тесты
    @Test
    public void Test() {
        open("http://google.by");
        $("#hplogo").exists();
        $("#lst-ib").setValue("nokia 3310");
        $(".lsb").click();
        sleep(5000);
        $("#lst-ib").setValue("nokia 6100");
        $(".lsb").click();
        screenshot("testScreenshot");

    }
}