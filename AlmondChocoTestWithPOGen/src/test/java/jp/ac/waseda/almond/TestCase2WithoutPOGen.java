package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;

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
  public void createNewProblem() throws InterruptedException {
    // ------ 問題作成ページヘ移動 (IndexPage) ------
    // createのaタグを取得
    WebElement createElement = driver.findElement(By.linkText("create"));
    // 取得したタグ要素をクリック(click)
    createElement.click();
    Thread.sleep(500);

    // ------ 新しい問題を作成 (NewPage) ------
    // titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
    driver.findElement(By.name("title")).sendKeys("title");
    // descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
    driver.findElement(By.name("description")).sendKeys("description");
    // inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
    driver.findElement(By.name("input")).sendKeys("input");
    // outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
    driver.findElement(By.name("output")).sendKeys("3");
    // submitのBUTTONタグを取得してから、クリック(click)
    driver.findElement(By.tagName("button")).click();
    Thread.sleep(500);

    // ---------------- 結果の確認(実験2でassertEqualsを使う) ----------------
    // 正しく問題が作られていることを確認
  }

  @Test
  public void deleteProblem() throws InterruptedException {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = driver.findElementsByLinkText("solve").size(); // .size();

    // 最後のdeleteのaタグを取得（全てのdeleteのaタグをとってから一番最後を取る）
    List<WebElement> findElementsByLinkText = driver.findElements(By.cssSelector("ul > li > a"));
    int num = findElementsByLinkText.size() - 1;
    WebElement deleteElement = findElementsByLinkText.get(num);    // 取得したタグ要素をクリック
    deleteElement.click();
    Thread.sleep(500);

    // 問題数を数える
    int newProblemCount = driver.findElementsByLinkText("solve").size(); // .size();
    // 最初と比べて問題数が1減っていることを確認する（assertEquals）
    assertEquals(oldProblemCount - 1, newProblemCount);
  }

  @Test
  public void solveProblemWithOK() throws InterruptedException {
    // ---------------- IndexPage ----------------
    // 最後のsolveのaタグを取得（全てのsolveのaタグをとってから一番最後を取る）
	List<WebElement> findElementsByLinkText = driver.findElements(By.cssSelector("ul > li > a"));
	int num = findElementsByLinkText.size() - 3;
    WebElement solveElement = findElementsByLinkText.get(num); 
    // 取得したタグ要素をクリック
    solveElement.click();
    Thread.sleep(500);

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    driver.findElement(By.name("code")).sendKeys("print 3");
    //Assert.assertEquals(driver.findElement(By.name("code")).getText(), "print 3") ;
    
    // submitのBUTTONタグを取得してから、クリック(click)
    driver.findElement(By.tagName("button")).click();
    Thread.sleep(500);

    // ---------------- 結果の確認(実験2でassertEqualsを使う) ----------------
    // 正しく正解していることを確認
    WebElement findElement = driver.findElement(By.cssSelector("html > body > p "));
    System.out.println(findElement.getText());
    Assert.assertTrue(findElement.getText().contains("OK"));   
    Assert.assertTrue(findElement.getText().contains("actual = [3 ]"));   
    Assert.assertTrue(findElement.getText().contains("expect = [3]")); 
  }
}
