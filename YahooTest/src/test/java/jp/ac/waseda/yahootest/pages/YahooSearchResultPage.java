package jp.ac.waseda.yahootest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooSearchResultPage extends AbstractPage {

  @FindBy(id = "SaB")
  public WebElement topButton;
  @FindBy(id = "isrch")
  public WebElement imageButton;

  private final String keyword;

  public YahooSearchResultPage(WebDriver driver, String keyword) {
    super(driver);
    this.keyword = keyword;
  }

  public YahooTopPage goTopPage() {
    topButton.click();
    return new YahooTopPage(driver);
  }

  public YahooImageSearchResultPage goImageSearchPage() {
    imageButton.click();
    return new YahooImageSearchResultPage(driver, keyword);
  }

  // public List<String> getTitleTexts() {
  // }

}
