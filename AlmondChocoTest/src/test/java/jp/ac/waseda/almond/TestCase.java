package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

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
    driver.get("http://almond-choco.herokuapp.com/");
  }

  @After
  public void after() {
    // driver.close();
  }

  @Test
  public void test() {
    {
      List<WebElement> es = driver.findElements(By.cssSelector("ul > li > a"));
      int i = 0;
      for (WebElement e : es) {
        if (i++ % 3 == 0) {
          assertEquals(e.getText(), "solve");
        }
      }
      es.get(0).click();
    }
  }

  @Test
  public void test2() {
    List<WebElement> es = driver.findElements(By.cssSelector("ul > li > a"));
    int i = 0;
    for (WebElement e : es) {
      if (i % 3 == 1) {
        assertEquals(e.getText(), "edit");
      } else if (i % 3 == 2) {
        assertEquals(e.getText(), "delete");
      }
      i++;
    }
  }

  @Test
  public void titleTest() {
    WebElement e = driver.findElement(By.cssSelector("h1"));

    assertEquals(e.getText(), "Almond Choco");
    e.click();

    e = driver.findElement(By.cssSelector("h1"));
    assertEquals(e.getText(), "Almond Choco");
  }

  @Test
  public void submitTest() {
    WebElement title = driver.findElement(By.cssSelector("input"));
    WebElement button = driver.findElement(By.cssSelector("button"));

    title.sendKeys("hoge");
    button.click();
  }
}
