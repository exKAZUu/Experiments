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
  private LayoutPage layoutPage;// ページのタイトルとトップへのリンク（layout.ejs）
  private IndexPage indexPage;	// トップページ（index.ejs）
  private NewPage newPage;		// 問題の新規作成ページ（new.ejs）
  private EditPage editPage;	// 問題の編集ページ（edit.ejs）
  private SolvePage solvePage;	// 問題の提出ページ（solve.ejs）
  private ResultPage resultPage;// 結果判定ページ（result.ejs）

  @Before
  public void before() {
    driver = new FirefoxDriver();
    driver.get("http://192.168.1.41:5000/");
    layoutPage = new LayoutPage(driver);// ページのタイトルとトップへのリンク（layout.ejs）
    indexPage = new IndexPage(driver);	// トップページ（index.ejs）
    newPage = new NewPage(driver);		// 問題の新規作成ページ（new.ejs）
    editPage = new EditPage(driver);	// 問題の編集ページ（edit.ejs）
    solvePage = new SolvePage(driver);	// 問題の提出ページ（solve.ejs）
    resultPage = new ResultPage(driver);// 結果判定ページ（result.ejs）
    // 注意！
    // Pageオブジェクトは使って良いと支持されたときだけ使って下さい。
    
    // 使い方の簡単な説明：
    // index.ejsの中で1つ目のcreateという名前orテキストの*要素*を取得
    // indexPage.getElementForA_create();

    // index.ejsの中で1つ目の<%= problems[i].title %>の*文字列*を取得
    // indexPage.getTextsForProblems_i__dot_title_();
    
    // index.ejsの中で2つ目の<%= problems[i].id %>の要素を取得
    // indexPage.getElementsForProblems_i__dot_id_2();
  }

  @After
  public void after() {
     driver.close(); // コメントアウトするとFirefoxが終了しなくなる
  }

  @Test
  public void editProblem() throws InterruptedException {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 最後のeditのaタグを取得（全てのeditのaタグをとってから一番最後を取る）
    List<WebElement> t = indexPage.getElementsForA_edit();
    WebElement editElement = t.get(t.size() - 1);
    // 取得したタグ要素をクリック
    editElement.click();
    Thread.sleep(500);
    
    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = editPage.getElementForTEXTAREA_description();
    // 2という文字列を追加入力(sendKeys)
    descriptionElement.sendKeys("2");
    
    String expectedDescriptionText = editPage.getTextForProblem_dot_description_();
    
    // inputのTEXTAREAタグを取得
    WebElement inputElement = editPage.getElementForTEXTAREA_input();
    // 2という文字列を追加入力(sendKeys)
    inputElement.sendKeys("2");
    
    String expectedInputText = editPage.getTextForProblem_dot_input_();;

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
    
    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    // 内容が正しく更新されていることを確認
    assertEquals(expectedDescriptionText, solvePage.getTextForProblem_dot_description_());
    assertEquals(expectedInputText, solvePage.getTextForProblem_dot_input_());
  }

  @Test
  public void solveProblemWithNG() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
	List<WebElement> t = indexPage.getElementsForA_solve();
    WebElement solveElement = t.get(t.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    // 不正解していることなどを確認(assertEqualsを何度も使う)
    assertEquals(resultPage.getTextForResult_(), "NG");
    assertEquals(resultPage.getTextForOut_(), "3");
  }

  @Test
  public void solveProblemWithRuby() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
	List<WebElement> t = indexPage.getElementsForA_solve();
    WebElement solveElement = t.get(t.size() - 1);
    // 取得したaタグの要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = solvePage.getElementForSELECT_lang_lang();
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    solvePage.getElementForTEXTAREA_code().sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    solvePage.getElementForBUTTON_Submit().click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    // 正解していることなどを確認(assertEqualsを何度も使う)
    assertEquals(resultPage.getTextForResult_(), "OK");
    assertEquals(resultPage.getTextForEx_(), resultPage.getTextForOut_());
  }
}
