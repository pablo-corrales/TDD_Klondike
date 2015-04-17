package klondike;

import java.util.ArrayList;

public class StartGameController {

	public int sizeWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Integer> sizeFoundations() {
			ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
					sizeFoundations.add(0);
			}
			return sizeFoundations;
	}

}
