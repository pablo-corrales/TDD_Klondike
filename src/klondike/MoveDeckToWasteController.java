package klondike;

public class MoveDeckToWasteController {
	
			private StartGameController startGameController;
		
			public MoveDeckToWasteController(StartGameController startGameController) {
				this.startGameController = startGameController;
			}
		
			public void move() {
				
				startGameController.setSizeDeck(startGameController.sizeDeck() - 3);
				startGameController.setSizeWaste(startGameController.sizeWaste() + 3);
				
			}

}
