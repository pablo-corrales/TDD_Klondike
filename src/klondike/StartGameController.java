package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {
	
	private static final int SIZE_DECK = 24;
	private static final int SIZE_WASTE = 0;
	private static final int TABLEAUS = 7;
	private static final int FOUNDATIONS = 4;
	private ArrayList<Stack<Card>> stackFoundations;
	private Stack<Card> stackWaste;
	
	private int sizeDeck;
	private int sizeWaste;
		
	public StartGameController(){
		
			sizeDeck = SIZE_DECK;
			sizeWaste = SIZE_WASTE;
			stackFoundations = new ArrayList<Stack<Card>>(FOUNDATIONS);
			for(int i = 0; i < FOUNDATIONS; i++){
						stackFoundations.add(new Stack<Card>());
			}
			setStackWaste(new Stack<Card>());
	}
	

	public void setSizeDeck(int sizeDeck) {
		this.sizeDeck = sizeDeck;
	}


	public void setSizeWaste(int sizeWaste) {
		this.sizeWaste = sizeWaste;
	}

	public int sizeWaste() {
		return stackWaste.size();
	}
	
	public int sizeDeck() {
		return sizeDeck;
	}

	public Card oneCardInWaste() {
		return stackWaste.peek();
	}
	
	public ArrayList<Integer> sizeFoundations() {
			ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
			for (int i = 0; i < FOUNDATIONS; i++) {
					sizeFoundations.add(0);
			}
			return sizeFoundations;
	}

	
	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0; i < TABLEAUS; i++) {
					Stack<Card> uncoveredCardsStack = new Stack<Card>();
					uncoveredCardsStack.add(new Card(0));
					uncoveredCardsStackTableaus.add(uncoveredCardsStack);
		}
		return uncoveredCardsStackTableaus;
	}

	public ArrayList<Integer> sizeCoveredCardsTableaus() {
		ArrayList<Integer> sizeTableaus = new ArrayList<Integer>();
				for (int i = 0; i < TABLEAUS; i++) {
					sizeTableaus.add(i+1);
		}
		return sizeTableaus;
	}


	public void addCardToWaste(Card card) {
		stackWaste.push(card);
		
	}
	
	public void removeCardFromWaste() {
			stackWaste.pop();
	}


	public void addCardToFoundation(int foundation, Card card) {
		this.getFoundationCards(foundation).add(card);
		
	}


	public Stack<Card> getFoundationCards(int foundation ) {
		return this.stackFoundations.get(foundation);
	}


	public void setStackWaste(Stack<Card> stackWaste) {
		this.stackWaste = stackWaste;
	}
	
	public int getSizeWaste() {
		return sizeWaste;
	}


}
