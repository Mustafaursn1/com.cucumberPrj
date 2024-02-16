Feature: US006_User searches by amazon what he wants artikels

  Scenario Outline: TC01_User searches by amazon what he wants artikels

    Given user goes  to Amazon
    Then user search "<wantedArtikels>" by Amazon
    And User waits 3 moments
    And User check the result of the result if that inclueds "<wantedArtikels>"
    And  user closes the Amazon
    Examples:
      | wantedArtikels | wantedArtikels |
      | Nutella        | Nutella        |
      | Selenium       | Selenium       |
      | Iphone         | Iphone         |
      | Samsung        | Samsung        |
# TestNG deki dataProvider kullonimindaki gibi Cucumberda da Scenario Outline kulloniriz.
#Bu sekilde birden fozla kelimeyi tek seferde aratobiliriz
# Feature dosyasindo yazdigimiz komutta eger "" (Tarnak) kullonirsok stepDefinition do parametreia
# bir method lusturur. Ve artik stepDefinition'1 kullanmadon Feature dosyasinda "'(tirnak) icindeki
# string'i degistirerek istedigim kelimeyi orotobilirim.
# Scenario Outline da ise yine ""(Tirnak) icinde birden fozla kelime araticoksom "<>" seklindeki kullonim ile
#"<>" icine yazdigim herhangi bir kelimeyi Scenario Outline'in asagida olusturdugu Examples altinda aratmak
# istedigim kelimeteri yazar ve sirasyla aratobiliriz