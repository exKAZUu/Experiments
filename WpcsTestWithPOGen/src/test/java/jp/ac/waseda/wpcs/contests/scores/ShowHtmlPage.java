package jp.ac.waseda.wpcs.contests.scores;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_30']")
  private WebElement problem_title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_31']")
  private WebElement index___1_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_32']")
  private WebElement score_user_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_33']")
  private WebElement score_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_34']")
  private WebElement score_updated_at_;

  public WebElement getElementForProblem_title_() {
    return problem_title_;
  }

  public String getTextForProblem_title_() {
    return problem_title_.getText();
  }

  public WebElement getElementForIndex___1_() {
    return index___1_;
  }

  public String getTextForIndex___1_() {
    return index___1_.getText();
  }

  public WebElement getElementForScore_user_name_() {
    return score_user_name_;
  }

  public String getTextForScore_user_name_() {
    return score_user_name_.getText();
  }

  public WebElement getElementForScore_score_() {
    return score_score_;
  }

  public String getTextForScore_score_() {
    return score_score_.getText();
  }

  public WebElement getElementForScore_updated_at_() {
    return score_updated_at_;
  }

  public String getTextForScore_updated_at_() {
    return score_updated_at_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
