package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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

  @Test
  public void createNewProblem() {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    int originalProblemNumber=driver.findElements(By.cssSelector("ul > li")).size();
    // createのaタグを取得
    WebElement createElement = driver.findElement(By.linkText("create"));
    // 取得したタグ要素をクリック(click)
    createElement.click();

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
    driver.findElementByTagName("button").click();

    // ------ 問題作成に成功したかチェック ------
    assertEquals(originalProblemNumber+1, driver.findElements(By.cssSelector("ul > li")).size());    
    
    List<WebElement> l=driver.findElements(By.linkText("solve"));
    l.get(l.size()-1).click();
    List<WebElement> pres=driver.findElementsByTagName("pre");
    assertEquals("description", pres.get(0).getText());
    assertEquals("input", pres.get(1).getText());
    assertEquals("3", pres.get(2).getText());
  }

  @Test
  public void deleteProblem() {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = driver.findElements(By.cssSelector("ul > li")).size();
    // 全てのdeleteのaタグを取得
    List<WebElement> deleteElements = driver.findElementsByLinkText("delete");
    // 最後のdeleteのaタグを取得
    WebElement deleteElement = deleteElements.get(deleteElements.size() - 1);
    // 取得したタグ要素をクリック
    deleteElement.click();
    // 問題数を数える
    int newProblemCount = driver.findElements(By.cssSelector("ul > li")).size();
    // 最初と比べて問題数が1減っていることを確認する（assertEquals）
    assertEquals(oldProblemCount - 1, newProblemCount);
  }

  @Test
  public void solveProblemWithOK() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = driver.findElementsByLinkText("solve");
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 1);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    driver.findElementByName("code").sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    driver.findElementByTagName("button").click();

    // ---------------- 結果の確認(assertEquals) ----------------
    assertEquals("OK",driver.findElement(By.cssSelector("p")).getText().substring(0, 2));
  }
}
