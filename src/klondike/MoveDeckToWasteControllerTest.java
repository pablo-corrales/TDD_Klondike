package klondike;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveDeckToWasteControllerTest {
	
	private StartGameController startGameController;
	private MoveDeckToWasteController moveDeckToWasteController;	

	@Test
	public void moveTest() {
		
		startGameController = new StartGameController();
		moveDeckToWasteController = new MoveDeckToWasteController(startGameController);
		int sizeDeck = startGameController.sizeDeck();
		int sizeWaste = startGameController.sizeWaste();
		
		moveDeckToWasteController.move();
			
		if(startGameController.sizeDeck() >= 3){
				assertEquals(startGameController.sizeDeck(), (sizeDeck - 3) );
				assertEquals(startGameController.sizeWaste(), (sizeWaste + 3) );
		}
	}

}
