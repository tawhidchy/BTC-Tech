package util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CoreMethod {
	WebDriver dr;
	public CoreMethod(WebDriver dr) {
		this.dr=dr;
	}
	
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/tawhidchowdhury/Downloads/chromedriver");
		 dr= new ChromeDriver();
	}
	public void goToAnyWebsite(String url) {
		dr.get(url);
		
	}
	
	public void maximizeWindow() {
		dr.manage().window().maximize();
		
	}
	public void deleteAllCookie() {

		dr.manage().deleteAllCookies();
	}
	
	public void getCurrentUrl() {
		String currentUrl=dr.getCurrentUrl();
		System.out.println("The current url is :"+currentUrl);
	}
	public void verifyUrl(String ExpUrl) {
		String actUrl=dr.getCurrentUrl();
		boolean result = actUrl.equals(ExpUrl);
		System.out.println("The URL match is :"+result);
	}
	
	
	public void getCurrentTitle() {
		String currentTitle=dr.getTitle();
		System.out.println("The Title is :"+currentTitle);
	}
	public void verifyTitle(String ExpTitle) {
		String actTitle=dr.getTitle();
		boolean result=actTitle.equals(ExpTitle);
		
		System.out.println("The Title match is :"+result);
	}
	
	
	public void getText(By by) {
		String currentText=dr.findElement(by).getText();
		System.out.println("The current text is :"+currentText);
	}
	public void verifyText(By by,String ExpText) {
		
		String actText=dr.findElement(by).getText();
		boolean result=actText.equals(ExpText);
		System.out.println("The text match is :"+result);
	}
	
	public void clickOnElement(By by) {
		dr.findElement(by).click();
		
	}
	public void typeOnElement(By by, String text) {
		dr.findElement(by).sendKeys(text);
		
	}
	
	public void catchSingleElement(By by) {
		WebElement ele=dr.findElement(by);
		
	}
	public void catchMultipleElements(By by,int index) {
		
		List<WebElement> e=dr.findElements(by);
		e.get(index);
		
	}
	
	
	public void elementIsDisplayed(By by) {
		boolean result=dr.findElement(by).isDisplayed();
		System.out.println("The element is displayed : "+result);
	}
	public void elementIsSelected(By by) {
		boolean result = dr.findElement(by).isSelected();
		System.out.println("The element is selected : "+result);
	}
	public void elementIsEnabeled(By by) {
		boolean result=dr.findElement(by).isEnabled();
		System.out.println("The element is enabled :"+result);
	}
		
	public void navigateBack() {
		dr.navigate().back();
	}
	public void getHeaderText(By by) {
		String text=dr.findElement(by).getText();
		System.out.println("The header text is :"+text);
	}
	public void takeScreenshot(String fileName) throws IOException {
		//1.Take Screenshot and store it as a file format:
		File file=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		//2.now copy the screenshot to desired location using copyfile method:
		Files.copy(file,new File("/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/ScreenShots/"+fileName+".jpg"));

	}
	
    public void closeBrowser() {
		dr.quit();
	}
	
	
	public void implicitWait() {
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}


}
