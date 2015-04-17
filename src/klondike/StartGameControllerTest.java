package klondike;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class StartGameControllerTest {
	
	private StartGameController startGameController;
	
	@Before
	public void before(){
			startGameController = new StartGameController();
	}

	@Test
	public void sizeWasteTest() {
		
		StartGameController startGameController = new StartGameController();
		
		assertEquals(0,startGameController.sizeWaste());
		
	}
	
	@Test
	public void sizeFoundationsTest() {
			ArrayList<Integer> sizeFoundations = startGameController.sizeFoundations();
			assertEquals(4, sizeFoundations.size());
			for(int sizeFoundation: sizeFoundations){
				assertEquals(0, sizeFoundation);
			}
	}
	
	@Test
	public void sizeDeckTest() {
			assertEquals(24,startGameController.sizeDeck());
	}
	
	@Test
	public void sizeTableausTest() {
			ArrayList<Integer> sizeTableaus = startGameController.sizeCoveredCardsTableaus();
			ArrayList<Stack<Card>> uncoveredCardsStackTableaus= startGameController.uncoveredCardsStackTableaus();
			assertEquals(7, sizeTableaus.size());
			assertEquals(7, uncoveredCardsStackTableaus.size());
			
			for(int i = 0; i < sizeTableaus.size(); i++)
				assertEquals(new Integer(i+1), sizeTableaus.get(i));
			
			for(Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus){
				assertEquals(1, uncoveredCardsStack.size());
				assertTrue(uncoveredCardsStack.peek().uncovered());
			}
		
	}

	

}
