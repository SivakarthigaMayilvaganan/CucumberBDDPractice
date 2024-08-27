package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Sivakarthiga\\eclipse-workspace\\UiAutomationCucumberBDD\\src\\test\\Resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
					}
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.edge.driver", "C:\\eclipse\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
					}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		return driver;
		
	}
}
