package jp.ac.waseda.wpcs.contests.problems;

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
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_15']")
  private WebElement _problem_title_;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_16']")
  private WebElement file_field_tag__files___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_17']")
  private WebElement text_area_tag__text_area___;
  @FindBy(how = How.XPATH, using = "//*[@lang='__pogen_18']")
  private WebElement submit_tag__Submit___;

  public WebElement getElementFor_problem_title_() {
    return _problem_title_;
  }

  public String getTextFor_problem_title_() {
    return _problem_title_.getText();
  }

  public WebElement getElementForFile_field_tag__files___() {
    return file_field_tag__files___;
  }

  public String getTextForFile_field_tag__files___() {
    return file_field_tag__files___.getText();
  }

  public WebElement getElementForText_area_tag__text_area___() {
    return text_area_tag__text_area___;
  }

  public String getTextForText_area_tag__text_area___() {
    return text_area_tag__text_area___.getText();
  }

  public WebElement getElementForSubmit_tag__Submit___() {
    return submit_tag__Submit___;
  }

  public String getTextForSubmit_tag__Submit___() {
    return submit_tag__Submit___.getText();
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
