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
		// createのaタグを取得
		WebElement createElement = indexPage.getElementForA_create();
		// 取得したタグ要素をクリック(click)
		createElement.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		// ------ 新しい問題を作成 (NewPage) ------
		// titleのINPUTタグのを取得してから、"title"と入力(sendKeys)
		WebElement titleInput = newPage.getElementForINPUT_title();
		// .sendKeys("title");
		titleInput.sendKeys("title");
		// descriptionのINPUTタグのを取得してから、"description"と入力(sendKeys)
		WebElement descrInput = newPage.getElementForTEXTAREA_description();
		// .sendKeys("description");
		descrInput.sendKeys("description");
		// inputのINPUTタグのを取得してから、"input"と入力(sendKeys)
		WebElement input = newPage.getElementForTEXTAREA_input();
		// .sendKeys("input");
		input.sendKeys("input");
		// outputのINPUTタグのを取得してから、"3"と入力(sendKeys)
		WebElement output = newPage.getElementForTEXTAREA_output();
		// .sendKeys("3");
		output.sendKeys("3");
		// submitのBUTTONタグを取得してから、クリック(click)
		WebElement button = newPage.getElementForBUTTON_submit();
		// .click();
		button.click();

		// ------ 問題作成に成功したかチェック ------
	}
	@Test
	public void deleteProblem() {
		// 問題を作成
		createNewProblem();

		// ------------ 問題数で確認(IndexPage) ------------
		// 問題数を数える
		int oldProblemCount = 0; // .size();
		List<WebElement> oldElements = driver.findElements(By
				.cssSelector("ul > li"));
		oldProblemCount += oldElements.size();
		// 全てのdeleteのaタグを取得
		List<WebElement> deleteElements = indexPage.getElementsForA_delete();
		// 最後のdeleteのaタグを取得
		WebElement deleteElement = deleteElements
				.get(deleteElements.size() - 1);
		// 取得したタグ要素をクリック
		deleteElement.click();
		// 問題数を数える
		int newProblemCount = 0; // .size();
		List<WebElement> newElements = driver.findElements(By
				.cssSelector("ul > li"));
		newProblemCount += newElements.size();

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
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		// ---------------- SolvePage ----------------

		WebElement descri = solvePage.getElementForProblem_dot_description_();
		assertEquals(descri.getText(), "description");

		WebElement output = solvePage.getElementForProblem_dot_output_();
		assertEquals(output.getText(), "3");

		// codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
		WebElement code = solvePage.getElementForTEXTAREA_code();
		// .sendKeys("print 3");
		code.sendKeys("print 3");
		// submitのBUTTONタグを取得してから、クリック(click)
		WebElement button = solvePage.getElementForBUTTON_Submit();
		// .click();
		button.click();

		// ---------------- 結果の確認(assertEquals) ----------------
	}
}
