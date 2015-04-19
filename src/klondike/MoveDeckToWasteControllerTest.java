package klondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveDeckToWasteControllerTest {
	
	private StartGameController startGameController;
	private MoveDeckToWasteController moveDeckToWasteController;	
	
	@Before
 	public void before(){
 		startGameController = new StartGameController();
 		moveDeckToWasteController = new MoveDeckToWasteController(startGameController);
 	}

	@Test
	public void moveTest() {
				
		assertEquals(startGameController.sizeDeck(), 24 );		
		
	}
	
	
	public void moveTestSizeDeckGreatThanThree()
	{
		int sizeDeck, sizeWaste;
		sizeDeck = startGameController.sizeDeck();
		sizeWaste = startGameController.sizeWaste();
		
		assertEquals(startGameController.sizeWaste(), 0 );
		moveDeckToWasteController.move();
		assertEquals(startGameController.sizeDeck(), (sizeDeck - 3) );
		assertEquals(startGameController.sizeWaste(), (sizeWaste + 3) );
	}
	
	public void moveTestSizeDeckGreatThanZero()
	{
		int sizeDeck, sizeWaste;
		
		startGameController.setSizeDeck(1);
		sizeDeck = startGameController.sizeDeck();
		sizeWaste = startGameController.sizeWaste();
		moveDeckToWasteController.move();
		assertEquals(startGameController.sizeDeck(), 0);
		assertEquals(startGameController.sizeWaste(), (sizeWaste + sizeDeck));
	}
	
	public void moveTestSizeDeckEqualsZero()
	{
		int sizeWaste;
		startGameController.setSizeDeck(0);
		sizeWaste = startGameController.sizeWaste();
		moveDeckToWasteController.move();
		assertEquals(startGameController.sizeDeck(), 0);
		assertEquals(startGameController.sizeWaste(), sizeWaste);

		
	}
	

}
