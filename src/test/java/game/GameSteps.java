package game;

import sun.security.util.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GameSteps {
	@Given("^I am not yet playing$")
	public void I_am_not_yet_playing() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I start a new game$")
	public void I_start_a_new_game() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
