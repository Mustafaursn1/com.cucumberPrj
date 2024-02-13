package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Senaryo ve özellik dosyalarının bulunduğu dizin
        glue = "stepDefinitions", // Adım tanımlama sınıflarının bulunduğu paket
        tags = "@amazonSearch", // Çalıştırılacak senaryoları belirten etiketler

        plugin = {"pretty", "html:target/cucumber-reports"} // Raporlama için kullanılacak eklentiler

)
public class TestRunnerAmazon {
    // Boş bir sınıf, sadece bu sınıfı çalıştırarak senaryoları başlatabilirsiniz.
}
