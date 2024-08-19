package Stepdefintions;

import java.io.IOException;

import org.openqa.selenium.By;
import PageObjects.LastPage;
import Utilities.TestContextSetup;
import io.cucumber.java.en.Then;

public class SecondStepDefinition {
	public TestContextSetup testContextSetup; 
	public LastPage lastPage;
	public SecondStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		lastPage = testContextSetup.pageObjectManager.getLastPage();
	}
	
	@Then("User retrieves the value from the Retrieve the typed text option")
	public void user_retrieves_the_value_from_the_retrieve_the_typed_text_option() throws InterruptedException, IOException {
		String textRetrieved =lastPage.textRetrieveBox().getAttribute("value");
		Thread.sleep(2000);
		System.out.println(textRetrieved);	
	}

}
