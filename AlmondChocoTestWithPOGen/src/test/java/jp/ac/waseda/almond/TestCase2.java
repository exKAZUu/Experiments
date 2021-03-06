package jp.ac.waseda.almond;

import static org.junit.Assert.*;
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

public class TestCase2 {
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
  public void createNewProblem() throws InterruptedException {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    // createのaタグを取得
    WebElement createElement = null;
    // 取得したaタグの要素をクリック(click)
    createElement.click();
    Thread.sleep(500);

    // ------ 新しい問題を作成 (NewPage) ------
    // titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
    // .sendKeys("title"); // （無理に一行で書かなくてOK）
    // descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
    // .sendKeys("description");
    // inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
    // .sendKeys("input");
    // outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
    // .sendKeys("3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    // 正しく問題が作られていることを確認(assertEqualsを何度も使う)
  }

  @Test
  public void deleteProblem() throws InterruptedException {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = 0; // .size();

    // 最後のdeleteのaタグを取得（全てのdeleteのaタグをとってから一番最後を取る）
    WebElement deleteElement = null;
    // 取得したタグ要素をクリック
    deleteElement.click();
    Thread.sleep(500);

    // 問題数を数える
    int newProblemCount = 0; // .size();
    // 最初と比べて問題数が1減っていることを確認する（assertEquals）
    assertEquals(oldProblemCount - 1, newProblemCount);
  }

  @Test
  public void solveProblemWithOK() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
    WebElement solveElement = null;
    // 取得したaタグの要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    // 正解していることなどを確認(assertEqualsを何度も使う)
  }
}
