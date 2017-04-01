package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import pl.lait.PageObjects.MainPage;
import pl.lait.PageObjects.Reservation2Page;
import pl.lait.PageObjects.ReservationPage;
import pl.lait.PageObjects.SignOnPage;
import pl.lait.Setup.Init;

public class MainPageStepDefs extends Init{
	protected WebDriver driver;
	
	@Before
	public void init(){
		driver = getDriver();
	}
	
	@Given("^I open main page$")
	public void i_open_main_page(){
		System.out.println("krok pierwszy w naszym tescie");
		
	}
	
	@When("^I click link \"([^\"]*)\"$")
	public void i_click_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    MainPage main = new MainPage();
	    main.link_click(driver, arg1).click();
	    
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should see contact page$")
	public void i_should_see_contact_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Page title: " + driver.getTitle());
		Assert.assertEquals("Wrong page title", "Under Construction: Mercury Tours", driver.getTitle());
	}
	
	// -- logowanie
	
	@When("^I fill in login fields with \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_fill_in_login_fields_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    SignOnPage login = new SignOnPage();
	    login.loginAs(arg1, arg2, driver);
	}

	@Then("^I should see flights reservation page$")
	public void i_should_see_flights_reservation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Find a Flight: Mercury Tours:", driver.getTitle());
	}
	
	@When("^I fill reservation first page$")
	public void i_fill_reservation_first_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservPage = new ReservationPage();
		Reservation2Page reserv2page = new Reservation2Page();
		
		reservPage.radio_oneWay(driver);
		reservPage.selectPassengersCount(driver, "1");
		reservPage.selectDepartingFrom(driver, "New York");
		reservPage.selectFromMonth(driver, "March");
		reservPage.selectFromDay(driver, "2");
		reservPage.selectToPort(driver, "London");
		reservPage.selectToMonth(driver, "March");
		reservPage.selectToDay(driver, "22");
		reservPage.radioChooseClass_business(driver);
		reservPage.radioChooseClass_economy(driver);
		reservPage.radioChooseClass_first(driver);
		reservPage.selectAirline(driver, "No Preference");
		
		printScr("reservation");
		
		reservPage.buttonFindFlights(driver).click();
		
		printScr("reservation");
	}

	
	 
	@After
	public void end(){
		cleanUp();
	}
	
}
