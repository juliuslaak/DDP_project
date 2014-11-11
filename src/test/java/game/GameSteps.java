package game;

import java.io.PrintStream;

import org.mockito.Mockito;

import sun.security.util.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GameSteps {
	@Given("^I am not yet playing$")
	public void I_am_not_yet_playing() throws Throwable {
	}

	@When("^I start a new game$")
	public void I_start_a_new_game() throws Throwable {
	    new Game();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String msg) throws Throwable {
	    PrintStream out = Mockito.mock(PrintStream.class);
	    
	    System.setOut(out);
	    
	    Mockito.verify(out).println(msg); //only a requirement, not related to implementation!
	}
}
