package jp.ac.waseda.wpcs.users;

import jp.ac.waseda.wpcs.layouts.ApplicationHtmlPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFormHtmlPage extends ApplicationHtmlPage {
  public LoginFormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {}

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_74']")
  private WebElement label_tag__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_74']")
  private WebElement text_field_tag__name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_75']")
  private WebElement password_field_tag__password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_75']")
  private WebElement label_tag__password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_76']")
  private WebElement submit_tag__login_;

  public WebElement getElementForLabel_tag__name_() {
    return label_tag__name_;
  }

  public String getTextForLabel_tag__name_() {
    return label_tag__name_.getText();
  }

  public WebElement getElementForText_field_tag__name_() {
    return text_field_tag__name_;
  }

  public String getTextForText_field_tag__name_() {
    return text_field_tag__name_.getText();
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

  public WebElement getElementForSubmit_tag__login_() {
    return submit_tag__login_;
  }

  public String getTextForSubmit_tag__login_() {
    return submit_tag__login_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
