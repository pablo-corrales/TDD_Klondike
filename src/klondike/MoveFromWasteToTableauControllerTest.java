package klondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveFromWasteToTableauControllerTest {
	private static final int TABLEAU = 1;
	private MoveFromWasteToTableauController moveFromWasteToTableauController;
 	private StartGameController startGameController;
 	
 	
 	
 	@Before
 	public void before() {
 		
 		startGameController = new StartGameController();
 		moveFromWasteToTableauController = new MoveFromWasteToTableauController(startGameController);
 		
 		
 	}
 	
 
 	@Test
 	public void moveFromWasteToTableauTest(){
 		
 			startGameController.addCardToWaste(new Card(12, CardSuit.SPADES));
 									
			assertTrue(moveFromWasteToTableauController.moveFromWasteToTableau(TABLEAU));			
			assertEquals(1, startGameController.getTableauCard(TABLEAU).size());	
			assertEquals(0, startGameController.sizeWaste());
				
 	}
 	
 	@Test
 	public void allowedMoveFromWasteToTableauTest(){
 		
			startGameController.addCardToTableau(TABLEAU, new Card(12, CardSuit.HEARTS));
			startGameController.addCardToWaste(new Card(11, CardSuit.SPADES));	
			
			assertTrue(moveFromWasteToTableauController.moveFromWasteToTableau(TABLEAU));
			
			assertEquals(2, startGameController.getTableauCard(TABLEAU).size());	
			assertEquals(0, startGameController.sizeWaste());
				
 	}
 	
 	@Test
 	public void notAllowedMoveFromWasteToTableauTest(){
 		
 		
 			startGameController.addCardToWaste(new Card(4, CardSuit.SPADES));
						
			assertFalse(moveFromWasteToTableauController.moveFromWasteToTableau(TABLEAU));			
			assertEquals(0, startGameController.getTableauCard(TABLEAU).size());	
			assertEquals(1, startGameController.sizeWaste());
		
 	}
 
 	

 	 	 	
}
