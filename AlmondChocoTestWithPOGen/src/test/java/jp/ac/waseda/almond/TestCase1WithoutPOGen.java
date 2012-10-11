package jp.ac.waseda.almond;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
	public void editProblem() {
		// ------ 問題編集ページヘ移動 (IndexPage) ------
		// 全てのeditのaタグを取得
		List<WebElement> editElements = driver.findElements(By
				.cssSelector("ul > li > a"));
		// 最後のeditのaタグを取得
		WebElement editElement = editElements.get(editElements.size() - 2);
		// 取得したタグ要素をクリック
		editElement.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		// ------ 問題の編集 (EditPage) ------
		// descriptionのTEXTAREAタグを取得
		WebElement descriptionElement = driver.findElement(By
				.name("description"));
		String pre = descriptionElement.getText();

		// 2という文字列を追加入力(sendKeys)
		descriptionElement.sendKeys("2");

		// inputのTEXTAREAタグを取得
		WebElement inputElement = driver.findElement(By.name("input"));
		// 2という文字列を追加入力(sendKeys)
		inputElement.sendKeys("2");

		// UpdateのBUTTONタグを取得してから、クリック(click)
		// .click();
		WebElement button = driver.findElement(By.cssSelector("button"));
		button.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		// ------ トップページに戻る(LayoutPage) ------
		// トップページに戻る（layoutPageにあるロゴをclick）
		// .click();
		WebElement top = driver.findElement(By.cssSelector("a"));
		top.click();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		// ------ 問題を解くページに移動 (IndexPage) ------
		// 全てのsolveのaタグを取得
		List<WebElement> solveElements = driver.findElements(By
				.cssSelector("ul > li > a"));
		// 最後のsolveのaタグを取得
		WebElement solveElement = solveElements.get(solveElements.size() - 3);
		// 取得したタグ要素をクリック
		solveElement.click();

		// ------ 内容が更新されていることを確認 ------
		List<WebElement> elements = driver.findElements(By.cssSelector("pre"));
		WebElement descri = elements.get(0);
		assertEquals(descri.getText(), pre + "2");

	}

	@Test
	public void solveProblemWithOK() {
		// ---------------- IndexPage ----------------
		// 全てのsolveのaタグを取得
		List<WebElement> solveElements = driver.findElements(By
				.cssSelector("ul > li > a"));

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
		WebElement code = driver.findElement(By.name("code"));
		// .sendKeys("print 3");
		code.sendKeys("print 3");
		// submitのBUTTONタグを取得してから、クリック(click)
		WebElement button = driver.findElement(By.cssSelector("button"));

		// .click();
		button.click();

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		// ---------------- 結果の確認(assertEquals) ----------------
	}
	@Test
	public void solveProblemWithNG() {
		// ---------------- IndexPage ----------------
		// 全てのsolveのaタグを取得
		List<WebElement> solveElements = driver.findElements(By
				.cssSelector("ul > li > a"));
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
		WebElement code = driver.findElement(By.name("code"));
		// .sendKeys("print 4");
		code.sendKeys("print 4");
		// submitのBUTTONタグを取得してから、クリック(click)
		WebElement button = driver.findElement(By.cssSelector("button"));
		// .click();
		button.click();

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		// ------ 結果の確認(assertEquals) ----------------

	}

	@Test
	public void solveProblemWithRuby() {
		// ---------------- IndexPage ----------------
		// 全てのsolveのaタグを取得
		List<WebElement> solveElements = driver.findElements(By
				.cssSelector("ul > li > a"));
		// 最後のsolveのaタグを取得
		WebElement solveElement = solveElements.get(solveElements.size() - 3);
		// 取得したタグ要素をクリック
		solveElement.click();

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}

		// ---------------- SolvePage ----------------
		// 言語を選ぶSELECTタグを取得
		WebElement langElement = driver.findElement(By.name("lang"));
		// Rubyを選択
		new Select(langElement).selectByVisibleText("Ruby");

		// codeのTEXTAREAタグのを取得してから、"print 3"と入力(sendKeys)
		WebElement code = driver.findElement(By.name("code"));
		// .sendKeys("puts 3");
		code.sendKeys("puts 3");
		// submitのBUTTONタグを取得してから、クリック(click)
		WebElement button = driver.findElement(By.cssSelector("button"));
		// .click();
		button.click();

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		// ---------------- 結果の確認(assertEquals) ----------------
	}
}
