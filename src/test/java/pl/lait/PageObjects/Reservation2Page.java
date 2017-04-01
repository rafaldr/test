package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reservation2Page {
	
	static String radioDepart_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
	static String radioReturn_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input";
	static String inputReserve_name = "reserveFlights";
	//page3 elements
	static String input_passFirst0_name = "passFirst0";
	static String input_passLast0_name = "passLast0";
	static String select_passMeal_name = "pass.0.meal";
	static String select_creditCard = "creditCard";
	static String input_creditnumber = "creditnumber";
	static String select_cc_exp_dt_mn = "cc_exp_dt_mn";
	static String select_cc_exp_dt_yr ="cc_exp_dt_yr";
	static String input_cc_mid_name = "cc_mid_name";
	static String input_cc_first_name = "cc_frst_name";		
	static String input_cc_last_name = "cc_last_name";
	static String input_billAddress1_name = "billAddress1";
	static String checbox_ticketLess = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	
	static String button_buyFlights = "buyFlights";
	
	public WebElement radio_depart2(WebDriver driver){
		return driver.findElement(By.xpath(radioDepart_xpath));
	}
	
	public WebElement radio_return2(WebDriver driver){
		return driver.findElement(By.xpath(radioReturn_xpath));
	}
	
	public WebElement button_continue(WebDriver driver){
		return driver.findElement(By.name(inputReserve_name));
	}
	//page3
	public WebElement input_passFirst(WebDriver driver){
		return driver.findElement(By.name(input_passFirst0_name));
	}
	public WebElement input_passLast(WebDriver driver){
		return driver.findElement(By.name(input_passLast0_name));
	}
	//alt dla obu powyżej!!!
	public void fillPassNames(String first, String last, WebDriver driver){
		driver.findElement(By.name(input_passFirst0_name)).sendKeys(first);
		driver.findElement(By.name(input_passLast0_name)).sendKeys(last);
	}
	public Select selectPassMeal(WebDriver driver){
		return new Select(driver.findElement(By.name(select_passMeal_name)));
	}
	public Select selectCreditCard(WebDriver driver){
		return new Select(driver.findElement(By.name(select_creditCard)));
	}
	public WebElement input_creditnumber(WebDriver driver){
		return driver.findElement(By.name(input_creditnumber));
	}
	public Select selectCCexpMonth(WebDriver driver){
		return new Select(driver.findElement(By.name(select_cc_exp_dt_mn)));
	}
	public Select selectCCexpYear(WebDriver driver){
		return new Select(driver.findElement(By.name(select_cc_exp_dt_yr)));
	}
	public void fillCreditOwner(String first, String mid, String last, WebDriver driver){
		driver.findElement(By.name(input_cc_first_name)).sendKeys(first);
		driver.findElement(By.name(input_cc_mid_name)).sendKeys(mid);
		driver.findElement(By.name(input_cc_last_name)).sendKeys(last);
	}
	public WebElement checboxTicketLessTravel(WebDriver driver){
		return driver.findElement(By.xpath(checbox_ticketLess));
	}
	public WebElement inputBillAddress(WebDriver driver){
		return driver.findElement(By.name(input_billAddress1_name));
	}
	
	
	
	
	public WebElement buttonBuyFlights(WebDriver driver){
		return driver.findElement(By.name(button_buyFlights));
	}

}















