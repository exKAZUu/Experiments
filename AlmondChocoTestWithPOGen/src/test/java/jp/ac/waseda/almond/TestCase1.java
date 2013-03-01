package jp.ac.waseda.almond;

import java.util.*;
import static org.junit.Assert.assertEquals;

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
import org.openqa.selenium.By;
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
//    driver.close(); // コメントアウトするとFirefoxが終了しなくなる
  }

  @Test
  public void editProblem() throws InterruptedException {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 最後のeditのaタグを取得（全てのeditのaタグをとってから一番最後を取る）
    WebElement editElement = null;
    List<WebElement> es = driver.findElements(By.cssSelector("a"));
    List<WebElement> editElements = new ArrayList<WebElement>();
    int i = 0;
    for (WebElement e : es) {
        if (i++ % 2 == 0) {
          editElements.add(e);
        }
      }
    editElement = editElements.get(editElements.size() - 1);
    // 取得したタグ要素をクリック
    editElement.click();
    Thread.sleep(500);

    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = null;
    List<WebElement> ds = driver.findElements(By.cssSelector("textarea"));
    descriptionElement = ds.get(0);
    // 2という文字列を追加入力(sendKeys)
    descriptionElement.sendKeys("2");

    // inputのTEXTAREAタグを取得
    WebElement inputElement = null;
    inputElement = ds.get(1);
    // 2という文字列を追加入力(sendKeys)
    inputElement.sendKeys("2");

    // UpdateのBUTTONタグを取得してから、クリック(click)
    WebElement updateElement = null;
    updateElement = driver.findElement(By.cssSelector("button"));
    // .click();
    updateElement.click();
    Thread.sleep(500);

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    // .click();
    List<WebElement> aTags = driver.findElements(By.cssSelector("a"));
    aTags.get(0).click();
    Thread.sleep(500);

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> esIndex = driver.findElements(By.cssSelector("a"));
    // 最後のsolveのaタグを取得
    WebElement solveElement = esIndex.get(esIndex.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    WebElement problemInput = driver.findElement(By.name("pre"));
    assertEquals("2", problemInput.getText());
    // 内容が正しく更新されていることを確認
  }

  @Test
  public void solveProblemWithNG() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
	List<WebElement> aTags = driver.findElements(By.cssSelector("a"));	
    WebElement solveElement = aTags.get(aTags.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    WebElement textarea = driver.findElement(By.cssSelector("textarea"));
    // .sendKeys("print 4");
    textarea.sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    WebElement button= driver.findElement(By.cssSelector("button"));
    // .click();
    button.click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    
    assertEquals("print 3", textarea.getText());
    // 不正解していることなどを確認(assertEqualsを何度も使う)
  }

  @Test
  public void solveProblemWithRuby() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
	List<WebElement> aTags = driver.findElements(By.cssSelector("a"));	
	WebElement solveElement = aTags.get(aTags.size() - 3);
    // 取得したaタグの要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = driver.findElement(By.cssSelector("select"));	
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    WebElement textarea = driver.findElement(By.cssSelector("textarea"));
    // .sendKeys("puts 3");
    textarea.sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    WebElement button= driver.findElement(By.cssSelector("button"));
    // .click();
    button.click();
    Thread.sleep(500);

    // ---------------- 結果の確認(次の実験で書くので記入しないで下さい) ----------------
    assertEquals("puts 3", textarea.getText());
    // 正解していることなどを確認(assertEqualsを何度も使う)
  }
}
