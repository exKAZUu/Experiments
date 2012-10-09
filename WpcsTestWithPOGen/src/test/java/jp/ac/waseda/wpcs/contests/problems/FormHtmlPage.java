package jp.ac.waseda.wpcs.contests.problems;

import jp.ac.waseda.wpcs.layouts.ApplicationHtmlPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormHtmlPage extends ApplicationHtmlPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {}

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_19']")
  private WebElement pluralize__problem_errors_count___error___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_20']")
  private WebElement msg_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_21']")
  private WebElement f_text_field__title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_21']")
  private WebElement f_label__title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_22']")
  private WebElement f_text_field__content_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_22']")
  private WebElement f_label__content_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_23']")
  private WebElement f_text_area__small_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_23']")
  private WebElement f_label__small_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_24']")
  private WebElement f_label__small_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_24']")
  private WebElement f_text_area__small_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_25']")
  private WebElement f_text_field__small_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_25']")
  private WebElement f_label__small_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_26']")
  private WebElement f_text_area__large_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_26']")
  private WebElement f_label__large_input_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_27']")
  private WebElement f_label__large_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_27']")
  private WebElement f_text_area__large_output_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_28']")
  private WebElement f_text_field__large_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_28']")
  private WebElement f_label__large_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_29']")
  private WebElement f_submit_;

  public WebElement getElementForPluralize__problem_errors_count___error___() {
    return pluralize__problem_errors_count___error___;
  }

  public String getTextForPluralize__problem_errors_count___error___() {
    return pluralize__problem_errors_count___error___.getText();
  }

  public WebElement getElementForMsg_() {
    return msg_;
  }

  public String getTextForMsg_() {
    return msg_.getText();
  }

  public WebElement getElementForF_text_field__title_() {
    return f_text_field__title_;
  }

  public String getTextForF_text_field__title_() {
    return f_text_field__title_.getText();
  }

  public WebElement getElementForF_label__title_() {
    return f_label__title_;
  }

  public String getTextForF_label__title_() {
    return f_label__title_.getText();
  }

  public WebElement getElementForF_text_field__content_path_() {
    return f_text_field__content_path_;
  }

  public String getTextForF_text_field__content_path_() {
    return f_text_field__content_path_.getText();
  }

  public WebElement getElementForF_label__content_path_() {
    return f_label__content_path_;
  }

  public String getTextForF_label__content_path_() {
    return f_label__content_path_.getText();
  }

  public WebElement getElementForF_text_area__small_input_() {
    return f_text_area__small_input_;
  }

  public String getTextForF_text_area__small_input_() {
    return f_text_area__small_input_.getText();
  }

  public WebElement getElementForF_label__small_input_() {
    return f_label__small_input_;
  }

  public String getTextForF_label__small_input_() {
    return f_label__small_input_.getText();
  }

  public WebElement getElementForF_label__small_output_() {
    return f_label__small_output_;
  }

  public String getTextForF_label__small_output_() {
    return f_label__small_output_.getText();
  }

  public WebElement getElementForF_text_area__small_output_() {
    return f_text_area__small_output_;
  }

  public String getTextForF_text_area__small_output_() {
    return f_text_area__small_output_.getText();
  }

  public WebElement getElementForF_text_field__small_score_() {
    return f_text_field__small_score_;
  }

  public String getTextForF_text_field__small_score_() {
    return f_text_field__small_score_.getText();
  }

  public WebElement getElementForF_label__small_score_() {
    return f_label__small_score_;
  }

  public String getTextForF_label__small_score_() {
    return f_label__small_score_.getText();
  }

  public WebElement getElementForF_text_area__large_input_() {
    return f_text_area__large_input_;
  }

  public String getTextForF_text_area__large_input_() {
    return f_text_area__large_input_.getText();
  }

  public WebElement getElementForF_label__large_input_() {
    return f_label__large_input_;
  }

  public String getTextForF_label__large_input_() {
    return f_label__large_input_.getText();
  }

  public WebElement getElementForF_label__large_output_() {
    return f_label__large_output_;
  }

  public String getTextForF_label__large_output_() {
    return f_label__large_output_.getText();
  }

  public WebElement getElementForF_text_area__large_output_() {
    return f_text_area__large_output_;
  }

  public String getTextForF_text_area__large_output_() {
    return f_text_area__large_output_.getText();
  }

  public WebElement getElementForF_text_field__large_score_() {
    return f_text_field__large_score_;
  }

  public String getTextForF_text_field__large_score_() {
    return f_text_field__large_score_.getText();
  }

  public WebElement getElementForF_label__large_score_() {
    return f_label__large_score_;
  }

  public String getTextForF_label__large_score_() {
    return f_label__large_score_.getText();
  }

  public WebElement getElementForF_submit_() {
    return f_submit_;
  }

  public String getTextForF_submit_() {
    return f_submit_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
