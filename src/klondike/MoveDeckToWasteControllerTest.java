package klondike;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveDeckToWasteControllerTest {
	
	private StartGameController startGameController;
	private MoveDeckToWasteController moveDeckToWasteController;	

	@Test
	public void moveTest() {
		int sizeDeck, sizeWaste;
		startGameController = new StartGameController();
		moveDeckToWasteController = new MoveDeckToWasteController(startGameController);
			
		if( startGameController.sizeDeck() >= 3){
			sizeDeck = startGameController.sizeDeck();
			sizeWaste = startGameController.sizeWaste();
			moveDeckToWasteController.move();
			assertEquals(startGameController.sizeDeck(), (sizeDeck - 3) );
			assertEquals(startGameController.sizeWaste(), (sizeWaste + 3) );
		}
		
		if( startGameController.sizeDeck() > 0){
			startGameController.setSizeDeck(1);
			sizeDeck = startGameController.sizeDeck();
			sizeWaste = startGameController.sizeWaste();
			moveDeckToWasteController.move();
			assertEquals(startGameController.sizeDeck(), 0);
			assertEquals(startGameController.sizeWaste(), (sizeWaste + sizeDeck));
		}
		
		if( startGameController.sizeDeck() == 0){
				startGameController.setSizeDeck(0);
				sizeWaste = startGameController.sizeWaste();
				moveDeckToWasteController.move();
				assertEquals(startGameController.sizeDeck(), 0);
				assertEquals(startGameController.sizeWaste(), sizeWaste);
		
		}
	}

}
