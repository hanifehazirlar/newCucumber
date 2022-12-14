@US009
Feature: US_009 Staff (Personel),
  hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.

  Background: Sing in
    Given HH Personel "medunnaUrl" e gider
    And HH Personel sayfanin sag ust  kosesindeki drop down a tiklar
    And HH Personel Sing in segmesine tiklar
    And HH Personel  Username box a gecerli "hanifepersonelusername"  girer
    And HH Personel Password box a gecerli "hanifepersonelpassword" girer
    And HH Personel  giris yapmak uzere Sign in butonuna  tiklar
    And HH Personel MY PAGES sekmesine tiklar
    And HH Personel Search Patient sekmesine tiklar
    And HH Personel Patient SSN box a hasta SSN'ini girer

    Scenario: TC_001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.

    Then HH Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular
    When HH Kullanici cookies i siler
    And HH Kullanci browser i kapatir




