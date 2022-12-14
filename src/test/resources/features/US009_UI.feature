@US009
Feature: US_009 Staff (Personel),
  hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.

  Background: Sing in
    Given HH Personel "medunnaUrl" e gider
    And HH Personel sayfanin sag ust  kosesindeki drop down a tiklar
    And HH Personel Sing in segmesine tiklar
    And HH Personel  Username box a gecerli "HHstaffusername"  girer
    And HH Personel Password box a gecerli "HHstaffpassword" girer
    And HH Personel  giris yapmak uzere Sign in butonuna  tiklar
    And HH Personel MY PAGES sekmesine tiklar
    And HH Personel Search Patient sekmesine tiklar
@US009TC001
  Scenario: TC_001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    Then HH Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular
    And HH Personel sayfayi kapatir
  @US009TC003
  Scenario:TC_003 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve
  tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    And HH Personel Patient SSN box a tiklar ve hasta SSN I girer
    And HH Personel hasta bilgilerinin dolduruldugunu dogrular
    And HH Personel sayfayi kapatir





