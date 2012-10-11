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

public class SolvePage extends AbstractPage {
  public SolvePage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_22']")
  private WebElement problem_dot_id_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_22']")
  private WebElement problem_dot_title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_23']")
  private WebElement problem_dot_description_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_24']")
  private WebElement problem_dot_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_25']")
  private WebElement problem_dot_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_27']")
  private WebElement INPUT_output;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_27']")
  private WebElement problem_dot_output_2;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_28']")
  private WebElement SELECT_lang_lang;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_29']")
  private WebElement TEXTAREA_code;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_30']")
  private WebElement BUTTON_Submit;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_26']")
  private WebElement problem_dot_id_2;

  public WebElement getElementForProblem_dot_id_() {
    return problem_dot_id_;
  }

  public String getTextForProblem_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_22") && matcher.group(2).equals("problem_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForProblem_dot_title_() {
    return problem_dot_title_;
  }

  public String getTextForProblem_dot_title_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_22") && matcher.group(2).equals("problem_dot_title_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForProblem_dot_description_() {
    return problem_dot_description_;
  }

  public String getTextForProblem_dot_description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_23") && matcher.group(2).equals("problem_dot_description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForProblem_dot_input_() {
    return problem_dot_input_;
  }

  public String getTextForProblem_dot_input_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_24") && matcher.group(2).equals("problem_dot_input_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForProblem_dot_output_() {
    return problem_dot_output_;
  }

  public String getTextForProblem_dot_output_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_25") && matcher.group(2).equals("problem_dot_output_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForINPUT_output() {
    return INPUT_output;
  }

  public WebElement getElementForProblem_dot_output_2() {
    return problem_dot_output_2;
  }

  public String getTextForProblem_dot_output_2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_27") && matcher.group(2).equals("problem_dot_output_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public String getValueAttributeForProblem_dot_output_2() {
    return problem_dot_output_2.getAttribute("value");
  }

  public WebElement getElementForSELECT_lang_lang() {
    return SELECT_lang_lang;
  }

  public WebElement getElementForTEXTAREA_code() {
    return TEXTAREA_code;
  }

  public WebElement getElementForBUTTON_Submit() {
    return BUTTON_Submit;
  }

  public WebElement getElementForProblem_dot_id_2() {
    return problem_dot_id_2;
  }

  public String getTextForProblem_dot_id_2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_26") && matcher.group(2).equals("problem_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public String getActionAttributeForProblem_dot_id_2() {
    return problem_dot_id_2.getAttribute("action");
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
