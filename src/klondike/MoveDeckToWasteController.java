package klondike;

public class MoveDeckToWasteController {
	
			private StartGameController startGameController;
		
			public MoveDeckToWasteController(StartGameController startGameController) {
				this.startGameController = startGameController;
			}
		
			public void move() {
				int sizeDeck = startGameController.sizeDeck();
		 		int sizeWaste = startGameController.sizeWaste();
				
				if( sizeDeck >= 3){
					setSizeDeckAndWaste(sizeDeck-3,sizeWaste+3);	
				}
				else 		
					if( sizeDeck > 0){
						setSizeDeckAndWaste(0,sizeWaste + sizeDeck);
					}
				
			}
			
			
			public void setSizeDeckAndWaste(int sizeDeck, int sizeWaste){
				startGameController.setSizeDeck(sizeDeck - 3);
				startGameController.setSizeWaste(sizeWaste + 3);
			
			}
			
			

}
