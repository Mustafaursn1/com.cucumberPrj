Feature:US004_UseParameter
  Scenario: TC01_Paremetre ve configReader birlikte kullanimi
    #configReader kullanmadaan bu sekilde hata yokmus gibi görünmesine ragmen stepdef ` de bunun icin ayrica meth olusturulmali
    Given user goes "https://hepsiburda.com".
    When user checks that if "hepsi" includes currentUrl
    Then User waits 5 moments
    And user closes the "hepsi"