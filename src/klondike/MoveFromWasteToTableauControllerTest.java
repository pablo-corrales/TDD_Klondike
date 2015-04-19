package klondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveFromWasteToTableauControllerTest {
	private static final int TABLEAU = 1;
	private static final int FOUNDATION = 1;
	private MoveFromWasteToTableauController moveFromWasteToTableauController;
 	private StartGameController startGameController;
 	
 	
 	
 	@Before
 	public void before() {
 		
 		startGameController = new StartGameController();
 		moveFromWasteToTableauController = new MoveFromWasteToTableauController(startGameController);
 		
 		
 	}
 	
 	@Test
 	public void moveFromWasteToTableauTest(){
 			startGameController.addCardToWaste(new Card(2, CardSuit.SPADES));
						
			assertTrue(moveFromWasteToTableauController.moveFromWasteToTableau(TABLEAU));
			
			// En tableua está una carta 
			assertEquals(1, startGameController.getTableauCard(TABLEAU).size());
			
			// Waste queda vacío
			assertEquals(0, startGameController.sizeWaste());

 			
 			
 	}
 	
 	

}
