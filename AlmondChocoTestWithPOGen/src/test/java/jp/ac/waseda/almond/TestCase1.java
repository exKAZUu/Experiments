package jp.ac.waseda.almond;

import java.util.List;

import jp.ac.waseda.almond.pages.EditPage;
import jp.ac.waseda.almond.pages.IndexPage;
import jp.ac.waseda.almond.pages.LayoutPage;
import jp.ac.waseda.almond.pages.NewPage;
import jp.ac.waseda.almond.pages.ResultPage;
import jp.ac.waseda.almond.pages.SolvePage;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Selenium;

public class TestCase1 {
  private FirefoxDriver driver;
  private EditPage editPage;
  private IndexPage indexPage;
  private LayoutPage layoutPage;
  private NewPage newPage;
  private ResultPage resultPage;
  private SolvePage solvePage;

  @Before
  public void before() {
    driver = new FirefoxDriver();
    driver.get("http://192.168.1.32:5000/");
    indexPage = new IndexPage(driver);
    editPage = new EditPage(driver);
    layoutPage = new LayoutPage(driver);
    newPage = new NewPage(driver);
    resultPage = new ResultPage(driver);
    solvePage = new SolvePage(driver);
  }

  @After
  public void after() {
    // コメントアウトするとFirefoxが終了しなくなる
    driver.close();
  }

  @Test
  public void editProblem() throws InterruptedException {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 最後のeditのaタグを取得（全てのeditのaタグをとってから一番最後を取る）OK
	List<WebElement> elementsForA_edit_List = indexPage.getElementsForA_edit();
    WebElement editElement = elementsForA_edit_List.get(elementsForA_edit_List.size() - 1);
    // 取得したタグ要素をクリック OK
    editElement.click();
    Thread.sleep(500);

    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = editPage.getElementForTEXTAREA_description();
    // 2という文字列を追加入力(sendKeys)
    descriptionElement.sendKeys("2");

    // inputのTEXTAREAタグを取得
    WebElement inputElement = editPage.getElementForTEXTAREA_input();
    // 2という文字列を追加入力(sendKeys)
    inputElement.sendKeys("2");

    // UpdateのBUTTONタグを取得してから、クリック(click)
    editPage.getElementForBUTTON_Update().click();
    Thread.sleep(500);

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    layoutPage.getElementForA_Almond_Choco().click();
    Thread.sleep(500);

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- 結果の確認(実験2でassertEqualsを使う) ----------------
    // 内容が正しく更新されていることを確認
  }

  @Test
  public void solveProblemWithNG() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
    WebElement solveElement = indexPage.getElementsForA_solve().get(indexPage.getElementsForA_solve().size()-1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 4");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    Thread.sleep(500);

    // ---------------- 結果の確認(実験2でassertEqualsを使う) ----------------
    // 正しく不正解していることを確認
  }

  @Test
  public void solveProblemWithRuby() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
    WebElement solveElement = indexPage.getElementsForA_solve().get(indexPage.getElementsForA_solve().size()-1);;
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = solvePage.getElementForSELECT_lang_lang();
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    Thread.sleep(500);

    // ---------------- 結果の確認(実験2でassertEqualsを使う) ----------------
    // 正しく正解していることを確認
    //Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
    //List<WebElement> findElements = driver.findElements(By.cssSelector("br"));
    Assert.assertEquals(resultPage.getTextForResult_(), "OK");
  }
}
