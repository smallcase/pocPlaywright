package scSubscriptions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Login {
	public static void main(String[] args)
	{
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//Page page = browser.newPage();
		//page.navigate("https:stag.smallcase.com");
		
		
		BrowserContext browsCon = browser.newContext();
		Page homePage = browsCon.newPage();
		homePage.navigate("https://stag.smallcase.com");
		String title = homePage.title();
		System.out.println(title);
		
		//Clicking on Login
		Locator login = homePage.locator("xpath = //*[@id=\"__next\"]/div[1]/header/nav/div/div[4]/button");
		login.click();
		//Entering Mobile No
		Locator phoneNo = homePage.locator("xpath = //*[@id=\"__next\"]/div[2]/div/div[1]/div[3]/div/div/input");
		phoneNo.fill("8447122165");
		//Clicking on Get OTP
		Locator getOTPcta = homePage.locator("xpath = //*[@id=\"__next\"]/div[2]/div/div[1]/button");
		getOTPcta.click();
		
		//enter otp
		Locator otpBox1 = homePage.locator("xpath = //input[@data-testid='otp-input-0']");
		otpBox1.fill("9");
		Locator otpBox2 = homePage.locator("xpath = //input[@data-testid='otp-input-1']");
		otpBox2.fill("9");
		Locator otpBox3 = homePage.locator("xpath = //input[@data-testid='otp-input-2']");
		otpBox3.fill("9");
		Locator otpBox4 = homePage.locator("xpath = //input[@data-testid='otp-input-3']");
		otpBox4.fill("9");
		
		//homePage.close();
		//pw.close();
		
	}
}
////input[@data-testid='otp-input-0']
//