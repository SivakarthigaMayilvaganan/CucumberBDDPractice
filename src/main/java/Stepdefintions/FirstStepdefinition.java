package Stepdefintions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.FirstPage;
import Utilities.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefinition {
	public TestContextSetup testContextSetup;
	public FirstPage firstpage;

	public FirstStepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		firstpage = testContextSetup.pageObjectManager.getFirstPage();
	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() throws IOException {
		System.out.println(testContextSetup.testBase.webDriverManager().getTitle());
		}
	

	@When("User clicks the textbox option from Element")
	public void user_clicks_the_textbox_option_from_element() throws IOException {
		firstpage.elementOption().click();
		firstpage.textBoxOption().click();
	}

	@Then("User enters the {string} in Type your name textbox")
	public void user_enters_the_in_type_your_name_textbox(String name) throws IOException {
	   firstpage.textBox().sendKeys(name);
	System.out.println("Text Entered in textbox");
	}

}
