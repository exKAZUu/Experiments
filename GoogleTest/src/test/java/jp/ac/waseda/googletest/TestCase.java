package jp.ac.waseda.googletest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {
  private FirefoxDriver driver;

  @Before
  public void before() {
    driver = new FirefoxDriver();
  }

  @After
  public void after() {
    // driver.close();
  }

  @Test
  public void search() {
    // 指定したURLを開く
    driver.get("https://www.google.co.jp/");
    WebElement textBox = driver.findElement(By.name("q"));
    textBox.sendKeys("検索");
    textBox.submit();
  }
}
