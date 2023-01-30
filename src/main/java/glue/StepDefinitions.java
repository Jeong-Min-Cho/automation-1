package glue;

import com.google.common.collect.Iterables;
import framework.Settings;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AADriver;
import framework.WebDriverFactory;

import static org.junit.Assert.assertTrue;
import java.util.Properties;


import org.apache.commons.lang.RandomStringUtils;
import pageobject.feature1Page;
import pageobject.feature2Page;
//<IMPORTS>

public class StepDefinitions {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
private static Properties properties;
private String portal;
private String environment;



public StepDefinitions(WebDriverFactory contentSteps){
this.driver = contentSteps.getDriver();
myDriver = new AADriver(driver);
this.properties = Settings.getProperties();
}


@After
public void tearDown(Scenario scenario) throws InterruptedException{
if (scenario.isFailed()) {
Set<String> windows = driver.getWindowHandles();
driver.switchTo().window(Iterables.getLast(windows));
try {
byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
scenario.write("Scenario Failed!");
scenario.embed(screenshot, "image/png");
} catch (Exception e) {
// TODO: handle exception
e.printStackTrace();

}
}
//Slow down the script
Thread.sleep(10000);

}



 @Given("^user opens to \"([^\"]*)\"$")
public void method0(String param11) throws Throwable {
// Write code here that turns the phrase above into concrete actions//navigation2
driver.get(param11);//<CODE>
}

 @Then("^user types \"([^\"]*)\" text into \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method1(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//<CODE>
}

 @And("^user waits \"([^\"]*)\" seconds$")
public void method2(String param31) throws Throwable {
// Write code here that turns the phrase above into concrete actions//waits1
int seconds = Integer.parseInt(param31);
int milliseconds = 1000;
Thread.sleep(seconds*milliseconds);//<CODE>
}

 //<METHOD>


}