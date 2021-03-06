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
									
			startGameController.addCardToWaste(new Card(2, CardSuit.SPADES));	
			
			startGameController.addCardToFoundation(FOUNDATION, new Card(1, CardSuit.SPADES));		
			Stack<Card> foundation = startGameController.getFoundationCards(FOUNDATION);
			
			foundationSize = foundation.size();
			sizeWaste = startGameController.sizeWaste();
			assertEquals(1, startGameController.sizeWaste());
			
			assertTrue(moveWasteToFoundationController.move(FOUNDATION));
			
			assertEquals(sizeWaste-1, startGameController.sizeWaste());
			assertEquals(foundationSize+1, startGameController.getFoundationCards(FOUNDATION).size());
		}
		
		@Test
	 	public void moveNoCardInWasteOneCardFoundationTest(){
									
			startGameController.addCardToWaste(new Card(1, CardSuit.SPADES));
			moveWasteToFoundationController.move(FOUNDATION);
			
			Stack<Card> foundationCard = startGameController.getFoundationCards(FOUNDATION);
			Card lastFoundationCard = foundationCard.peek();
			
			assertEquals(1,lastFoundationCard.getCard());
						
			assertEquals(0,startGameController.sizeWaste());
		
	
	 	}
		
		
}
