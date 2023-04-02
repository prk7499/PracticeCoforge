package StepDefination;

import BaseLayer.BaseClass;
import Pagelayer.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	@Before
	public void initialisation() {
		BaseClass.init();
	}

	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		System.out.println("user is on loginpage" + driver.getCurrentUrl());
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		LoginPage lg = new LoginPage();
		lg.userEnterUname(username);
		lg.userEnterPass(password);
		lg.userClickOnLogin();
	}

	@Then("user validate homepage of freecrm")
	public void user_validate_homepage_of_freecrm() {
		System.out.println("user is on homepage" + driver.getCurrentUrl());
	}

}
