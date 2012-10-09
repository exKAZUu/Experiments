package jp.ac.waseda.wpcs.users;

import jp.ac.waseda.wpcs.layouts.ApplicationHtmlPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IndexHtmlPage extends ApplicationHtmlPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {}

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_53']")
  private WebElement _user_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_54']")
  private WebElement user_id_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_55']")
  private WebElement user_is_admin_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_56']")
  private WebElement user_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_57']")
  private WebElement user_email_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_58']")
  private WebElement user_encrypted_password_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_59']")
  private WebElement user_salt_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_60']")
  private WebElement link_to__Show___user_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_61']")
  private WebElement link_to__Edit___edit_user_path_user__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_62']")
  private WebElement link_to__Destroy___user__confirm___Are_you_sure____method___delete_;

  public WebElement getElementFor_user_name_() {
    return _user_name_;
  }

  public String getTextFor_user_name_() {
    return _user_name_.getText();
  }

  public WebElement getElementForUser_id_() {
    return user_id_;
  }

  public String getTextForUser_id_() {
    return user_id_.getText();
  }

  public WebElement getElementForUser_is_admin_() {
    return user_is_admin_;
  }

  public String getTextForUser_is_admin_() {
    return user_is_admin_.getText();
  }

  public WebElement getElementForUser_name_() {
    return user_name_;
  }

  public String getTextForUser_name_() {
    return user_name_.getText();
  }

  public WebElement getElementForUser_email_() {
    return user_email_;
  }

  public String getTextForUser_email_() {
    return user_email_.getText();
  }

  public WebElement getElementForUser_encrypted_password_() {
    return user_encrypted_password_;
  }

  public String getTextForUser_encrypted_password_() {
    return user_encrypted_password_.getText();
  }

  public WebElement getElementForUser_salt_() {
    return user_salt_;
  }

  public String getTextForUser_salt_() {
    return user_salt_.getText();
  }

  public WebElement getElementForLink_to__Show___user_() {
    return link_to__Show___user_;
  }

  public String getTextForLink_to__Show___user_() {
    return link_to__Show___user_.getText();
  }

  public WebElement getElementForLink_to__Edit___edit_user_path_user__() {
    return link_to__Edit___edit_user_path_user__;
  }

  public String getTextForLink_to__Edit___edit_user_path_user__() {
    return link_to__Edit___edit_user_path_user__.getText();
  }

  public WebElement getElementForLink_to__Destroy___user__confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___user__confirm___Are_you_sure____method___delete_;
  }

  public String getTextForLink_to__Destroy___user__confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___user__confirm___Are_you_sure____method___delete_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
