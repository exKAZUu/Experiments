package jp.ac.waseda.wpcs.contests.problems;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_5']")
  private WebElement link_to__Score_board___contest_score_path_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_6']")
  private WebElement link_to_problem_title__problem_content_path__target____blank___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_7']")
  private WebElement problem_small_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_8']")
  private WebElement problem_large_score_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_9']")
  private WebElement link_to__Download_Small___download_small_contest_problem_path__contest__problem___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_10']")
  private WebElement link_to__Download_Large___download_large_contest_problem_path__contest__problem___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_11']")
  private WebElement link_to__Submit_Small___contest_problem_path__contest__problem__input_type___small___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_12']")
  private WebElement link_to__Submit_Large___contest_problem_path__contest__problem__input_type___large___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_13']")
  private WebElement link_to__Edit___edit_contest_problem_path__contest__problem__;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_14']")
  private WebElement link_to__Destroy___contest_problem_path__contest__problem___confirm___Are_you_sure____method___delete_;

  public WebElement getElementForLink_to__Score_board___contest_score_path_() {
    return link_to__Score_board___contest_score_path_;
  }

  public String getTextForLink_to__Score_board___contest_score_path_() {
    return link_to__Score_board___contest_score_path_.getText();
  }

  public WebElement getElementForLink_to_problem_title__problem_content_path__target____blank___() {
    return link_to_problem_title__problem_content_path__target____blank___;
  }

  public String getTextForLink_to_problem_title__problem_content_path__target____blank___() {
    return link_to_problem_title__problem_content_path__target____blank___.getText();
  }

  public WebElement getElementForProblem_small_score_() {
    return problem_small_score_;
  }

  public String getTextForProblem_small_score_() {
    return problem_small_score_.getText();
  }

  public WebElement getElementForProblem_large_score_() {
    return problem_large_score_;
  }

  public String getTextForProblem_large_score_() {
    return problem_large_score_.getText();
  }

  public WebElement getElementForLink_to__Download_Small___download_small_contest_problem_path__contest__problem___() {
    return link_to__Download_Small___download_small_contest_problem_path__contest__problem___;
  }

  public String getTextForLink_to__Download_Small___download_small_contest_problem_path__contest__problem___() {
    return link_to__Download_Small___download_small_contest_problem_path__contest__problem___
        .getText();
  }

  public WebElement getElementForLink_to__Download_Large___download_large_contest_problem_path__contest__problem___() {
    return link_to__Download_Large___download_large_contest_problem_path__contest__problem___;
  }

  public String getTextForLink_to__Download_Large___download_large_contest_problem_path__contest__problem___() {
    return link_to__Download_Large___download_large_contest_problem_path__contest__problem___
        .getText();
  }

  public WebElement getElementForLink_to__Submit_Small___contest_problem_path__contest__problem__input_type___small___() {
    return link_to__Submit_Small___contest_problem_path__contest__problem__input_type___small___;
  }

  public String getTextForLink_to__Submit_Small___contest_problem_path__contest__problem__input_type___small___() {
    return link_to__Submit_Small___contest_problem_path__contest__problem__input_type___small___
        .getText();
  }

  public WebElement getElementForLink_to__Submit_Large___contest_problem_path__contest__problem__input_type___large___() {
    return link_to__Submit_Large___contest_problem_path__contest__problem__input_type___large___;
  }

  public String getTextForLink_to__Submit_Large___contest_problem_path__contest__problem__input_type___large___() {
    return link_to__Submit_Large___contest_problem_path__contest__problem__input_type___large___
        .getText();
  }

  public WebElement getElementForLink_to__Edit___edit_contest_problem_path__contest__problem__() {
    return link_to__Edit___edit_contest_problem_path__contest__problem__;
  }

  public String getTextForLink_to__Edit___edit_contest_problem_path__contest__problem__() {
    return link_to__Edit___edit_contest_problem_path__contest__problem__.getText();
  }

  public WebElement getElementForLink_to__Destroy___contest_problem_path__contest__problem___confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___contest_problem_path__contest__problem___confirm___Are_you_sure____method___delete_;
  }

  public String getTextForLink_to__Destroy___contest_problem_path__contest__problem___confirm___Are_you_sure____method___delete_() {
    return link_to__Destroy___contest_problem_path__contest__problem___confirm___Are_you_sure____method___delete_
        .getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
