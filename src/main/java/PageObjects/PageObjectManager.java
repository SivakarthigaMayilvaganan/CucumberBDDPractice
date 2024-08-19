package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
public WebDriver driver;
public FirstPage firstPage;
public LastPage lastPage;
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
	}
	
	public FirstPage getFirstPage() {
		firstPage= new FirstPage(driver);
		return firstPage;
	}
	public LastPage getLastPage() {
		lastPage=new LastPage(driver);
		return lastPage;
		
	}
	
}
