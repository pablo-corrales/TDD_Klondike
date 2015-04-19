package klondike;

import java.util.Stack;

public class MoveWasteToFoundationController {
		private StartGameController startGameController;
		private Card wasteCard;
		private int foundation;
	
		public MoveWasteToFoundationController(StartGameController startGameController)			
		{
			this.startGameController = startGameController;
			
		}

		public boolean move(int foundation) {
					this.wasteCard = startGameController.oneCardFromWaste();
			
					if (startGameController.getSizeWaste() == 0) return false;
					this.foundation = foundation;
					
					Stack<Card> foundationCard = startGameController.getFoundationCards(foundation);
										
					if(foundationCard.size() > 0)					
						return foundationCardSizeGreatThanZero(foundationCard);
					else
						return foundationCardSizeLessThanZero();
				
			
		}

		public boolean foundationCardSizeGreatThanZero(Stack<Card> foundationCard){

					Card lastFoundationCard = foundationCard.peek();	
					
					if( (wasteCard.getCard() == lastFoundationCard.getCard() + 1) 
							&& (wasteCard.getCardSuit() == lastFoundationCard.getCardSuit())){
						addCardFoundationRemoveWaste();
						return true;
					}
					return false;
		
		}
		
		
		public boolean foundationCardSizeLessThanZero(){
					if(wasteCard.getCard() == 1){
							addCardFoundationRemoveWaste();
							return true;
					}
					
					return false;
		}
		
		
		public void addCardFoundationRemoveWaste()
		{
			startGameController.addCardToFoundation(foundation, wasteCard);
			startGameController.removeCardFromWaste();
		}
	
		
}
