package jp.ac.waseda.wpcs.layouts;

import jp.ac.waseda.wpcs.AbstractPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplicationHtmlPage extends AbstractPage {
  public ApplicationHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }

  private void assertInvariant() {}

  /* ------------------- GENERATED CODE START ------------------- */
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_44']")
  private WebElement link_to__CONTESTS___contests_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_45']")
  private WebElement _current_user_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_46']")
  private WebElement _score_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_47']")
  private WebElement link_to__Logout___logout_users_path____method___POST___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_48']")
  private WebElement link_to__Sign_up___register_users_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_49']")
  private WebElement link_to__Login___login_users_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_51']")
  private WebElement notice_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_52']")
  private WebElement alert_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_50']")
  private WebElement yield_;

  public WebElement getElementForLink_to__CONTESTS___contests_path_() {
    return link_to__CONTESTS___contests_path_;
  }

  public String getTextForLink_to__CONTESTS___contests_path_() {
    return link_to__CONTESTS___contests_path_.getText();
  }

  public WebElement getElementFor_current_user_name_() {
    return _current_user_name_;
  }

  public String getTextFor_current_user_name_() {
    return _current_user_name_.getText();
  }

  public WebElement getElementFor_score_score_() {
    return _score_score_;
  }

  public String getTextFor_score_score_() {
    return _score_score_.getText();
  }

  public WebElement getElementForLink_to__Logout___logout_users_path____method___POST___() {
    return link_to__Logout___logout_users_path____method___POST___;
  }

  public String getTextForLink_to__Logout___logout_users_path____method___POST___() {
    return link_to__Logout___logout_users_path____method___POST___.getText();
  }

  public WebElement getElementForLink_to__Sign_up___register_users_path_() {
    return link_to__Sign_up___register_users_path_;
  }

  public String getTextForLink_to__Sign_up___register_users_path_() {
    return link_to__Sign_up___register_users_path_.getText();
  }

  public WebElement getElementForLink_to__Login___login_users_path_() {
    return link_to__Login___login_users_path_;
  }

  public String getTextForLink_to__Login___login_users_path_() {
    return link_to__Login___login_users_path_.getText();
  }

  public WebElement getElementForNotice_() {
    return notice_;
  }

  public String getTextForNotice_() {
    return notice_.getText();
  }

  public WebElement getElementForAlert_() {
    return alert_;
  }

  public String getTextForAlert_() {
    return alert_.getText();
  }

  public WebElement getElementForYield_() {
    return yield_;
  }

  public String getTextForYield_() {
    return yield_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
