package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LastPage {
public WebDriver driver;
	
	public LastPage(WebDriver driver) {
		this.driver=driver;
	}

	By textRetrieveBox=By.xpath("//input[@value='My learning is superb so far.']");
	
	public WebElement textRetrieveBox() {
		return driver.findElement(textRetrieveBox);
	}
}
