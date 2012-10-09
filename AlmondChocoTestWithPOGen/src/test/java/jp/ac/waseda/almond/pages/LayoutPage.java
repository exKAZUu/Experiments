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

public class LayoutPage extends AbstractPage {
  public LayoutPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_9']")
  private WebElement title_;

  public WebElement getElementForTitle_() {
    return title_;
  }

  public String getTextForTitle_() {
    return title_.getText();
  }
/* -------------------- GENERATED CODE END -------------------- */
}
