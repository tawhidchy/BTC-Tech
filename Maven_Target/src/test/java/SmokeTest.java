import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.BaseMethod;
import util.CallingCore;

public class SmokeTest  {

	static Properties prop;
	static WebDriver dr;

	@BeforeClass
	public static void openBrowser() throws IOException, InterruptedException {
		CallingCore t = new CallingCore();
		prop = t.testing();

		String bro = prop.getProperty("browser");
		if (bro.equals("Chrome")) {

//			System.setProperty("webdriver.chrome.driver",
//					"/Users/tawhidchowdhury/eclipse-workspace/Maven_Target/Drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");


			dr = new ChromeDriver();

			System.out.println("open chrome browser");
			
		} else if (bro.equals("FireFox")) {

			System.out.println("open firefox browser");
		}
		//dr.get(prop.getProperty("url"));
	}

	@Test
	public void testingSignUp1() throws InterruptedException, IOException {

		dr.get(prop.getProperty("url"));
		BaseMethod ex = new BaseMethod(dr);
		ex.callCore();
	}

	@Test
	public void testingTopLinks2() throws InterruptedException, IOException {

		dr.get(prop.getProperty("url"));
		BaseMethod ex = new BaseMethod(dr);
		ex.Toplinks();
	}

	@AfterClass
	public static void tearDown() {
		dr.quit();
	}
}
