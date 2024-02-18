package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPages;
import utilities.Driver;

import java.util.List;

public class GuruStepdefs {
    GuruPages guruPages = new GuruPages();

    @Then("{string} sutunundaki tüm degerleri yazdirir")
    public void sutunundakiTümDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i < guruPages.heads.size(); i++) {
            if (guruPages.heads.get(i).getText().equals(baslik)) {
                System.out.println(guruPages.heads.get(i).getText());
                index = i + 1;
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + index + "]"));


                sutunElement.forEach(t -> System.out.println(t.getText()));

               /*
               for (WebElement w : sutunElement) {

                    System.out.println(w.getText());
            }
                */


            }

        }


    }
}
