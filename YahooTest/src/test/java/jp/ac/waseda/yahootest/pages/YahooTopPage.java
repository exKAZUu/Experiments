package jp.ac.waseda.yahootest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooTopPage extends AbstractPage {

  @FindBy(name = "p")
  public WebElement searchBox;
  @FindBy(id = "srchbtn")
  public WebElement searchButton;
  @FindBy(id = "isearch")
  public WebElement imageButton;

  public YahooTopPage(WebDriver driver) {
    super(driver);
  }

  public YahooSearchResultPage goSearchPage(String keyword) {
    searchBox.sendKeys(keyword);
    searchButton.click();
    return new YahooSearchResultPage(driver, keyword);
  }

  public YahooImageSearchResultPage goImageSearchPage(String keyword) {
    searchBox.sendKeys(keyword);
    imageButton.click();
    return new YahooImageSearchResultPage(driver, keyword);
  }
}
