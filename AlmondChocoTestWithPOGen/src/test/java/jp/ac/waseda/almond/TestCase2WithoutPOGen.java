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
    // driver.close();
  }

  @Test
  public void createNewProblem() {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    // createのaタグを取得
    WebElement createElement = driver.findElementByCssSelector("body > p > a");
    // 取得したタグ要素をクリック(click)
    createElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ------ 新しい問題を作成 (NewPage) ------
    // titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
    driver.findElementByName("title").sendKeys("title");
    // descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
    driver.findElementByName("description").sendKeys("description");
    // inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
    driver.findElementByName("input").sendKeys("input");
    // outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
    driver.findElementByName("output").sendKeys("3");
    // submitのBUTTONタグを取得してから、クリック(click)
    driver.findElementByCssSelector("button").click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ------ 問題作成に成功したかチェック ------
    List<WebElement> es = driver.findElementsByCssSelector("ul > li > a");
    WebElement e = es.get(es.size() - 3);
    e.click();
    try {
      Thread.sleep(500);
    } catch (Exception ex) {

    }
    // assertEquals(driver.findElementByName("title"), "title");
    assertEquals(driver.findElementByName("description").getText(), "description");
    assertEquals(driver.findElementByName("input").getText(), "input");
    assertEquals(driver.findElementByName("output").getText(), "3");

  }

  @Test
  public void deleteProblem() {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = driver.findElementsByCssSelector("ul > li").size();
    // 全てのdeleteのaタグを取得
    List<WebElement> deleteElements = driver.findElementsByCssSelector("li > a");
    // 最後のdeleteのaタグを取得
    WebElement deleteElement = deleteElements.get(deleteElements.size() - 1);
    // 取得したタグ要素をクリック
    deleteElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }
    // 問題数を数える
    int newProblemCount = driver.findElementsByCssSelector("ul > li").size();
    // 最初と比べて問題数が1減っていることを確認する（assertEquals）
    assertEquals(oldProblemCount - 1, newProblemCount);
  }

  @Test
  public void solveProblemWithOK() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = driver.findElementsByCssSelector("li > a");

    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    driver.findElementByCssSelector("textarea").sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    driver.findElementByCssSelector("button").click();
    try {
      Thread.sleep(500);
    } catch (Exception e) {

    }

    // ---------------- 結果の確認(assertEquals) ----------------
    assertEquals(driver.findElementByCssSelector("body > p"), "OK");
    // assertEquals(driver.findElementsByCssSelector(""));
  }
}
