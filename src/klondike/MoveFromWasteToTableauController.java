package klondike;

import java.util.Stack;

public class MoveFromWasteToTableauController {
	private StartGameController startGameController;
	private Card wasteCard;

	public MoveFromWasteToTableauController(StartGameController startGameController) {
		this.startGameController = startGameController;
		
	}

	public boolean moveFromWasteToTableau(int tableau) {
		this.wasteCard = startGameController.oneCardFromWaste();
		Stack<Card> tableauCard = this.startGameController.getTableauCard(tableau);		
 		if( (tableauCard.size() == 0) && (wasteCard.getCard() == 12)){
 					return moveToTableau(tableau);
 		}
 		else if(tableauCard.size() > 0)
 					return tableauCardSizeGreatThanZero(tableau, tableauCard);		
 			 			
		return false;
	}
	
		
	public boolean tableauCardSizeGreatThanZero(int tableau, Stack<Card> tableauCard){
			Card lastCardTableau = tableauCard.peek();
			if(sameLastCardTableuAndWaste(lastCardTableau)
					&&(sameColorLastCardWasteAndTableau(lastCardTableau))){
				return moveToTableau(tableau);
			}
			
			return false;
	}
	
	
	public boolean sameLastCardTableuAndWaste(Card lastCardTableau){
		
		if ( lastCardTableau.getCard() == (wasteCard.getCard()+1) )
			return true;
		
		return false;				
	}
	
	
	
	public boolean sameColorLastCardWasteAndTableau(Card lastCardTableau){
		if (lastCardTableau.getColorCard() != wasteCard.getColorCard())
			return true;
		return false;
	}
	
	
	public boolean moveToTableau(int tableau){
			this.startGameController.addCardToTableau(tableau, wasteCard);
			this.startGameController.removeCardFromWaste();
			return true;
	}
	
	
	
	

}
