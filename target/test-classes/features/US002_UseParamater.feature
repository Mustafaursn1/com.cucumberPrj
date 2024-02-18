@paramater
Feature: US002 Parametre Kullanimi

  Background: Common steps
    Given user goes  to Amazon

  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then user search "selenium" by Amazon
    And User check the result of the result if that inclueds "selenium"
    And user closes the Amazon

    #Feature dosyasinda  parametreli arama yaptigimizda "" icindeki string degeri stepDefs bir kere parametreli method
  #olusturur ve yeni bir arama yapmak istedigimizde tekrar meth. olusturmadan ""
  # string ifadeyi degistirmemiz yeterli olur.Dinamik bir cod yazmis oluruz
@java_
  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then user search "Java" by Amazon
    And User check the result of the result if that inclueds "Java"
    And user closes the Amazon
