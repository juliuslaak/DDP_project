package game;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
// Try to do one step at a time and do the minimum
public class GameTests {
	
	PrintStream out = null;
	
	// Before any testing we have to setup the mocking
	@Before
	public void setUp() {
		out = Mockito.mock(PrintStream.class);
	    System.setOut(out);
	}
	
	@Test
	public void test() {
		new Game();
	    Mockito.verify(out).println("Welcome to Codebreaker!"); //only a requirement, not related to implementation!
	    Mockito.verify(out).println("Enter guess:");
	}
	
	@Test
	public void testNoMatches() {
		Game game = new Game("1234");
		game.enterGuess("5555");
	    Mockito.verify(out).println("");
	}

}
