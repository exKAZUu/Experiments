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

public class NewPage extends AbstractPage {
  public NewPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->");
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_16']")
  private WebElement INPUT_title;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_17']")
  private WebElement TEXTAREA_description;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_18']")
  private WebElement TEXTAREA_input;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_19']")
  private WebElement TEXTAREA_output;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_20']")
  private WebElement BUTTON_submit;

  public WebElement getElementForINPUT_title() {
    return INPUT_title;
  }

  public WebElement getElementForTEXTAREA_description() {
    return TEXTAREA_description;
  }

  public WebElement getElementForTEXTAREA_input() {
    return TEXTAREA_input;
  }

  public WebElement getElementForTEXTAREA_output() {
    return TEXTAREA_output;
  }

  public WebElement getElementForBUTTON_submit() {
    return BUTTON_submit;
  }
/* -------------------- GENERATED CODE END -------------------- */
}
