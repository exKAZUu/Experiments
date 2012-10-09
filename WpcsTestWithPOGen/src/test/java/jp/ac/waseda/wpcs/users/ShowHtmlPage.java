package jp.ac.waseda.wpcs.users;

import jp.ac.waseda.wpcs.layouts.ApplicationHtmlPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShowHtmlPage extends ApplicationHtmlPage {
  public ShowHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {}

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_63']")
  private WebElement _user_id_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_64']")
  private WebElement _user_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_65']")
  private WebElement _user_email_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_66']")
  private WebElement _user_encrypted_password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_67']")
  private WebElement _user_created_at_;

  public WebElement getElementFor_user_id_() {
    return _user_id_;
  }

  public String getTextFor_user_id_() {
    return _user_id_.getText();
  }

  public WebElement getElementFor_user_name_() {
    return _user_name_;
  }

  public String getTextFor_user_name_() {
    return _user_name_.getText();
  }

  public WebElement getElementFor_user_email_() {
    return _user_email_;
  }

  public String getTextFor_user_email_() {
    return _user_email_.getText();
  }

  public WebElement getElementFor_user_encrypted_password_() {
    return _user_encrypted_password_;
  }

  public String getTextFor_user_encrypted_password_() {
    return _user_encrypted_password_.getText();
  }

  public WebElement getElementFor_user_created_at_() {
    return _user_created_at_;
  }

  public String getTextFor_user_created_at_() {
    return _user_created_at_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
