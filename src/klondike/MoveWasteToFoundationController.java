package klondike;

import java.util.Stack;

public class MoveWasteToFoundationController {
		private StartGameController startGameController;
	
		public MoveWasteToFoundationController(StartGameController startGameController)			
		{
			this.startGameController = startGameController;
		}

		public boolean move(int foundation) {
			
					if (startGameController.getSizeWaste() == 0) return false;
					
					Card wasteCard = startGameController.oneCardFromWaste();
										
					Stack<Card> foundationCard = startGameController.getFoundationCards(foundation);
					if(foundationCard.size() > 0){
						Card lastFoundationCard = foundationCard.peek();
						if( (wasteCard.getCard() == lastFoundationCard.getCard() + 1) 
								&& (wasteCard.getCardSuit() == lastFoundationCard.getCardSuit())){
							startGameController.addCardToFoundation(foundation, wasteCard);
							startGameController.removeCardFromWaste();
							return true;
						}
					}
					else 
					if(wasteCard.getCard() == 1){
						startGameController.addCardToFoundation(foundation, wasteCard);
						startGameController.removeCardFromWaste();
						return true;
					}
					
					return false;
			
		}
	
		
}
