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
										
					if(foundationCard.size() > 0)					
						return foundationCardSizeGreatThanZero(foundation, foundationCard, wasteCard);
					else
						return foundationCardSizeLessThanZero(foundation, wasteCard);
				
			
		}

		public boolean foundationCardSizeGreatThanZero(int foundation, Stack<Card> foundationCard, Card wasteCard){

					Card lastFoundationCard = foundationCard.peek();	
					
					if( (wasteCard.getCard() == lastFoundationCard.getCard() + 1) 
							&& (wasteCard.getCardSuit() == lastFoundationCard.getCardSuit())){
						addCardFoundationRemoveWaste(foundation, wasteCard);
						return true;
					}
					return false;
		
		}
		
		
		public boolean foundationCardSizeLessThanZero(int foundation, Card wasteCard){
					if(wasteCard.getCard() == 1){
							addCardFoundationRemoveWaste(foundation, wasteCard);
							return true;
					}
					
					return false;
		}
		
		
		public void addCardFoundationRemoveWaste(int foundation, Card wasteCard)
		{
			startGameController.addCardToFoundation(foundation, wasteCard);
			startGameController.removeCardFromWaste();
		}
	
		
}
