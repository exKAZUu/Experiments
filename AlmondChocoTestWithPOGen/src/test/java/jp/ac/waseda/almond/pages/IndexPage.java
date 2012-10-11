package jp.ac.waseda.almond.pages;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexPage extends AbstractPage {
  public IndexPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->");
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_6']")
  private WebElement A_create;

  public WebElement getElementForA_create() {
    return A_create;
  }

  public List<WebElement> getElementsForProblems_i__dot_id_() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_8']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getTextsForProblems_i__dot_id_() {
    List<String> result = new ArrayList<String>();
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_8") && matcher.group(2).equals("problems_i__dot_id_")) {
        result.add(matcher.group(3));
      }
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__dot_id_() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_8']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForA_solve() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_8']"))) {
      result.add(e);
    }
    return result;
  }

  public List<WebElement> getElementsForA_edit() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_9']"))) {
      result.add(e);
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__dot_id_2() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_9']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getTextsForProblems_i__dot_id_2() {
    List<String> result = new ArrayList<String>();
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_9") && matcher.group(2).equals("problems_i__dot_id_")) {
        result.add(matcher.group(3));
      }
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__dot_id_2() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_9']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForA_delete() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_10']"))) {
      result.add(e);
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__dot_id_3() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_10']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getTextsForProblems_i__dot_id_3() {
    List<String> result = new ArrayList<String>();
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_10") && matcher.group(2).equals("problems_i__dot_id_")) {
        result.add(matcher.group(3));
      }
    }
    return result;
  }

  public List<String> getHrefAttributesForProblems_i__dot_id_3() {
    List<String> result = new ArrayList<String>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_10']"))) {
      result.add(e.getAttribute("href"));
    }
    return result;
  }

  public List<WebElement> getElementsForProblems_i__dot_title_() {
    List<WebElement> result = new ArrayList<WebElement>();
    for (WebElement e : driver.findElements(By.xpath("//*[@lang='__pogen_7']"))) {
      result.add(e);
    }
    return result;
  }

  public List<String> getTextsForProblems_i__dot_title_() {
    List<String> result = new ArrayList<String>();
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_7") && matcher.group(2).equals("problems_i__dot_title_")) {
        result.add(matcher.group(3));
      }
    }
    return result;
  }
/* -------------------- GENERATED CODE END -------------------- */
}
