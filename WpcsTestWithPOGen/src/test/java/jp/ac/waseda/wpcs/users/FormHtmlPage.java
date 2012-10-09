package jp.ac.waseda.wpcs.users;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_68']")
  private WebElement pluralize__user_errors_count___error___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_69']")
  private WebElement msg_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_70']")
  private WebElement f_text_field__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_70']")
  private WebElement f_label__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_71']")
  private WebElement f_text_field__email_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_71']")
  private WebElement f_label__email_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_72']")
  private WebElement password_field_tag__password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_72']")
  private WebElement label_tag__password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_73']")
  private WebElement f_submit_;

  public WebElement getElementForPluralize__user_errors_count___error___() {
    return pluralize__user_errors_count___error___;
  }

  public String getTextForPluralize__user_errors_count___error___() {
    return pluralize__user_errors_count___error___.getText();
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

  public WebElement getElementForF_text_field__email_() {
    return f_text_field__email_;
  }

  public String getTextForF_text_field__email_() {
    return f_text_field__email_.getText();
  }

  public WebElement getElementForF_label__email_() {
    return f_label__email_;
  }

  public String getTextForF_label__email_() {
    return f_label__email_.getText();
  }

  public WebElement getElementForPassword_field_tag__password_() {
    return password_field_tag__password_;
  }

  public String getTextForPassword_field_tag__password_() {
    return password_field_tag__password_.getText();
  }

  public WebElement getElementForLabel_tag__password_() {
    return label_tag__password_;
  }

  public String getTextForLabel_tag__password_() {
    return label_tag__password_.getText();
  }

  public WebElement getElementForF_submit_() {
    return f_submit_;
  }

  public String getTextForF_submit_() {
    return f_submit_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
