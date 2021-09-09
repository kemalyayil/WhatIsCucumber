Feature: Filling out a form in Selenium Easy

  Scenario Outline:
    Given Navigate to Selenium Easy
    When  User enter a valid information regarding "<firstName>" "<lastName>" "<email>" "<phone>" "<address>" "<city>" "<state>" "<zip>" "<website>" "<hosting>" "<description>"
    Then User can click "<sendButton>" and receive the success message

    Examples:
      | firstName | lastName | email        | phone      | address       | city  | state    | zip  | website       | hosting | description                           | sendButton           |
      | Ali       | Bilir    | ali@kk.com   | 1234567890 | ttlslmsp      | Agri  | Iowa     | 1000 | www.ali.com   | No      | No needed anykinda places             | Successfully created |
      | Hakki     | Gorur    | hakki@pp.com | 1234567890 | tuehoasonsbnp | Corum | Georgia  | 2000 | www.hakki.com | Yes     | I need a place for a family           | Successfully created |
      | Aliye     | Koca     | aliye@uu.com | 1234560090 | jsagfslmsp    | Izmir | Colorado | 3000 | www.aliye.com | Yes     | Masaj salonunuz var mi onu soracaktim | Successfully created |