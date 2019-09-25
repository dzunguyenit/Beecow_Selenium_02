package Common;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommomFunctions {
	protected WebDriver driver;

	public CommomFunctions(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {

		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void backToPage(String url) {
		driver.navigate().to(url);
	}

	public void forwardToPage() {
		driver.navigate().back();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void clickToElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public String getTextElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public void clearElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
	}

	public void inputElement(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	public void selectCombobox(String locator, String value) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		element.selectByVisibleText(value);
	}

	public String getTextComboboxSelected(String locator) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		return element.getFirstSelectedOption().getText();
	}

	public String getAttribute(String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}

	public int getSizeOfList(String locator) {
		java.util.List<WebElement> element = driver.findElements(By.xpath(locator));
		return element.size();
	}

	public boolean isElementDisplayed(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isElementSelected(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isElementEnabled(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void inputAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	public void switchWindowByTitle(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			driver.switchTo().window(childWindows);
			String childTitle = driver.getTitle();
			if (childTitle.equals(title)) {
				break;
			}
		}
	}

	public String getWindow() {
		return driver.getWindowHandle();
	}

	public void switchToIframe(String locator) {
		WebElement iframe = driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframe);
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void houverMouse(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void doubleMouse(String locator) {
		WebElement doubleclick = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).perform();
	}

	public void Rightclick(String locator) {
		WebElement rightclick = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver).contextClick(rightclick);
		action.build().perform();
	}

	public void dragAndDrop(String locatorFrom, String locatorTarget) {
		WebElement drag = driver.findElement(By.xpath(locatorFrom));
		WebElement target = driver.findElement(By.xpath(locatorTarget));
		Actions actions = new Actions(driver);
		actions.clickAndHold(drag).moveToElement(target).release(target).build().perform();
	}

	public void clickAndhold(String locator, int itemTarget, int itemFrom) {
		List<WebElement> listItems = driver.findElements(By.xpath(locator));
		Actions action = new Actions(driver);
		action.clickAndHold(listItems.get(itemFrom)).clickAndHold(listItems.get(itemTarget)).click().perform();
		action.release();
	}

	public void senKeyPress(String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(key);
	}

	public void uploadBySenkey(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	public void executeScriptBrowser(String javaScript) {
		JavascriptExecutor javascrip = (JavascriptExecutor) driver;
		javascrip.executeScript(javaScript);
	}

	public void executeScriptElement(String locator) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(locator));
		javascript.executeScript("arguments[0].click();", element);
	}

	public Object scrollToBottomPage() {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		return javascript.executeScript("$('html, body').animate({scrollTop:$(document).height()}, 'slow')");
	}

	public Object scrollToElement(String locator) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		return javascript.executeScript("$('body').scrollTo(locator)");
	}

	public void highlightElement(String locator) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript(locator);
	}

	public Object removeAttributeElement(String locator, String attribute) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		return javascript.executeScript("$(locator).removeAttr(attribute)");
	}

	public void waitForElementPresence(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}

	public void waitForElementVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

	}

	public void waitForDynamicVisible(String locator, String dynamic) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String dynamicLocator = String.format(locator, dynamic);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dynamicLocator)));

	}

	public void waitForAlertPresence() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void selectComboboxSpecial(String locatorButton, String locatorList, String valueSelect) {
		WebElement dropdown = driver.findElement(By.xpath(locatorButton));
		dropdown.click();
		List<WebElement> list = driver.findElements(By.xpath(locatorList));
		for (WebElement element : list) {
			if (element.getText().equalsIgnoreCase(valueSelect)) {
				element.click();
				break;
			}
		}

	}

	public void input(String locator, String value, String dynamic) {
		String dynamicLocator = String.format(locator, dynamic);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		element.sendKeys(value);
	}

	public String getTextDynamicElement(String locator, String dynamic) {
		String dynamicLocator = String.format(locator, dynamic);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		return element.getText();
	}

	public void clickDynamicElement(String locator, String dynamic) {
		String dynamicLocator = String.format(locator, dynamic);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		element.click();
	}

	public String getTextByJs(String js) throws Exception {
		Thread.sleep(1000);
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		return javascript.executeScript("return " + js).toString();
	}
}
