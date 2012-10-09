package jp.ac.waseda.yahootest.pages;

import org.openqa.selenium.WebDriver;

public class AtFirst {
  public static YahooTopPage goTopPage(WebDriver driver) {
    driver.get("http://www.yahoo.jp");
    return new YahooTopPage(driver);
  }
}
