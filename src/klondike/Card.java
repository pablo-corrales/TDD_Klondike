package klondike;

public class Card {
	private int card;
	private CardSuit cardSuit;
	private Color colorCard;
	
	
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
		this.colorCard =  ((cardSuit == CardSuit.SPADES) || (cardSuit == CardSuit.CLUBS)) ? Color.BLACK : Color.RED;
	}
					

	public boolean uncovered() {
		
		return true;
	}
	
	public CardSuit getCardSuit() {
		return cardSuit;
	}
	
	public Color getColorCard() {
		return colorCard;
	}

	public void setColorCard(Color colorCard) {
		this.colorCard = colorCard;
	}

	
}
