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

public class TestCaseAnswer2 {
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
    driver.close();
  }

  @Test
  public void createNewProblem() {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    // createのaタグを取得
    WebElement createElement = indexPage.getElementForA_create();
    // 取得したタグ要素をクリック(click)
    createElement.click();

    // ------ 新しい問題を作成 (NewPage) ------
    // titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
    newPage.getElementForINPUT_title().sendKeys("title");
    // descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
    newPage.getElementForTEXTAREA_description().sendKeys("description");
    // inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
    newPage.getElementForTEXTAREA_input().sendKeys("input");
    // outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
    newPage.getElementForTEXTAREA_output().sendKeys("3");
    // submitのBUTTONタグを取得してから、クリック(click)
    newPage.getElementForBUTTON_submit().click();

    // ------ 問題作成に成功したかチェック (IndexPage) ------
    // 全てのタイトルの文字列を取得
    List<String> titles = indexPage.getTextsForProblems_i__dot_title_();
    // 最後のタイトルの文字列を取得
    String title = titles.get(titles.size() - 1);
    // 取得した文字列が"title"と等しいかチェック（assertEquals）
    assertEquals("title", title);
  }

  @Test
  public void deleteProblem() {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = indexPage.getElementsForProblems_i__dot_title_().size();
    // 全てのdeleteのaタグを取得
    List<WebElement> deleteElements = indexPage.getElementsForA_delete();
    // 最後のdeleteのaタグを取得
    WebElement deleteElement = deleteElements.get(deleteElements.size() - 1);
    // 取得したタグ要素をクリック
    deleteElement.click();
    // 問題数を数える
    int newProblemCount = indexPage.getElementsForProblems_i__dot_title_().size();
    // 最初と比べて問題数が1減っていることを確認する（assertEquals）
    assertEquals(oldProblemCount - 1, newProblemCount);
  }

  @Test
  public void editProblem() {
    createNewProblem();

    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 全てのeditのaタグを取得
    List<WebElement> editElements = indexPage.getElementsForA_edit();
    // 最後のeditのaタグを取得
    WebElement editElement = editElements.get(editElements.size() - 1);
    // 取得したタグ要素をクリック
    editElement.click();

    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = editPage.getElementForTEXTAREA_description();
    // 中身の文字列を全て削除(clear)
    descriptionElement.clear();
    // DESCRIPTIONという文字列を入力(sendKeys)
    descriptionElement.sendKeys("DESCRIPTION");

    // inputのTEXTAREAタグを取得
    WebElement inputElement = editPage.getElementForTEXTAREA_input();
    // 中身の文字列を全て削除(clear)
    inputElement.clear();
    // INPUTという文字列を入力(sendKeys)
    inputElement.sendKeys("INPUT");

    // UpdateのBUTTONタグを取得してから、クリック(click)
    editPage.getElementForBUTTON_Update().click();

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    layoutPage.getElementForA_Almond_Choco().click();

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ------ 内容が更新されていることを確認 (SolvePage) ------
    // descriptionの文字列を取得
    String description = solvePage.getTextForProblem_dot_description_();
    // inputの文字列を取得
    String input = solvePage.getTextForProblem_dot_input_();
    // descriptionが"DESCRIPTION"になっていることを確認
    assertEquals("DESCRIPTION", description);
    // inputが"INPUT"になっていることを確認
    assertEquals("INPUT", input);
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

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();

    // ---------------- ResultPage ----------------
    // 結果がOKになっていることを確認(assertEquals)
    assertEquals("OK", resultPage.getTextForResult_());
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

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 4");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();

    // ---------------- ResultPage ----------------
    // 結果がNGになっていることを確認(assertEquals)
    assertEquals("NG", resultPage.getTextForResult_());
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

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = solvePage.getElementForSELECT_lang_lang();
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();

    // ---------------- ResultPage ----------------
    // 結果がOKになっていることを確認(assertEquals)
    assertEquals("OK", resultPage.getTextForResult_());
  }
}
