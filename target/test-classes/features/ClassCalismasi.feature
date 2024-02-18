Feature: Class Calismasi

  @dataBase
  Scenario Outline:

    Given Kullanici "https://editor.datables.net"
    Then new butonuno basar
    And isim bolumune "<firstName>" girer
    And  User waits 2 moments
    And soyisim bolumune"<lastName>" girer
    And  User waits 2 moments
    And position bolumune "<position>" girer
    And  User waits 2 moments
    And ofis bilgisi "<ofisBilgisi>" girilir
    And  User waits 2 moments
    And extension bolumune "<extension>" girer
    And  User waits 2 moments
    And startdate bolume "<startDate>" girer
    And  User waits 2 moments
    And salary bolumune "<salary>" girer
    And  User waits 2 moments
    And creat butonuna tiklar
    And  User waits 2 moments
    When Kullanici "<firstName>" ile arama yapar
    And  User waits 2 moments
    Then isim bolumunde "<firstName>" oldugunu dogrulur
    Examples:
      | firstName | lastName | position | ofisBilgisi | extension | startDate  | salary |

      | Tom       | Muller   | QA       | Google      | Senior    | 2022-01-12 | 15000  |
      | Hans      | Henry    | Dev      | Otto        | Junior    | 2021-07-02 | 25000  |
      | Jonas     | Muller   | PO       | Zalando     | Principle | 2015-06-01 | 30000  |
      | Tiago     | Staufty  | BA       | Amazon      | Senior    | 2018-05-07 | 19740  |
      | Manuel    | Olero    | Support  | eBay        | Senior    | 2011-12-11 | 14444  |

