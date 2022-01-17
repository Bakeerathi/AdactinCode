package stepDefinition;

import com.helperfile.File_Reader_Manager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.assigment.App;

public class LogIn extends App{
	
	@Given("User visits the HomePage")
	public void user_visits_the_home_page() {
		getUrl(File_Reader_Manager.getInstance().getInstanceData().getUrl());
		}

	@When("User enters the username in the username field")
	public void user_enters_the_username_in_the_username_field() {
	    
	}

	@And("User enters the password in the password field")
	public void user_enters_the_password_in_the_password_field() {
	    
	}

	@Then("User clicks submit button and it navigates to SearchHotel page")
	public void user_clicks_submit_button_and_it_navigates_to_search_hotel_page() {
	  
	}

	   



}