package klondike;

import java.util.ArrayList;
import java.util.Stack;

public class StartGameController {
	private static final int TABLEAUS = 7;
	
	private int sizeDeck;
	private int sizeWaste;
		
	public StartGameController(){
			sizeDeck = 24;
			sizeWaste = 0;
	}
	

	public void setSizeDeck(int sizeDeck) {
		this.sizeDeck = sizeDeck;
	}


	public void setSizeWaste(int sizeWaste) {
		this.sizeWaste = sizeWaste;
	}

	public int sizeWaste() {
		return sizeWaste;
	}
	
	public int sizeDeck() {
		return sizeDeck;
	}

	public ArrayList<Integer> sizeFoundations() {
			ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
					sizeFoundations.add(0);
			}
			return sizeFoundations;
	}

	
	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for (int i = 0; i < TABLEAUS; i++) {
					Stack<Card> uncoveredCardsStack = new Stack<Card>();
					uncoveredCardsStack.add(new Card());
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

}
