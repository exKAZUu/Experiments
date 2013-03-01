package jp.ac.waseda.almond.answer;

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

public class TestCaseAnswer2 {
  private FirefoxDriver driver;
  private LayoutPage layoutPage;// ページのタイトルとトップへのリンク（layout.ejs）
  private IndexPage indexPage;	// トップページ（index.ejs）
  private NewPage newPage;		// 問題の新規作成ページ（index.ejs）
  private EditPage editPage;	// 問題の編集ページ（edit.ejs）
  private SolvePage solvePage;	// 問題の提出ページ（solve.ejs）
  private ResultPage resultPage;// 結果判定ページ（result.ejs）

  @Before
  public void before() {
    driver = new FirefoxDriver();
    driver.get("http://192.168.1.41:5000/");
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
    // 取得したaタグ要素をクリック(click)
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
    // 全てのタイトルの文字列を取得（最後のタイトルを取得するため）
    List<String> titles = indexPage.getTextsForProblems_i__dot_title_();
    // 最後のタイトルの文字列を取得
    String title = titles.get(titles.size() - 1);
    // 取得した文字列が"title"と等しいかチェック（assertEquals）
    assertEquals("title", title);

    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得（最後のsolveのaタグを取得するため）
    List<WebElement> solveElements = indexPage.getElementsForA_solve();
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();

    assertEquals("description", solvePage.getTextForProblem_dot_description_());
    assertEquals("input", solvePage.getTextForProblem_dot_input_());
    assertEquals("output", solvePage.getTextForProblem_dot_output_());
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
    // 正解していることなどを確認(assertEquals)
    assertEquals("OK", resultPage.getTextForResult_());
    assertTrue(resultPage.getTextForEx_().equals(resultPage.getTextForOut_()));
  }
}
