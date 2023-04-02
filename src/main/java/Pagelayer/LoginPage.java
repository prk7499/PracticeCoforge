package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userEnterUname(String uname) {
		username.sendKeys(uname);
	}
	
	public void userEnterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void userClickOnLogin() {
		loginbutton.click();
	}
	
	


}
