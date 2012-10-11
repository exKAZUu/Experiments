package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2WithoutPOGen {
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

  @SuppressWarnings("null")
  @Test
  public void createNewProblem() throws InterruptedException {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    // createのaタグを取得
    WebElement createElement = null;
    // 取得したタグ要素をクリック(click)
    createElement.click();
    Thread.sleep(500);

    // ------ 新しい問題を作成 (NewPage) ------
    // titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
    // .sendKeys("title");
    // descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
    // .sendKeys("description");
    // inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
    // .sendKeys("input");
    // outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
    // .sendKeys("3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    Thread.sleep(500);

    // ------ 問題作成に成功したかチェック ------
  }

  @Test
  public void deleteProblem() throws InterruptedException {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = 0; // .size();
    // 全てのdeleteのaタグを取得
    List<WebElement> deleteElements = null;
    // 最後のdeleteのaタグを取得
    WebElement deleteElement = deleteElements.get(deleteElements.size() - 1);
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
}
