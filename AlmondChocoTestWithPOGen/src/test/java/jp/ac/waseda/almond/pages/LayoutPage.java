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

public class LayoutPage extends AbstractPage {
  public LayoutPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->");
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_11']")
  private WebElement title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_12']")
  private WebElement A_Almond_Choco;

  public WebElement getElementForTitle_() {
    return title_;
  }

  public String getTextForTitle_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_11") && matcher.group(2).equals("title_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForA_Almond_Choco() {
    return A_Almond_Choco;
  }
/* -------------------- GENERATED CODE END -------------------- */
}
