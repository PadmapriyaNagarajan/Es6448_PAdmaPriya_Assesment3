package com.demowebapp;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDefinition {
	StepDefinitionForRegister wish = new StepDefinitionForRegister();
	@Given("User in the HomePage")
	public void user_in_the_home_page() {
	    HelperClass.openingPage("https://demowebshop.tricentis.com/");
	}
	@When("User login to Account")
	public void user_login_to_account() {
	
	}
	@When("User adds product to wishlist")
	public void user_adds_product_to_wishlist() {
		
	
	}
	@When("user remove from wihslist")
	public void user_remove_from_wihslist() {
	 
	}
	@Then("User see empty wishList message")
	public void user_see_empty_wish_list_message() {
	   
	}
 
 
}


