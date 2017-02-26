package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BankOpenPage {

	WebDriver dr = null;

	public void Account(String browser) {

		// server configuration
		// if firefox
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E://AllSoftwares//geckodriver.exe");
			dr = new FirefoxDriver();
		}
		// if chrome
		else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E://AllSoftwares//chromedriver.exe");
			dr = new ChromeDriver();
		}
		// if ie
		else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "E://AllSoftwares//IEDriverServer.exe");
			dr = new InternetExplorerDriver();
		}
		// maximize code
		dr.manage().window().maximize();
		// implicit wait code
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter url code
		dr.get("http://demo.guru99.com/v4/");
	
		dr.findElement(By.name("uid")).sendKeys("mngr59476");
		dr.findElement(By.name("password")).sendKeys("hUhetep");
		dr.findElement(By.name("btnLogin")).click();
	}

	public static void main(String[] args) {
		new BankOpenPage().Account("chrome");

	}
}
