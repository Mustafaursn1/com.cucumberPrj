Feature: US1011ClassWork

  @guru
  Scenario Outline: TC01_Kullanici_sutun_basligi_ile_liste_alabilmeli
    Given user goes "guruUrl"
    Then "<Basliklar>" sutunundaki tüm degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |





