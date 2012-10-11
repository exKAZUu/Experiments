package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import jp.ac.waseda.almond.pages.EditPage;
import jp.ac.waseda.almond.pages.IndexPage;
import jp.ac.waseda.almond.pages.LayoutPage;
import jp.ac.waseda.almond.pages.NewPage;
import jp.ac.waseda.almond.pages.ResultPage;
import jp.ac.waseda.almond.pages.SolvePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
    // driver.close();
  }

  @Test
  public void editProblem() {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 全てのeditのaタグを取得
    List<WebElement> editElements = indexPage.getElementsForA_edit();
    // 最後のeditのaタグを取得
    WebElement editElement = editElements.get(editElements.size() - 1);
    // 取得したタグ要素をクリック
    editElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

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
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    layoutPage.getElementForA_Almond_Choco().click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ------ 内容が更新されていることを確認 ------
    assertEquals(editElements.size() + 1, solveElements.size());

  }

  @Test
  public void solveProblemWithOK() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- 結果の確認(assertEquals) ----------------
    assertEquals(resultPage.getTextForResult_(), "OK");
    assertEquals(resultPage.getTextForEx_(), resultPage.getTextForOut_());
  }

  @Test
  public void solveProblemWithNG() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 4");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- 結果の確認(assertEquals) ----------------
    assertEquals(resultPage.getTextForResult_(), "NG");
    assertFalse(resultPage.getTextForEx_() == resultPage.getTextForOut_());
  }

  @Test
  public void solveProblemWithRuby() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = solvePage.getElementForSELECT_lang_lang();
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- 結果の確認(assertEquals) ----------------
    assertEquals(resultPage.getElementForResult_(), "OK");
    assertEquals(resultPage.getElementForEx_(), resultPage.getElementForOut_());
  }
}
