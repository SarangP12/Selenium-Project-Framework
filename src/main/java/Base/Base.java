package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.WAC_Pages.User_Authontication.LoginPages;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public Properties dataPrope;

	public Base() {

		// to retrive first config file.
		prop = new Properties();
		File proFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\Config\\config.properties");

		try {
			FileInputStream fiS = new FileInputStream(proFile);
			prop.load(fiS);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		// to retrive second config file
		dataPrope = new Properties();
		File dataproFile = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\Config\\testData.properties");

		try {
			FileInputStream fis1 = new FileInputStream(dataproFile);
			dataPrope.load(fis1);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

//-----------------------------copy and paste here code for reducesetup method-------------------------------------------
	public WebDriver initializeBrowserAndOpenApplicationURL(String browserNameString) {

		// browserNameString="chrome";------equalIgnore case beacause we can wright
		// capital or small latter in config file
		if (browserNameString.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserNameString.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserNameString.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserNameString.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Utilities.IMPLICITE_WAIT_TIME);
		// driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIME);
		driver.get(prop.getProperty("urlConfig"));

		return driver;
	}

	// Lounch Login Page
	public void loginLounch() {

		LoginPages log = new LoginPages(driver);
		log.enterEmail(prop.getProperty("valideEmailConfig"));// we have dont use sendkey method
		log.enterPass(prop.getProperty("validPassConfig"));
		log.loginButton();
//		DashboardPage dash=new DashboardPage(driver);
//		
//		Assert.assertTrue(dash.getDisplayStatusInDashboard(),"there is not display the option Dashboard");

	}

	public void childWindoHandlle_JBK() throws Exception {

		String parenthandle = driver.getWindowHandle();

		Set<String> handle = driver.getWindowHandles();

		for (String h1 : handle) {
			// System.out.println(handle);

			if (!h1.equals(parenthandle)) {
				// Go to Child Window
				driver.switchTo().window(h1);
				System.out.println("Window  :" + driver.getTitle());
				Thread.sleep(1000);
				// Assert.assertEquals("", driver.getTitle());
				driver.close();

			}
		}
		// Return to Parent window
		driver.switchTo().window(parenthandle);
		System.out.println("Window2 :" + driver.getTitle());
		Thread.sleep(2000);
	}
}
