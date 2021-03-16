package util;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseMethod {
	 WebDriver dr;
	public BaseMethod(WebDriver dr) {
		this.dr=dr;
	}
	
	public void callCore() throws InterruptedException, IOException {
		CoreMethod tg=new CoreMethod(dr);
		//tg.setBrowser();
		//tg.goToAnyWebsite("https://www.target.com/");
		tg.maximizeWindow();
		tg.deleteAllCookie();
		tg.verifyUrl("https://www.target.com/");
		System.out.println("modify");
		Thread.sleep(3000);
		tg.clickOnElement(By.cssSelector("#account > span.AccountLink__SvgUserWrapper-gx13jw-0.cmGbcQ > span > div > svg"));
		Thread.sleep(3000);
		tg.clickOnElement(By.cssSelector("#accountNav-createAccount > a > div"));
		Thread.sleep(3000);
		tg.typeOnElement(By.id("username"), "abcd@abcd.com");
		Thread.sleep(3000);
		tg.typeOnElement(By.id("firstname"), "abcddd");
		tg.typeOnElement(By.id("lastname"), "gfgd");
		tg.typeOnElement(By.id("password"), "09i9i9i9i8");
		Thread.sleep(3000);
		//tg.elementIsDisplayed(By.cssSelector("#root > div > div.styles__AuthContainerWrapper-sc-1eq9g2f-1.drifUu > div > div.BullseyeIcon__IconBox-sc-1upomiv-0.jdrMHR > span > div > svg"));
		Thread.sleep(3000);
		//tg.clickOnElement(By.xpath("//input[@id=\"object-object\"]"));
		tg.clickOnElement(By.cssSelector("#root > div > div.styles__AuthContainerWrapper-sc-1eq9g2f-1.drifUu > div > div.sc-kvZOFW.jBIJJk > form > div.sc-jzJRlG.fnsyem.sc-cmTdod.hOYdWd.nds-checkbox > label > div"));
		Thread.sleep(3000);
		tg.clickOnElement(By.cssSelector("#createAccount"));
		tg.takeScreenshot("Target_SignUp");
	
	
	
	
	}
	public void Toplinks() throws InterruptedException, IOException {
		CoreMethod tg=new CoreMethod(dr);
		
		List<WebElement> e = dr.findElements(By.xpath("//div[@id='header']/div//ul/li"));
		
		int size = e.size();
		for (int i = 1; i <size; i++) {
			Thread.sleep(4000);
			dr.findElement(By.xpath("//div[@id='header']/div//ul/li[" + i + "]/a")).click();
			tg.getCurrentTitle();
			tg.takeScreenshot("Target");
			Thread.sleep(4000);
			if(i==6) {
				dr.findElement(By.xpath("//div[@id=\"footer-logo\"]/a")).click();
				break;
			}
			dr.navigate().back();
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
