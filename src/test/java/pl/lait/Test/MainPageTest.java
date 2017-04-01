package pl.lait.Test;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import pl.lait.PageObjects.MainPage;
import pl.lait.Setup.Init;

public class MainPageTest extends Init{
	
	protected static WebDriver driver;
	
	//@Before
	public void run(){
		driver = getDriver();
	}
	
	//@Test
	public void test1_mainMenu(){
		MainPage main = new MainPage();
		main.link_contact(driver).click();
		main.link_support(driver).click();
		main.link_register(driver).click();
		main.link_signOn(driver).click();
	}
	
	
	

}
