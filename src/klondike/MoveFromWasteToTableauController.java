package klondike;

import java.util.Stack;

public class MoveFromWasteToTableauController {
	private StartGameController startGameController;

	public MoveFromWasteToTableauController(StartGameController startGameController) {
		this.startGameController = startGameController;
	}

	public boolean moveFromWasteToTableau(int tableau) {
		Stack<Card> tableauCard = startGameController.getTableauCard(tableau);
 		Card wasteCard = startGameController.oneCardFromWaste();
 		
 		if( (tableauCard.size() == 0) && (wasteCard.getCard() == 12)){
 					return moveToTableau(tableau, wasteCard);
 		}
 		else if(tableauCard.size() > 0)
 					return tableauCardSizeGreatThanZero(tableau, tableauCard, wasteCard);		
 			 			
		return false;
	}
	
		
	public boolean tableauCardSizeGreatThanZero(int tableau, Stack<Card> tableauCard, Card wasteCard){
			Card lastCardTableau = tableauCard.peek();
			if((lastCardTableau.getCard()==(wasteCard.getCard()+1))
					&&(lastCardTableau.getColorCard()!=wasteCard.getColorCard())){
				return moveToTableau(tableau, wasteCard);
			}
			
			return false;
	}
	
	
	public boolean moveToTableau(int tableau, Card card){
			startGameController.addCardToTableau(tableau, card);
			startGameController.removeCardFromWaste();
			return true;
	}
	
	
	
	

}
