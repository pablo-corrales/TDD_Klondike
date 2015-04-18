package klondike;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class MoveWasteToFoundationControllerTest {
		private static final int FOUNDATION = 1;
		private StartGameController startGameController;
		private MoveWasteToFoundationController moveWasteToFoundationController;
		
		
		@Before
		public void before(){
			startGameController = new StartGameController();
			moveWasteToFoundationController = new MoveWasteToFoundationController(startGameController);
		}
		
		@Test
		public void moveTest(){
			int foundationSize;
			int sizeWaste;
									
			startGameController.addCardToWaste(new Card(6, CardSuit.SPADES));		
			startGameController.addCardToFoundation(FOUNDATION, new Card(1, CardSuit.HEARTS));
			
			Stack<Card> foundation = startGameController.getFoundationCards(FOUNDATION);
			
			foundationSize = foundation.size() + 1;
			sizeWaste = startGameController.sizeWaste() - 1;
			
			assertTrue(moveWasteToFoundationController.move(FOUNDATION));
			assertEquals(sizeWaste, startGameController.sizeWaste());
			assertEquals(foundationSize, startGameController.getFoundationCards(FOUNDATION).size());
		}

}
