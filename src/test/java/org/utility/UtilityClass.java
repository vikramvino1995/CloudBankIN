package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	public static WebDriver driver;

	public WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		return driver = new ChromeDriver();
	}

	public void loadUrl(String url) {

		driver.get(url);

		maximize();

	}

	public String getUrl() {

		return driver.getCurrentUrl();

	}

	public String getTitle() {

		return driver.getTitle();

	}

	public void maximize() {

		driver.manage().window().maximize();
	}

	public void enterText(WebElement element, String text) {

		element.sendKeys(text);

	}

	public String userInput(WebElement element) {

		return element.getAttribute("value");

	}

	public void implicitWait(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

    public void explicitlyWait(int sec, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, sec);

		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}
    
    public void waitTillElementPresent(int sec,String path) {

		WebDriverWait wait = new WebDriverWait(driver, sec);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

	}
    
    
	
	public String attributeValue(WebElement element, String attributeName) {

		return element.getAttribute(attributeName);

	}

	public String getWebText(WebElement element) {

		return element.getText();

	}

	public void leftClick(WebElement element) {

		new Actions(driver).click(element).perform();

	}

	public void rightClick(WebElement element) {

		new Actions(driver).contextClick(element).perform();
		;

	}

	public void doubleClick(WebElement element) {

		new Actions(driver).doubleClick(element).perform();

	}

	public void mouseOver(WebElement element) {

		new Actions(driver).moveToElement(element).perform();

	}

	public void dragAndDrop(WebElement source, WebElement destination) {

		new Actions(driver).dragAndDrop(source, destination);

	}

	public void javaScriptEnterText(WebElement element, String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value'," + text + ")", element);

	}

	public Object javaScriptGetUserInput(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		return js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public void javaScriptClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", element);

	}

	public void scrollDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollUp(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public void dropDownByValue(WebElement element, String value) {

		new Select(element).selectByValue(value);

	}

	public void dropDownBytext(WebElement element, String visibleText) {

		new Select(element).selectByVisibleText(visibleText);

	}

	public void dropDownByIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public void dropDownDeselectByValue(WebElement element, String value) {

		new Select(element).deselectByValue(value);

	}

	public void dropDownDeselectBytext(WebElement element, String visibleText) {

		new Select(element).deselectByVisibleText(visibleText);

	}

	public static void dropDownDeselectByIndex(WebElement element, int index) {

		new Select(element).deselectByIndex(index);

	}

	public void switchToFrameByWebElement(WebElement element) {

		driver.switchTo().frame(element);
	}

	public void switchToFrameByIdOrName(String s) {

		driver.switchTo().frame(s);
	}

	public void switchToFrameByIndex(int index) {

		driver.switchTo().frame(index);
	}

	public int frameCount() {

		return driver.findElements(By.tagName("iframe")).size();

	}
	
	public void handleConfirmAlert() {
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
	}

	public void pressEnter() throws AWTException {
		
		Robot rob =new Robot();
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
}
