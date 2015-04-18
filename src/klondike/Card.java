package klondike;

public class Card {
	private int card;
	CardSuit cardSuit;
	
	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}
	
	public Card(int card) {
		this.card = card;
	}

	public Card(int card, CardSuit cardSuit) {
		this.card = card;
		this.cardSuit = cardSuit;
	}

	public boolean uncovered() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public CardSuit getCardSuit() {
		return cardSuit;
	}

	
}
