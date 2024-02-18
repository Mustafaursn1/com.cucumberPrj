package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"}, // Raporlama için kullanılacak eklentiler
        features = "src/test/resources/features", // Senaryo ve özellik dosyalarının bulunduğu dizin
        glue = "stepDefinitions", // Adım tanımlama sınıflarının bulunduğu paket
        tags = "@java_", // Çalıştırılacak senaryoları belirten etiketler
        //iki tag ayni anda calistirmak icin "@tag1 or @tag2 " yazariz
        dryRun = false

        //plugin = {"pretty", "html:target/cucumber-reports"} // Raporlama için kullanılacak eklentiler


)
public class TestRunner {
    // Boş bir sınıf, sadece bu sınıfı çalıştırarak senaryoları başlatabilirsiniz.

    /*
    Runner Class'1 TestNG'deki XML mantigi ile çalisir. folistirmok istedigimiz senortolara tog belirtiriz ve belirttigimiz tog'lari çalistirir. XML deki gibi istedigimiz testieri çalistirmok için kullaniriz.
Runner class body'si bostur ve runner class'in ekleyecegimiz notasyonlar aktive eder.
Bu class'do kullanacogamiz 2 adet notasyon vardir
-@RunWith(Cucumber.class) notasyonu Runner class'ina çalisma özelligi ekler.
Bu notasyon oldugu için Cucumber frameworkumuzde Junit kullanmayz tercih ederiz
-@CucumberOptions notasyonu içinde
features : Runeer dosyasinin feature dosyasini nereden bulacagani tarif eder glue : stepDefinitions yolunu belintiriz
togs : Hangi tag'i çalistirmak istiyorsak onu belli eder
dryRun :2 secenek vardir
dryRun = true; dersek testimizi çolistirmadan eksik adimlori bize verir
 dryRun = false; testlerimizi driver ile çalistzrir.
     */
}
