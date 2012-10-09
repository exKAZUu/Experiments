package jp.ac.waseda.wpcs.contests;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_37']")
  private WebElement pluralize__contest_errors_count___error___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_38']")
  private WebElement msg_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_39']")
  private WebElement f_text_field__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_39']")
  private WebElement f_label__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_40']")
  private WebElement f_datetime_select__start_time;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_40']")
  private WebElement f_label__start_time;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_41']")
  private WebElement f_label__end_time;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_41']")
  private WebElement f_datetime_select__end_time_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_42']")
  private WebElement f_label__introduction_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_42']")
  private WebElement f_text_field__introduction_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_43']")
  private WebElement f_submit_;

  public WebElement getElementForPluralize__contest_errors_count___error___() {
    return pluralize__contest_errors_count___error___;
  }

  public String getTextForPluralize__contest_errors_count___error___() {
    return pluralize__contest_errors_count___error___.getText();
  }

  public WebElement getElementForMsg_() {
    return msg_;
  }

  public String getTextForMsg_() {
    return msg_.getText();
  }

  public WebElement getElementForF_text_field__name_() {
    return f_text_field__name_;
  }

  public String getTextForF_text_field__name_() {
    return f_text_field__name_.getText();
  }

  public WebElement getElementForF_label__name_() {
    return f_label__name_;
  }

  public String getTextForF_label__name_() {
    return f_label__name_.getText();
  }

  public WebElement getElementForF_datetime_select__start_time() {
    return f_datetime_select__start_time;
  }

  public String getTextForF_datetime_select__start_time() {
    return f_datetime_select__start_time.getText();
  }

  public WebElement getElementForF_label__start_time() {
    return f_label__start_time;
  }

  public String getTextForF_label__start_time() {
    return f_label__start_time.getText();
  }

  public WebElement getElementForF_label__end_time() {
    return f_label__end_time;
  }

  public String getTextForF_label__end_time() {
    return f_label__end_time.getText();
  }

  public WebElement getElementForF_datetime_select__end_time_() {
    return f_datetime_select__end_time_;
  }

  public String getTextForF_datetime_select__end_time_() {
    return f_datetime_select__end_time_.getText();
  }

  public WebElement getElementForF_label__introduction_() {
    return f_label__introduction_;
  }

  public String getTextForF_label__introduction_() {
    return f_label__introduction_.getText();
  }

  public WebElement getElementForF_text_field__introduction_() {
    return f_text_field__introduction_;
  }

  public String getTextForF_text_field__introduction_() {
    return f_text_field__introduction_.getText();
  }

  public WebElement getElementForF_submit_() {
    return f_submit_;
  }

  public String getTextForF_submit_() {
    return f_submit_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
