package jp.ac.waseda.wpcs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {
	private FirefoxDriver driver;

	@Before
	public void before() {
		driver = new FirefoxDriver();
		driver.get("http://wpcs.heroku.com/");
	}

	@After
	public void after() {
		// driver.close();
	}

	@Test
	public void testLogin() {
		WebElement nameText = driver.findElement(By.name("name"));
		WebElement passText = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("commit"));
		nameText.sendKeys("test");
		passText.sendKeys("test");
		loginButton.submit();
		WebElement element = driver.findElement(By.cssSelector("tr > td > a"));
		element.click();
	}
}
