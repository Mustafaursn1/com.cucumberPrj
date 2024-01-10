package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Senaryo ve özellik dosyalarının bulunduğu dizin
        glue = "stepDefinitions", // Adım tanımlama sınıflarının bulunduğu paket
        tags = "@facebookLogin", // Çalıştırılacak senaryoları belirten etiketler

        plugin = {"pretty", "html:target/cucumber-reports"} // Raporlama için kullanılacak eklentiler

)
public class TestRunnerFacebook {
    // Boş bir sınıf, sadece bu sınıfı çalıştırarak senaryoları başlatabilirsiniz.
}
