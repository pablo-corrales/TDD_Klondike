package klondike;

import org.junit.Before;
import org.junit.Test;

public class MoveFromWasteToTableauControllerTest {
	private MoveFromWasteToTableauController moveFromWasteToTableauController;
 	private StartGameController startGameController;
 	
 	
 	
 	@Before
 	public void before() {
 		
 		startGameController = new StartGameController();
 		moveFromWasteToTableauController = new MoveFromWasteToTableauController(startGameController);
 		
 		
 	}
 	
 	@Test
 	public void moveFromWasteToTableauTest(){
 			
 			
 	}
 	
 	

}
