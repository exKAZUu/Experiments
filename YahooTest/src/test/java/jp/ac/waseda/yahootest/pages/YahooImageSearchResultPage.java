package jp.ac.waseda.yahootest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooImageSearchResultPage extends AbstractPage {

  @FindBy(id = "SaB")
  public WebElement topButton;
  @FindBy(id = "srch")
  public WebElement searchButton;

  private final String keyword;

  public YahooImageSearchResultPage(WebDriver driver, String keyword) {
    super(driver);
    this.keyword = keyword;
  }

  public YahooTopPage goTopPage() {
    topButton.click();
    return new YahooTopPage(driver);
  }

  public YahooSearchResultPage goSearchPage() {
    searchButton.click();
    return new YahooSearchResultPage(driver, keyword);
  }
}
