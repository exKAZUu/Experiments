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

public class ResultPage extends AbstractPage {
  public ResultPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->");
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_21']")
  private WebElement result_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_21']")
  private WebElement ex_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_21']")
  private WebElement out_;

  public WebElement getElementForResult_() {
    return result_;
  }

  public String getTextForResult_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_21") && matcher.group(2).equals("result_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForEx_() {
    return ex_;
  }

  public String getTextForEx_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_21") && matcher.group(2).equals("ex_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForOut_() {
    return out_;
  }

  public String getTextForOut_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_21") && matcher.group(2).equals("out_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
/* -------------------- GENERATED CODE END -------------------- */
}
