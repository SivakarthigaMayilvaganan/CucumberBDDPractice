package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	public WebDriver driver;
	
	public FirstPage(WebDriver driver) {
		this.driver= driver;
	}
	By elementOption=By.xpath("//li[@id='menuform:j_idt40']");
	By textBoxOption=By.xpath("//li[@id='menuform:m_input']");
	By textBox=By.xpath("//input[@id='j_idt88:name']");
	
	public WebElement elementOption() {
		return driver.findElement(elementOption);
	}
	public WebElement textBoxOption() {
		return driver.findElement(textBoxOption);
	}
	public WebElement textBox() {
		return driver.findElement(textBox);
	}
	
}
