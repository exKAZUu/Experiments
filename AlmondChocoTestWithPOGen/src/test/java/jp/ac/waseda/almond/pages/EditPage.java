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

public class EditPage extends AbstractPage {
  public EditPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_0']")
  private WebElement problem_dot_id_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_0']")
  private WebElement problem_dot_title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_2']")
  private WebElement problem_dot_description_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_2']")
  private WebElement TEXTAREA_description;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_3']")
  private WebElement problem_dot_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_3']")
  private WebElement TEXTAREA_input;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_4']")
  private WebElement problem_dot_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_4']")
  private WebElement TEXTAREA_output;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_5']")
  private WebElement BUTTON_Update;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_1']")
  private WebElement problem_dot_id_2;

  public WebElement getElementForProblem_dot_id_() {
    return problem_dot_id_;
  }

  public String getTextForProblem_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_0") && matcher.group(2).equals("problem_dot_id_")) {
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
      if (matcher.group(1).equals("__pogen_0") && matcher.group(2).equals("problem_dot_title_")) {
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
      if (matcher.group(1).equals("__pogen_2") && matcher.group(2).equals("problem_dot_description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForTEXTAREA_description() {
    return TEXTAREA_description;
  }

  public WebElement getElementForProblem_dot_input_() {
    return problem_dot_input_;
  }

  public String getTextForProblem_dot_input_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_3") && matcher.group(2).equals("problem_dot_input_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForTEXTAREA_input() {
    return TEXTAREA_input;
  }

  public WebElement getElementForProblem_dot_output_() {
    return problem_dot_output_;
  }

  public String getTextForProblem_dot_output_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_4") && matcher.group(2).equals("problem_dot_output_")) {
        return matcher.group(3);
      }
    }
    return null;
  }

  public WebElement getElementForTEXTAREA_output() {
    return TEXTAREA_output;
  }

  public WebElement getElementForBUTTON_Update() {
    return BUTTON_Update;
  }

  public WebElement getElementForProblem_dot_id_2() {
    return problem_dot_id_2;
  }

  public String getTextForProblem_dot_id_2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_1") && matcher.group(2).equals("problem_dot_id_")) {
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
