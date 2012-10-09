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

public class SolvePage extends AbstractPage {
  public SolvePage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {
  }

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_10']")
  private WebElement problem_id_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_10']")
  private WebElement problem_title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_11']")
  private WebElement problem_description_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_12']")
  private WebElement problem_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_13']")
  private WebElement problem_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_15']")
  private WebElement problem_output_2;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_14']")
  private WebElement problem_id_2;

  public WebElement getElementForProblem_id_() {
    return problem_id_;
  }

  public String getTextForProblem_id_() {
    return problem_id_.getText();
  }

  public WebElement getElementForProblem_title_() {
    return problem_title_;
  }

  public String getTextForProblem_title_() {
    return problem_title_.getText();
  }

  public WebElement getElementForProblem_description_() {
    return problem_description_;
  }

  public String getTextForProblem_description_() {
    return problem_description_.getText();
  }

  public WebElement getElementForProblem_input_() {
    return problem_input_;
  }

  public String getTextForProblem_input_() {
    return problem_input_.getText();
  }

  public WebElement getElementForProblem_output_() {
    return problem_output_;
  }

  public String getTextForProblem_output_() {
    return problem_output_.getText();
  }

  public WebElement getElementForProblem_output_2() {
    return problem_output_2;
  }

  public String getValueAttributeForProblem_output_2() {
    return problem_output_2.getAttribute("value");
  }

  public WebElement getElementForProblem_id_2() {
    return problem_id_2;
  }

  public String getActionAttributeForProblem_id_2() {
    return problem_id_2.getAttribute("action");
  }
/* -------------------- GENERATED CODE END -------------------- */
}
