package jp.ac.waseda.yahootest;

import jp.ac.waseda.yahootest.pages.AtFirst;
import jp.ac.waseda.yahootest.pages.YahooTopPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase {
  private FirefoxDriver driver;

  @Before
  public void before() {
    driver = new FirefoxDriver();
  }

  @After
  public void after() {
    driver.close();
  }

  @Test
  public void test() {
    YahooTopPage page = AtFirst.goTopPage(driver);
    page.goSearchPage("test");
  }
}
