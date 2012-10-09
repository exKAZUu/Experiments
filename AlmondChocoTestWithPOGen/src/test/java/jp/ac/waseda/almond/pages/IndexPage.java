package jp.ac.waseda.almond.pages;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class IndexPage extends AbstractPage {
  public IndexPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */

  public List<WebElement> getElementsForProblems_i__id_() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_6']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__id_() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_6']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__id_2() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_7']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__id_2() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_7']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__id_3() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_8']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__id_3() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_8']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__title_() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_5']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getTextsForProblems_i__title_() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_5']"))) {
      result.add(e.getText());
    }
    return result;
  }
/* -------------------- GENERATED CODE END -------------------- */
}
