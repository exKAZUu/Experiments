package jp.ac.waseda.almond;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1WithoutPOGen {
  private FirefoxDriver driver;

  @Before
  public void before() {
    driver = new FirefoxDriver();
    driver.get("http://192.168.1.32:5000/");
  }

  @After
  public void after() {
    driver.close();
  }

  @Test
  public void editProblem() throws InterruptedException {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 全てのeditのaタグを取得
    List<WebElement> editElements = null;
    // 最後のeditのaタグを取得
    WebElement editElement = editElements.get(editElements.size() - 1);
    // 取得したタグ要素をクリック
    editElement.click();
    Thread.sleep(500);

    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = null;
    // 2という文字列を追加入力(sendKeys)
    descriptionElement.sendKeys("2");

    // inputのTEXTAREAタグを取得
    WebElement inputElement = null;
    // 2という文字列を追加入力(sendKeys)
    inputElement.sendKeys("2");

    // UpdateのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    // .click();
    Thread.sleep(500);

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = null;
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ------ 内容が更新されていることを確認 ------
  }

  @Test
  public void solveProblemWithOK() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = null;
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ---------------- 結果の確認(assertEquals) ----------------
  }

  @Test
  public void solveProblemWithNG() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = null;
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("print 4");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ---------------- 結果の確認(assertEquals) ----------------
  }

  @Test
  public void solveProblemWithRuby() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = null;
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = null;
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ---------------- 結果の確認(assertEquals) ----------------
  }
}
