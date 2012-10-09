package jp.ac.waseda.wpcs.contests;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_35']")
  private WebElement _contest_name_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_36']")
  private WebElement link_to_problem_title__contest_problem_path__contest__problem__;

  public WebElement getElementFor_contest_name_() {
    return _contest_name_;
  }

  public String getTextFor_contest_name_() {
    return _contest_name_.getText();
  }

  public WebElement getElementForLink_to_problem_title__contest_problem_path__contest__problem__() {
    return link_to_problem_title__contest_problem_path__contest__problem__;
  }

  public String getTextForLink_to_problem_title__contest_problem_path__contest__problem__() {
    return link_to_problem_title__contest_problem_path__contest__problem__.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
