package jp.ac.waseda.almond;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1WithoutPOGenAssertPlus {
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
  public void editProblem() {
    // ------ 問題編集ページヘ移動 (IndexPage) ------
    // 全てのeditのaタグを取得
    List<WebElement> editElements = driver.findElements(By.cssSelector("li > a"));
    // 最後のeditのaタグを取得
    WebElement editElement = editElements.get(editElements.size() - 2);
    // 取得したタグ要素をクリック
    editElement.click();

    // ------ 問題の編集 (EditPage) ------
    // descriptionのTEXTAREAタグを取得
    WebElement descriptionElement = driver.findElement(By.name("description"));
    // 2という文字列を追加入力(sendKeys)
    String oldDescText=descriptionElement.getText();
    String addDesc="2";
    descriptionElement.sendKeys(addDesc);
    String newDescText=oldDescText+addDesc;

    // inputのTEXTAREAタグを取得
    WebElement inputElement = driver.findElement(By.name("input"));
    // 2という文字列を追加入力(sendKeys)
    String oldInputText=inputElement.getText();
    String addInput="2";
    inputElement.sendKeys(addInput);
    String newInputText=oldInputText+addInput;

    // UpdateのBUTTONタグを取得してから、クリック(click)
    // .click();
    WebElement buttonElement = driver.findElement(By.cssSelector("button"));
    buttonElement.click();

    // ------ トップページに戻る(LayoutPage) ------
    // トップページに戻る（layoutPageにあるロゴをclick）
    // .click();
    WebElement layElement = driver.findElement(By.cssSelector("h1 > a"));
    layElement.click();

    // ------ 問題を解くページに移動 (IndexPage) ------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = driver.findElements(By.cssSelector("li > a"));
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ------ 内容が更新されていることを確認 ------
    descriptionElement = driver.findElement(By.name("description"));
    inputElement = driver.findElement(By.name("input"));
    System.out.println(descriptionElement.getText()+" @ "+newDescText);
    System.out.println(inputElement.getText()+" @ "+newInputText);
    Assert.assertEquals(descriptionElement.getText(), newDescText);
    Assert.assertEquals(inputElement.getText(), newInputText);
  }

  @Test
  public void solveProblemWithOK() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = driver.findElements(By.cssSelector("li > a"));
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    WebElement codeElement = driver.findElement(By.name("code"));
    codeElement.sendKeys("print 3");
    WebElement buttonElement = driver.findElement(By.cssSelector("button"));
    buttonElement.click();

    // ---------------- 結果の確認(assertEquals) ----------------
    WebElement pElement = driver.findElement(By.cssSelector("p"));
    Assert.assertEquals(pElement.getText().matches("OK"), true);
  }

  @Test
  public void solveProblemWithNG() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
	List<WebElement> solveElements = driver.findElements(By.cssSelector("li > a"));
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ---------------- SolvePage ----------------
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("print 4");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    WebElement codeElement = driver.findElement(By.name("code"));
    codeElement.sendKeys("print 4");
    WebElement buttonElement = driver.findElement(By.cssSelector("button"));
    buttonElement.click();

    // ---------------- 結果の確認(assertEquals) ----------------
    WebElement pElement = driver.findElement(By.cssSelector("p"));
    Assert.assertEquals(pElement.getText().matches("NG"), true);
  }

  @Test
  public void solveProblemWithRuby() {
    // ---------------- IndexPage ----------------
    // 全てのsolveのaタグを取得
    List<WebElement> solveElements = driver.findElements(By.cssSelector("li > a"));
    // 最後のsolveのaタグを取得
    WebElement solveElement = solveElements.get(solveElements.size() - 3);
    // 取得したタグ要素をクリック
    solveElement.click();

    // ---------------- SolvePage ----------------
    // 言語を選ぶSELECTタグを取得
    WebElement langElement = driver.findElement(By.name("lang"));
    // Rubyを選択
    new Select(langElement).selectByVisibleText("Ruby");
    // codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
    // .sendKeys("puts 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    WebElement codeElement = driver.findElement(By.name("code"));
    codeElement.sendKeys("puts 3");
    WebElement buttonElement = driver.findElement(By.cssSelector("button"));
    buttonElement.click();

    // ---------------- 結果の確認(assertEquals) ----------------
    WebElement pElement = driver.findElement(By.cssSelector("p"));
    Assert.assertEquals(pElement.getText().matches("OK"), true);
  }
}
