package klondike;

public class Card {
	private int qtyCard;
	CardSuit cardSuit;
	
	public int getQtyCard() {
		return qtyCard;
	}

	public void setQtyCard(int qtyCard) {
		this.qtyCard = qtyCard;
	}
	
	public Card(int qtyCard) {
		this.qtyCard = qtyCard;
	}

	public Card(int qtyCard, CardSuit cardSuit) {
		this.qtyCard = qtyCard;
		this.cardSuit = cardSuit;
	}

	public boolean uncovered() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
