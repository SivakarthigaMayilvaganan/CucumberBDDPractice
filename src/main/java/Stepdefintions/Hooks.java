package Stepdefintions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetup.testBase.webDriverManager();
		if (scenario.isFailed()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(src);
			String name=scenario.getName()+".image";
			scenario.attach(fileContent, "image/png", name);
		}
	}

	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.webDriverManager().quit();
	}
	
	@Before
	public void MaximizeWindow() throws IOException {
		testContextSetup.testBase.webDriverManager().manage().window().maximize();
	}
}
