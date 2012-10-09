package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import jp.ac.waseda.almond.pages.IndexPage;
import jp.ac.waseda.almond.pages.SolvePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
    IndexPage page = new IndexPage(driver);
    List<WebElement> es = page.getElementsForProblems_i__id_();
    for (WebElement e : es) {
      assertEquals("solve", e.getText());
    }
    es.get(0).click();

    SolvePage solvePage = new SolvePage(driver);
    WebElement title = solvePage.getElementForProblem_title_();
    String idAndTitleText = title.getText();
    String titleText = idAndTitleText.split(" - ")[1];
    assertEquals("piyo", titleText);
  }
}
