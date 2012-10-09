package jp.ac.waseda.wpcs.contests;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_0']")
  private WebElement link_to_contest_name__contest_problems_path_contest__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_1']")
  private WebElement contest_introduction_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_2']")
  private WebElement format_date_contest_end_time__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_2']")
  private WebElement format_date_contest_start_time__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_3']")
  private WebElement link_to__Edit___edit_contest_path_contest__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_4']")
  private WebElement link_to__Destroy___contest__confirm___Are_you_sure____method___delete_;

  public WebElement getElementForLink_to_contest_name__contest_problems_path_contest__() {
    return link_to_contest_name__contest_problems_path_contest__;
  }

  public String getTextForLink_to_contest_name__contest_problems_path_contest__() {
    return link_to_contest_name__contest_problems_path_contest__.getText();
  }

  public WebElement getElementForContest_introduction_() {
    return contest_introduction_;
  }

  public String getTextForContest_introduction_() {
    return contest_introduction_.getText();
  }

  public WebElement getElementForFormat_date_contest_end_time__() {
    return format_date_contest_end_time__;
  }

  public String getTextForFormat_date_contest_end_time__() {
    return format_date_contest_end_time__.getText();
  }

  public WebElement getElementForFormat_date_contest_start_time__() {
    return format_date_contest_start_time__;
  }

  public String getTextForFormat_date_contest_start_time__() {
    return format_date_contest_start_time__.getText();
  }

  public WebElement getElementForLink_to__Edit___edit_contest_path_contest__() {
    return link_to__Edit___edit_contest_path_contest__;
  }

  public String getTextForLink_to__Edit___edit_contest_path_contest__() {
    return link_to__Edit___edit_contest_path_contest__.getText();
  }

  public WebElement getElementForLink_to__Destroy___contest__confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___contest__confirm___Are_you_sure____method___delete_;
  }

  public String getTextForLink_to__Destroy___contest__confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___contest__confirm___Are_you_sure____method___delete_.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
