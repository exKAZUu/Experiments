package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import jp.ac.waseda.almond.pages.EditPage;
import jp.ac.waseda.almond.pages.IndexPage;
import jp.ac.waseda.almond.pages.LayoutPage;
import jp.ac.waseda.almond.pages.NewPage;
import jp.ac.waseda.almond.pages.ResultPage;
import jp.ac.waseda.almond.pages.SolvePage;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
  private FirefoxDriver driver;
  private EditPage editPage;
  private IndexPage indexPage;
  private LayoutPage layoutPage;
  private NewPage newPage;
  private ResultPage resultPage;
  private SolvePage solvePage;

  @Before
  public void before() {
    driver = new FirefoxDriver();
    driver.get("http://192.168.1.32:5000/");
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

	int oldProblemNum = indexPage.getElementsForA_delete().size();
	  
    // createのaタグを取得
    WebElement createElement = indexPage.getElementForA_create();
    // 取得したタグ要素をクリック(click)
    createElement.click();

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
    newPage.getElementForINPUT_title().sendKeys("title");
    newPage.getElementForTEXTAREA_description().sendKeys("description");
    newPage.getElementForTEXTAREA_input().sendKeys("input");
    newPage.getElementForTEXTAREA_output().sendKeys("3");
    newPage.getElementForBUTTON_submit().click();
    // ------ 問題作成に成功したかチェック ------
	int newProblemNum = indexPage.getElementsForA_delete().size();
	assertEquals(oldProblemNum+1, newProblemNum);
	List<WebElement> editList = indexPage.getElementsForA_edit();
	editList.get(editList.size()-1).click();
	assertEquals(editPage.getTextForProblem_dot_title_(), "title");
	assertEquals(editPage.getElementForTEXTAREA_description().getText(), "description");
	assertEquals(editPage.getElementForTEXTAREA_input().getText(), "input");
	assertEquals(editPage.getElementForTEXTAREA_output().getText(), "3");
	
  }

  @Test
  public void deleteProblem() {
    // 問題を作成
    createNewProblem();

    // ------------ 問題数で確認(IndexPage) ------------
    // 問題数を数える
    int oldProblemCount = indexPage.getElementsForA_delete().size(); // .size();
    // 全てのdeleteのaタグを取得
    List<WebElement> deleteElements = indexPage.getElementsForA_delete();
    // 最後のdeleteのaタグを取得
    WebElement deleteElement = deleteElements.get(deleteElements.size() - 1);
    // 取得したタグ要素をクリック
    deleteElement.click();
    // 問題数を数える
    int newProblemCount = indexPage.getElementsForA_delete().size(); // .size();
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
    // .sendKeys("print 3");
    // submitのBUTTONタグを取得してから、クリック(click)
    // .click();
    solvePage.getElementForTEXTAREA_code().sendKeys("print 3");
    solvePage.getElementForBUTTON_Submit().click();

    // ---------------- 結果の確認(assertEquals) ----------------
    Assert.assertEquals(resultPage.getTextForResult_().matches("OK"), true);
    
  }
}
