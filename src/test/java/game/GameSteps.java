package game;

import java.io.PrintStream;

import org.mockito.Mockito;

import sun.security.util.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// This is acceptance test - what are the requirements? Unit-tests are technical requirements :)
// We start with tests and then move to implementation
// We started without any knowledge about the target game
// and we started already working, we did minimal amount of code
public class GameSteps {
	
	PrintStream out = null;
	Game game = null;
	
	// NB! From cucumber, not from junit as in GameTests
	@Before
	public void setUp() {
		out = Mockito.mock(PrintStream.class);
	    System.setOut(out);
	}
	
	@Given("^I am not yet playing$")
	public void I_am_not_yet_playing() throws Throwable {
	}

	@When("^I start a new game$")
	public void I_start_a_new_game() throws Throwable {
	    new Game();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String msg) throws Throwable {
	    Mockito.verify(out).println(msg); //only a requirement, not related to implementation!
	}
	
	
	
	@Given("^the secret code is \"([^\"]*)\"$")
	public void the_secret_code_is(String code) throws Throwable {
	    game = new Game(code);
	}

	@When("^I guess \"([^\"]*)\"$")
	public void I_guess(String str) throws Throwable {
	    game.enterGuess(str);
	}

	@Then("^the mark should be \"([^\"]*)\"$")
	public void the_mark_should_be(String mark) throws Throwable {
	    Mockito.verify(out).println(mark);
	}
}
