package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

//<IMPORTS>

public class feature1Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By GoogleSearchBoxText = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

//<XPATHS>

/*Page Constructor*/
public feature1Page(){

}


public feature1Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
